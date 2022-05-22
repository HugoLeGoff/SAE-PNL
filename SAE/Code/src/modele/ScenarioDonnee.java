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
        
        testObservation(d, t, l, listeObs,IndiceLoutre.POSITIF);
        testObsChouette(d, t, l, listeObs, TypeObservation.VISUELLE);
        testObsGCI(d, t, l, listeObs, ContenuNid.POUSSIN, 5);
        testObsBatracien(d, t, l, listeObs, bat, EspeceBatracien.PELODYTE);
        testObsLoutre(d, t, l, listeObs,IndiceLoutre.POSITIF);
        testObsHippocampes(d, t, l, listeObs, 5.0, Peche.CASIER_CREVETTES, EspeceHippocampes.SYNGNATHUS_ACTUS, Sexe.MALE, true);
        testLieu(5.0, 6.0);
        testNidGCI(d, t, l, listeObs, ContenuNid.POUSSIN, 5);
        testChouette(d, t, l, listeObs, TypeObservation.VISUELLE);

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
        
        try{
            Lieu lieu = new Lieu(5.0, 6.0);
            System.out.println("Constructeur Lieu : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            Observateur observateur = new Observateur(1, "LE GOFF", "Hugo");
            System.out.println("Constructeur Observateur : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            NidGCI nid = new NidGCI(1, "Kerbilouet");
            System.out.println("Constructeur NidGCI : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            NidGCI nid = new NidGCI(1, "Kerbilouet");
            System.out.println("Constructeur NidGCI : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        try{
            Chouette chouette = new Chouette("1", Sexe.MALE, EspeceChouette.EFFRAIE);
            System.out.println("Constructeur Chouette : OK");

        }
        catch(Exception e){
            e.printStackTrace(); 
        }
    
    }

    public static void testObservation(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs,IndiceLoutre lIndice){
        System.out.println();
        System.out.println("*** Test de la classe Observation");
        ObsLoutre loutre = new ObsLoutre(5, d, t, l, obs, lIndice);      
        
        
        d = d.valueOf("2016-05-03");
        loutre.setDateObs(d);
        System.out.print (loutre.getDateObs());
        if(loutre.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }

        t.setTime(4000);
        loutre.setHeureObs(t);
        System.out.print(loutre.getHeureObs());
        if(loutre.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: ERROR");
        }

        l.setxCoord(-5);
        l.setyCoord(6);
        loutre.setLieuObs(l);
        System.out.print(loutre.getLieuObs());
        if(loutre.getLieuObs().equals(l)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }

        Observateur obsTest = new Observateur(3, "Nolan", "Jametti");
        obs.add(obsTest);
        loutre.setLesObservateurs(obs);
        System.out.print(loutre.getLesObservateurs());
        if(loutre.getLesObservateurs().equals(obs)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: ERROR");
        }
    }

    public static void testChouette(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        System.out.println();
        System.out.println("*** Test de la classe Chouette");

        java.sql.Date d2 = new java.sql.Date(0);
        d2 = d2.valueOf("2016-05-03");
        
        ObsChouette obsChouette = new ObsChouette(5, d, t, l, obs, TypeObservation.VISUELLE);
        ObsChouette obsChouette1 = new ObsChouette(6, d, t, l, obs, TypeObservation.VISUELLE);
        ObsChouette obsChouette2 = new ObsChouette(7, d, t, l, obs, TypeObservation.VISUELLE);

        Chouette chouette = new Chouette("1", Sexe.MALE, EspeceChouette.EFFRAIE);

        ArrayList<ObsChouette> listeObs = new ArrayList<ObsChouette>();
        listeObs.add(obsChouette1);
        listeObs.add(obsChouette2);
        
        chouette.ajoutePlsObs(listeObs);
        chouette.ajouteUneObs(obsChouette);
        
        System.out.print("Nombre d'observations : " + chouette.nbObs());
        if(chouette.nbObs() == 3){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }


        boolean test = chouette.retireObs(2);
        System.out.print("Test de la méthode retirObs()");
        if(test == true){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print("Nombre d'observations : " + chouette.nbObs());
        if(chouette.nbObs() == 2){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        chouette.videObs();
        System.out.println("Test de la méthode videObs ");
        System.out.print("Nombre d'observations : " + chouette.nbObs());
        if(chouette.nbObs() == 0){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.println("*** Test cas d'erreur, ajout du même observateur ");
        chouette.ajouteUneObs(obsChouette2);
        chouette.ajouteUneObs(obsChouette2);
        System.out.print("Nombre d'observations : " + chouette.nbObs());
        if(chouette.nbObs() == 1){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }


    }

    public static void testLieu(double x, double y){
        System.out.println();
        System.out.println("*** Test de la classe Lieu");

        Lieu lieu = new Lieu(x, y);

        System.out.print(lieu.getxCoord());
        if(lieu.getxCoord() == x){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(lieu.getyCoord());
        if(lieu.getyCoord() == y){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        
    }

    public static void testNidGCI(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, ContenuNid nature, int nb){
        System.out.println();
        System.out.println("*** Test de la classe NidGCI");

        java.sql.Date d2 = new java.sql.Date(0);
        d2 = d2.valueOf("2016-05-03");
        
        ObsGCI gci = new ObsGCI(5, d, t, l, obs, nature, nb);
        ObsGCI gci1 = new ObsGCI(6, d, t, l, obs, nature, nb);
        ObsGCI gci2 = new ObsGCI(7, d2, t, l, obs, nature, nb);

        NidGCI nid = new NidGCI(1, "Kerbilouet");

        ArrayList<ObsGCI> listeObs = new ArrayList<ObsGCI>();
        listeObs.add(gci);
        listeObs.add(gci1);
        
        nid.ajoutePlsObs(listeObs);
        nid.ajouteUneObs(gci2);

        System.out.print("Nombre d'observations : " + nid.nbObs());
        if(nid.nbObs() == 3){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        java.sql.Date dTest = nid.dateDebutObs();
        System.out.print("Test de la méthode dateDebutObs() : " + dTest);      
        if(dTest.equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        java.sql.Date dTest2 = nid.dateFinObs();
        System.out.print("Test de la méthode dateFinObs() : " + dTest2);
        if(dTest2.equals(d2)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        boolean test = nid.retireObs(2);
        System.out.print("Test de la méthode retirObs()");
        if(test == true){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print("Nombre d'observations : " + nid.nbObs());
        if(nid.nbObs() == 2){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        nid.videObs();
        System.out.println("Test de la méthode videObs ");
        System.out.print("Nombre d'observations : " + nid.nbObs());
        if(nid.nbObs() == 0){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.println("*** Test cas d'erreur, ajout du même observateur ");
        nid.ajouteUneObs(gci2);
        nid.ajouteUneObs(gci2);
        System.out.print("Nombre d'observations : " + nid.nbObs());
        if(nid.nbObs() == 1){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }


        
    }


    public static void testObsBatracien(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, int[] tab, EspeceBatracien espece){
        System.out.println();
        System.out.println("*** Test de la classe Obsbatracien");


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

        System.out.print(batracien.getNombreTetard());
        if(batracien.getNombreTetard()== tab[2]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(batracien.getNombrePonte());
        if(batracien.getNombrePonte()== tab[3]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }



        System.out.print(batracien.getEspece());
        if(batracien.getEspece().equals(espece)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }
    }



    public static void testObsChouette(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        System.out.println();
        System.out.println("*** Test de la classe ObsChouettes");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);
        type = TypeObservation.SONORE_VISUELLE;
        chouette.setTypeObs(type);
        System.out.print(chouette.getTypeObs());
        if(chouette.getTypeObs().equals(type)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }
    }



    public static void testObservateur(int id, String prenom, String nom){
        System.out.println();
        System.out.println("*** Test cas normaux de Observateur");

        Observateur observateur = new Observateur(id, nom, prenom);

        id = 12;
        observateur.setIdObservateur(id);
        System.out.print(observateur.getIdObservateur());
        if(observateur.getIdObservateur() == id){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        nom = "Ridard";
        observateur.setNom(nom);
        System.out.print(observateur.getNom());
        if(observateur.getNom().equals(nom)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        prenom = "Anthony";
        observateur.setPrenom(prenom);
        System.out.print(observateur.getPrenom());
        if(observateur.getPrenom().equals(prenom)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

    }


    public static void testObsGCI(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, ContenuNid nature, int nb){
        System.out.println();
        System.out.println("*** Test de la classeObsGCI");

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
        System.out.println();
        System.out.println("*** Test de la classe ObsHippocampes");

        
        ObsHippocampes hippocampes = new ObsHippocampes(5, d, t, l, obs, laTaille, Peche.CASIER_CREVETTES, EspeceHippocampes.SYNGNATHUS_ACTUS, Sexe.MALE, estGestant);


        System.out.print(hippocampes.getTaille());
        if(hippocampes.getTaille()==laTaille){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(hippocampes.getTypePeche());
        if(hippocampes.getTypePeche().equals(leTypePeche)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(hippocampes.getEspece());
        if(hippocampes.getEspece().equals(lEspece)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(hippocampes.getSexe());
        if(hippocampes.getSexe().equals(lEspece)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }

        System.out.print(hippocampes.getEstGestant());
        if(hippocampes.getEstGestant() == estGestant){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: Error");
        }
    }

    public static void testObsLoutre(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs,IndiceLoutre lIndice){
        System.out.println("*** Test de la classe ObsLoutre");

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
