package modele;
import donnee.*;
import java.util.*;

import javax.naming.directory.NoSuchAttributeException;

import java.sql.Time;
import java.sql.Date;


public class ScenarioDonnee {
    public static void main(String[] args){
        testConstructeur();

        java.sql.Date d = new java.sql.Date(0);
        d = d.valueOf("2015-05-03");
        java.sql.Time t = new Time(3000);
        Lieu l = new Lieu(50, 50);
        Observateur obsBen1 = new Observateur(1, "Hugo", "Le Goff");
        Observateur obsBen2 = new Observateur(1, "Lucas", "Torri");
        ArrayList<Observateur> listeObs = new ArrayList<Observateur>();
        listeObs.add(obsBen1);
        listeObs.add(obsBen2);

        int[] bat = new int[]{1,2,3,4};
        

        testObsChouette(d, t, l, listeObs, TypeObservation.VISUELLE);
        testObsGCI(d, t, l, listeObs, ContenuNid.POUSSIN, 5);
        testObsBatracien(d, t, l, listeObs, bat, EspeceBatracien.PELODYTE);
        testObsLoutre(d, t, l, listeObs,IndiceLoutre.POSITIF);
        testObsHippocampes(d, t, l, listeObs, 5.0, Peche.CASIER_CREVETTES, EspeceHippocampes.SYNGNATHUS_ACTUS, Sexe.MALE, true);
        testLieu(5.0, 6.0);



    }

    public static void testConstructeur(){

        java.sql.Date d = new java.sql.Date(0);
        d = d.valueOf("2015-05-03");
        java.sql.Time t = new Time(3000);
        Lieu l = new Lieu(50, 50);
        Observateur obsBen1 = new Observateur(1, "Hugo", "Le Goff");
        Observateur obsBen2 = new Observateur(1, "Lucas", "Torri");
        ArrayList<Observateur> listeObs = new ArrayList<Observateur>();
        listeObs.add(obsBen1);
        listeObs.add(obsBen2);

        int[] tab = new int[]{1,2,3,4};

        System.out.println("*** Test des cas normaux du constructeur");

        try{
            ObsBatracien batracien = new ObsBatracien(5, d, t, l, listeObs, tab, EspeceBatracien.PELODYTE);
            System.out.println("Constructeur ObsBatracien : OK");
        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            ObsChouette chouette = new ObsChouette(5, d, t, l, listeObs, TypeObservation.VISUELLE);
            System.out.println("Constructeur ObsChouette : OK");
        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            ObsLoutre loutre = new ObsLoutre(5, d, t, l, listeObs, IndiceLoutre.POSITIF);
            System.out.println("Constructeur ObsLoutre : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            ObsGCI gci = new ObsGCI(5, d, t, l, listeObs, ContenuNid.POUSSIN, 5);
            System.out.println("Constructeur ObsGCI : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            ObsHippocampes hippocampes = new ObsHippocampes(5, d, t, l, listeObs, 5.0, Peche.CASIER_CREVETTES, EspeceHippocampes.SYNGNATHUS_ACTUS, Sexe.MALE, true);
            System.out.println("Constructeur ObsHippocampe : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }
        
        




    }

    public static void testObservation(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs,IndiceLoutre lIndice){
        System.out.println("Test des cas normaux de la classe Observation");
        ObsLoutre loutre = new ObsLoutre(5, d, t, l, obs, lIndice);      
        
        System.out.print (loutre.getDateObs());
        if(loutre.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }

        System.out.print(loutre.getHeureObs());
        if(loutre.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: ERROR");
        }

        System.out.print(loutre.getLieuObs());
        if(loutre.getLieuObs().equals(l)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }

        System.out.print(loutre.getLesObservateurs());
        if(loutre.getLesObservateurs().equals(obs)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }
    }

    public static void testChouette(String id, Sexe leSexe, EspeceChouette IEspece){
        /*Chouette chouette = new Chouette(id, leSexe, IEspece);

        System.out.print(chouette.getEspece());
        if(batracien.getNombreAdultes() == tab[0]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }*/
        

    }

    public static void testLieu(double x, double y){
        System.out.println("*** Test cas normaux de Lieu");

        Lieu lieu = new Lieu(x, y);

        System.out.print(lieu.getxCoord());
        if(lieu.getxCoord() == x){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(lieu.getyCoord());
        if(lieu.getyCoord() == x){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        
    }

    public static void testNidGCI(){
        
    }

    public static void testObsBatracien(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, int[] tab, EspeceBatracien espece){
        System.out.println("*** Test cas normaux de Obsbatracien");


        ObsBatracien batracien = new ObsBatracien(5, d, t, l, obs, tab, espece);
        

        System.out.print(batracien.getNombreAdultes());
        if(batracien.getNombreAdultes() == tab[0]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(batracien.getNombreAmplexus());
        if(batracien.getNombreAmplexus()== tab[1]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(batracien.getNombrePonte());
        if(batracien.getNombrePonte()== tab[2]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(batracien.getNombreTetard());
        if(batracien.getNombreTetard()== tab[3]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(batracien.getEspece());
        if(batracien.getEspece().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }
    }



    public static void testObsChouette(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        System.out.println("*** Test cas normaux de ObsChouettes");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);

        System.out.print(chouette.getTypeObs());
        if(chouette.getTypeObs().equals(type)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }
    }



    public static void testObservateur(){
        
    }


    public static void testObsGCI(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, ContenuNid nature, int nb){
        System.out.println("*** Test cas normaux de ObsGCI");

        ObsGCI gci = new ObsGCI(5, d, t, l, obs, nature, nb);

        System.out.print(gci.getNatureObs());
        if(gci.getNatureObs().equals(nature)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(gci.getNombre());
        if(gci.getNombre() == nb){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }


        
    }

    public static void testObsHippocampes(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, double laTaille, Peche leTypePeche, EspeceHippocampes lEspece, Sexe leSexe, boolean estGestant){
        ObsHippocampes hippocampes = new ObsHippocampes(5, d, t, l, obs, laTaille, Peche.CASIER_CREVETTES, EspeceHippocampes.SYNGNATHUS_ACTUS, Sexe.MALE, estGestant);

    }

    public static void testObsLoutre(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs,IndiceLoutre lIndice){
        
        ObsLoutre loutre = new ObsLoutre(5, d, t, l, obs, lIndice);      
        
        System.out.print(loutre.getIndice());
        if(loutre.getIndice().equals(lIndice)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }

    }
}
