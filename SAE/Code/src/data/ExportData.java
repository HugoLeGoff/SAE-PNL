package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportData {

    private String fileName;
    private int annee;
    private String espece;
    private String tableName;
    private String fileDirectory;
    private int nbColonnes;



    public ExportData(String name, String annee, String espece,String directory) {
        this.annee=Integer.valueOf(annee);
        this.espece=espece;
        this.fileName = name;
        this.fileDirectory+=directory;

        
    }
    public ExportData(String name, String annee, String espece) {
        this.annee=Integer.valueOf(annee);
        this.espece=espece;
        this.fileName = name;
        this.fileDirectory="C:\\";

        
    }
    
    public String requete(){
        String ret="";
        if(espece=="Hippocampe"){
            ret="SELECT * FROM "+tableName+" JOIN Observation ON obsH = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="GCI"){
            ret="SELECT * FROM "+tableName+" JOIN Observation ON obsG = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="Loutre"){
            ret="SELECT * FROM "+tableName+" JOIN Observation ON obsL = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="Batracien"){
            ret="SELECT * FROM Obs_Batracien JOIN Observation ON obsB = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur JOIN ZoneHumide ON concerne_ZH = zh_id JOIN Vegetation ON concernes_vege = idVege JOIN Lieu_Vegetation ON idVegeLieu = decrit_LieuVege;";
        }else if(espece=="Chouette"){
            ret="SELECT * FROM "+tableName+" JOIN Observation ON obsC = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }
        return ret;
    }
    public String printColonnes(){
        String ret="";
        if(espece=="Hippocampe"){
            ret="idObs,dateObs,idObservateur,nomObservateur,prenomObservateur,obsH,idA,nomA,prenomA,idObsH,idObsG,idObsL,idObsB,idObsC";
        }else if(espece=="GCI"){
            ret="idObs,dateObs,idObservateur,nomObservateur,prenomObservateur,obsG,idA,nomA,prenomA,idObsH,idObsG,idObsL,idObsB,idObsC";
        }else if(espece=="Loutre"){
            ret="idObs,dateObs,idObservateur,nomObservateur,prenomObservateur,obsL,idA,nomA,prenomA,idObsH,idObsG,idObsL,idObsB,idObsC";
        }else if(espece=="Batracien"){
            nbColonnes=32;
            ret="obsB;espece;nombreAdultes;nombreAmplexus;nombrePonte;nombreTetard;temperature;meteo_ciel;meteo_temp;meteo_vent;meteo_pluie;concerne_ZH;concerne_vege;idObs,dateObs,heureObs;lieu_Lambert_X;lieu_Lambert_Y;lobservateur;lobservation;idObservateur;nom;prenom;zh_id;zh_temporaire;zh_surface;zh_typeMare;zh_pente;zh_ouverture;idVege;natureVege;vegetation;decrit_LieuVege_idVege;idVegeLieu";
        }else if(espece=="Chouette"){
            ret="idObs,dateObs,idObservateur,nomObservateur,prenomObservateur,obsC,idA,nomA,prenomA,idObsH,idObsG,idObsL,idObsB,idObsC";
        }
        return ret;
    }
    public void exportData() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt2 = c.createStatement();
       
            ResultSet res2 = stmt2.executeQuery(requete());
            PrintWriter writer = new PrintWriter(new File(fileDirectory+fileName));
            writer.print(printColonnes());
            writer.print("\n");
            while(res2.next()) {
                for(int i = 1; i <= nbColonnes; i++) {
                    writer.print(res2.getString(i) + ";");
                }
                writer.print("\n");

            }
            writer.close();
            c.close();
        } catch(Exception e) {
            System.out.println(e);
        }



    }
}