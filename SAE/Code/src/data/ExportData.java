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
        this.fileDirectory="C:\\Users\\public\\Downloads\\";//directory de base vers Utilisateur/public/telechargements

        
    }
    
    public String requete(){
        String ret="";
        if(espece=="Hippocampe"){
            ret="SELECT obsH,espece,sexe,temperatureEau,typePeche,taille,gestant,dateObs,heureObs,lieu_Lambert_X,lieu_Lambert_Y,idObservateur,nom,prenom FROM Obs_hippocampe LEFT JOIN Observation ON obsH = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="GCI"){
            ret="SELECT obsG,nature,nombre,presentMaisNonObs,idNid,nomPlage,raisonArretObservation,nbEnvol,protection,bagueMale,bagueFemelle,dateObs,heureObs,lieu_Lambert_X,lieu_Lambert_Y,idObservateur,nom,prenom FROM obs_GCI LEFT JOIN Nid_GCI ON idNid=leNid LEFT JOIN Observation ON obsG = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="Loutre"){
            ret="SELECT obsL,commune,lieuDit,indice,idObs,dateObs,heureObs,lieu_Lambert_X,lieu_Lambert_Y,idObservateur,nom,prenom FROM obs_Loutre JOIN Observation ON obsL = idObs JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="Batracien"){
            ret="SELECT obsB,espece,nombreAdultes,nombreAmplexus,nombrePonte,nombreTetard,temperature,meteo_ciel,meteo_temp,meteo_vent,meteo_pluie,concerne_ZH,concernes_vege,dateObs,heureObs,lieu_Lambert_X,lieu_Lambert_Y,idObservateur,nom,prenom,zh_temporaire,zh_surface,zh_typeMare,zh_pente,zh_ouverture,natureVege,vegetation,decrit_LieuVege,idVegeLieu FROM Obs_Batracien JOIN Observation ON obsB = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur JOIN ZoneHumide ON concerne_ZH = zh_id JOIN Vegetation ON concernes_vege = idVege JOIN Lieu_Vegetation ON idVegeLieu = decrit_LieuVege WHERE YEAR (dateObs) = "+annee+";";
        }else if(espece=="Chouette"){
            ret="SELECT idObs,protocole,typeObs,leNumIndividu,numObs,numIndividu,espece,sexe,dateObs,heureObs,lieu_Lambert_X,lieu_Lambert_Y,idObservateur,nom,prenom FROM Obs_Chouette JOIN Chouette ON numIndividu=leNumIndividu JOIN Observation ON numObs=idObs JOIN Lieu ON (lieu_Lambert_X,lieu_Lambert_Y)=(coord_Lambert_X,coord_Lambert_Y) LEFT JOIN Aobserve ON idObs =lobservation LEFT JOIN observateur ON lobservateur = idObservateur WHERE YEAR (dateObs) = "+annee+";";
        }
        return ret;
    }
    public String printColonnes(){
        String ret="";
        if(espece=="Hippocampe"){
            nbColonnes=14;
            ret="obsH;espece;sexe;temperatureEau;typePeche;taille;gestant;dateObs;heureObs;lieu_Lambert_X;lieu_Lambert_Y;idObservateur;nom;prenom";
        }else if(espece=="GCI"){
            nbColonnes=18;
            ret="obsG;nature;nombre;presentMaisNonObs;idNid;nomPlage;raisonArretObservation;nbEnvol;protection;bagueMale;bagueFemelle;dateObs;heureObs;lieu_Lambert_X;lieu_Lambert_Y;idObservateur;nom;prenom";
        }else if(espece=="Loutre"){
            nbColonnes=12;
            ret="obsL;commune;lieuDit;indice;idObs;dateObs;heureObs;lieu_Lambert_X;lieu_Lambert_Y;idObservateur;nom;prenom";
        }else if(espece=="Batracien"){
            nbColonnes=29;
            ret="obsB;espece;nombreAdultes;nombreAmplexus;nombrePonte;nombreTetard;temperature;meteo_ciel;meteo_temp;meteo_vent;meteo_pluie;concerne_ZH;concerne_vege;dateObs;heureObs;lieu_Lambert_X;lieu_Lambert_Y;idObservateur;nom;prenom;zh_temporaire;zh_surface;zh_typeMare;zh_pente;zh_ouverture;natureVege;vegetation;decrit_LieuVege_idVege;idVegeLieu";
        }else if(espece=="Chouette"){
            nbColonnes=15;
            ret="idObs;protocole;typeObs;leNumIndividu;numObs;numIndividu;espece;sexe;dateObs;heureObs;lieu_Lambert_X;lieu_Lambert_Y;idObservateur;nom;prenom";
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