package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    private String espece;
    private String id;

    public Delete(String espece, String id){
        this.espece=espece;
        this.id=id;
    }
    public String requete(){
        String ret="";
        if(espece.equals("Hippocampes")){
            ret="DELETE FROM obs_Hippocampe WHERE obsH="+id+";";
            ret+="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret+="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("GCI")){
            ret="DELETE FROM obs_GCI WHERE obsG="+id+";";
            ret+="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret+="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Loutres")){
            ret="DELETE FROM obs_Loutre WHERE obsL="+id+";";
            ret+="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret+="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Batraciens")){
            ret="DELETE FROM obs_Batracien WHERE obsB="+id+";";
            ret+="DELETE FROM AObserve WHERE lObservation="+id+";";
            ret+="DELETE FROM Observation WHERE idObs="+id+";";
        }else if(espece.equals("Chouettes")){
            ret="DELETE FROM obs_Chouette WHERE numObs="+id+";";
            try{
                ret+="DELETE FROM AObserve WHERE lObservation="+id+";";
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                ret+="DELETE FROM Observation WHERE idObs="+id+";";
            }
            

        }

        return ret;
    }

    public void deleteTuple(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt = c.createStatement();
            String query = requete();
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
