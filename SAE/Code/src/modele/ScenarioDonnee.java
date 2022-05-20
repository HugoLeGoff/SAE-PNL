package modele;
import donnee.*;
import java.util.*;
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

        try{
            ObsBatracien batracien = new ObsBatracien(5, d, t, l, listeObs, tab, espece);
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




    }

    public static void testChouette(){

    }

    public static void testLieu(){
        
    }

    public static void testNidGCI(){
        
    }

    public static void testObsBatracien(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, int[] tab, EspeceBatracien espece){
        System.out.println("*** Test cas normaux de Obsbatracien");

        try{
            ObsBatracien batracien = new ObsBatracien(5, d, t, l, obs, tab, espece);
        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        ObsBatracien batracien = new ObsBatracien(5, d, t, l, obs, tab, espece);
        
        System.out.print (batracien.getDateObs());
        if(batracien.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getHeureObs());
        if(batracien.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: OK");
        }

        System.out.print(batracien.getLieuObs());
        if(batracien.getLieuObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getLesObservateurs());
        if(batracien.getLesObservateurs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getNombreAdultes());
        if(batracien.getNombreAdultes() == tab[0]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getNombreAmplexus());
        if(batracien.getNombreAmplexus()== tab[1]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getNombrePonte());
        if(batracien.getNombrePonte()== tab[2]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getNombreTetard());
        if(batracien.getNombreTetard()== tab[3]){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(batracien.getEspece());
        if(batracien.getEspece().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
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
            System.out.println("\t: OK");
        }
    }

    

    public static void testObservateur(){
        
    }

    public static void testObservation(){
        
    }

    public static void testObsGCI(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, ContenuNid nature, int nb){
        System.out.println("*** Test cas normaux de ObsGCI");

        
        try{
            ObsGCI gci = new ObsGCI(5, d, t, l, obs, nature, nb);
        }
        catch(Exception e){
            e.printStackTrace(); 
        }

        ObsGCI gci = new ObsGCI(5, d, t, l, obs, nature, nb);
        
        
        System.out.print (gci.getDateObs());
        if(gci.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(gci.getHeureObs());
        if(gci.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: OK");
        }

        System.out.print(gci.getLieuObs());
        if(gci.getLieuObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(gci.getLesObservateurs());
        if(gci.getLesObservateurs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(gci.getNatureObs());
        if(gci.getNatureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(gci.getNombre());
        if(gci.getNombre() == nb){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }


        
    }

    public static void testObsHippocampes(){
        
    }

    public static void testObsLoutres(){
        
    }
}
