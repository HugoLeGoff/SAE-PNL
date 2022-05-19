package modele;
import donnee.*;
import java.util.*;
import java.sql.Time;
import java.sql.Date;


public class ScenarioDonnee {
    public static void main(String[] args){
         
        java.sql.Date d = new java.sql.Date(0);
        d = d.valueOf("2015-05-03");
        java.sql.Time t = new Time(3000);
        Lieu l = new Lieu(50, 50);
        Observateur obsBen1 = new Observateur(1, "Hugo", "Le Goff");
        Observateur obsBen2 = new Observateur(1, "Lucas", "Torri");
        ArrayList<Observateur> listeObs = new ArrayList<Observateur>();
        listeObs.add(obsBen1);
        listeObs.add(obsBen2);


        testObsChouette(d, t, l, listeObs, TypeObservation.VISUELLE);
        testObsChouette(d, t, l, listeObs, TypeObservation.VISUELLE);



    }

    public static void testChouette(){

    }

    public static void testLieu(){
        
    }

    public static void testNidGCI(){
        
    }

    public static void testObsBatracien(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        /*System.out.println("*** Test cas normaux de ObsBatraciens");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);
        
        System.out.print (chouette.getDateObs());
        if(chouette.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getHeureObs());
        if(chouette.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: OK");
        }

        System.out.print(chouette.getLieuObs());
        if(chouette.getLieuObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getLesObservateurs());
        if(chouette.getLesObservateurs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getTypeObs());
        if(chouette.getTypeObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }
    }*/

    public static void testObsChouette(java.sql.Date d, java.sql.Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        System.out.println("*** Test cas normaux de ObsChouettes");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);
        
        System.out.print (chouette.getDateObs());
        if(chouette.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getHeureObs());
        if(chouette.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: OK");
        }

        System.out.print(chouette.getLieuObs());
        if(chouette.getLieuObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getLesObservateurs());
        if(chouette.getLesObservateurs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getTypeObs());
        if(chouette.getTypeObs().equals(t)){
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

    public static void testObsGCI(){
        System.out.println("*** Test cas normaux de ObsGCI");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);
        
        System.out.print (chouette.getDateObs());
        if(chouette.getDateObs().equals(d)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getHeureObs());
        if(chouette.getHeureObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.print("\t: OK");
        }

        System.out.print(chouette.getLieuObs());
        if(chouette.getLieuObs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getLesObservateurs());
        if(chouette.getLesObservateurs().equals(t)){
            System.out.println ("\t: OK");
        }
        else{
            System.out.println("\t: OK");
        }

        System.out.print(chouette.getTypeObs());
        if(chouette.getTypeObs().equals(t)){
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
