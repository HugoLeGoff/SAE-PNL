package modele;
import donnee.*;
import java.util.*;
import java.sql.Time;
import java.sql.Date;


public class ScenarioDonnee {
    public static void main(String[] args){
        long dt = 31556926000; 
        java.sql.Date d = new java.sql.Date(dt);
        java.sql.Time t = new Time(3000);
        Lieu l = new Lieu(50, 50);
        Observateur obsBen1 = new Observateur(1, "Hugo", "Le Goff");
        Observateur obsBen2 = new Observateur(1, "Lucas", "Torri");
        ArrayList<Observateur> listeObs = new ArrayList<Observateur>();
        listeObs.add(obsBen1);
        listeObs.add(obsBen2);


        testObsChouette(d, t, l, listeObs, TypeObservation.VISUELLE);


    }

    public static void testChouette(){

    }

    public static void testLieu(){
        
    }

    public static void testNidGCI(){
        
    }

    public static void testObsBatracien(){
        
    }

    public static void testObsChouette(java.sql.Date d, Time t, Lieu l, ArrayList<Observateur> obs, TypeObservation type){
        System.out.println("*** Test cas normaux de ObsChouettes");

        ObsChouette chouette = new ObsChouette(5, d, t, l, obs, type);
        System.out.println(chouette.getDateObs());


    }

    public static void testObservateur(){
        
    }

    public static void testObservation(){
        
    }

    public static void testObsGCI(){
        
    }

    public static void testObsHippocampes(){
        
    }

    public static void testObsLoutres(){
        
    }
}
