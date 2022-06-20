package data;
import java.sql.*;
import donnee.*;
import java.util.*;

public class AllData {


  public ArrayList<Table> tableHippo() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_hippocampe JOIN Observation ON obsH = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

      }
    c.close();

    return ret;
  }

  

  /*public ArrayList<ObsHippocampes> hippocampe() throws SQLException{

    ArrayList<ObsHippocampes> ret = new ArrayList<ObsHippocampes>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM obs_hippocampe JOIN Observation ON obsH = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        ObsHippocampes ch = new ObsHippocampes(res.getInt(1),res.get(2),res.getString(3),res.getString(4),res.getString(5));
        ret.add(ch);
          
        

      }
    c.close();

    return ret;
  }*/


}
