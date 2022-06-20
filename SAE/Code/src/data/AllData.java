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

  

  public ArrayList<AfficheObsHippocampes> hippocampe() throws SQLException{

    ArrayList<AfficheObsHippocampes> ret = new ArrayList<AfficheObsHippocampes>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM obs_hippocampe JOIN Observation ON obsH = idObs JOIN Aobserve ON idObs = lobservation JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        AfficheObsHippocampes ch = new AfficheObsHippocampes(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(16),res.getString(17));
        ret.add(ch);
          
        

      }
    c.close();

    return ret;
  }


}
