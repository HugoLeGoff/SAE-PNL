package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class Delete {
    private String espece;
    private int id;

    public Delete(String espece, String id){
        this.espece=espece;
        this.id= Integer.valueOf(id);
        System.out.println(id+espece);
    }
    public ArrayList<String> requete(){
        ArrayList<String> ret = new ArrayList<String>();
        if(espece.equals("Hippocampes")){
            String ret1="DELETE FROM obs_Hippocampe WHERE obsH="+id+";";
            ret.add(ret1);
            ret1="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret.add(ret1);
            ret1="DELETE FROM Observation WHERE idObs="+id+";";
            ret.add(ret1);
        }else if(espece.equals("GCI")){
            String ret1="DELETE FROM obs_GCI WHERE obsG="+id+";";
            ret1="\nDELETE FROM AObserve WHERE lObservation="+id+";";
            ret1="\nDELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Loutres")){
            String ret1="DELETE FROM obs_Loutre WHERE obsL="+id+";";
            ret1="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret1="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Batraciens")){
            String ret1="DELETE FROM obs_Batracien WHERE obsB="+id+";";

            ret1="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret1="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Chouettes")){
            String ret1="DELETE FROM obs_Chouette WHERE numObs="+id+";";
            try{
                ret1+="\nDELETE FROM AObserve WHERE lObservation="+id+";";
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                ret1+="\nDELETE FROM Observation WHERE idObs="+id+";";
            }
            

        }
        return ret;
    }

    public void deleteTuple(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt = c.createStatement();
            ArrayList<String> query = requete();
            stmt.executeUpdate(query.get(0));
            stmt.executeUpdate(query.get(1));
            stmt.executeUpdate(query.get(2));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
