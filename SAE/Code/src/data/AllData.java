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
    ResultSet res = stmt.executeQuery("SELECT * FROM obs_hippocampe JOIN Observation ON obsH = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        AfficheObsHippocampes ch = new AfficheObsHippocampes(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(16),res.getString(17));
        ret.add(ch);
          
        

      }
    c.close();

    return ret;
  }

  public int getStatut(String login) throws SQLException{

    int ret = 0;

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT statut FROM User JOIN Connexion ON idUser = idU WHERE login = '"+login + "';" );
      while(res.next()){
        
          ret = Integer.valueOf(res.getString(1));

      }
    c.close();

    
    return ret;
  }

  public ArrayList<Table> tableChouette() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_Chouette JOIN Observation ON obsH = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

      }
    c.close();

    return ret;

  }



public ArrayList<AfficheObsChouette> chouette() throws SQLException{
    
  ArrayList<AfficheObsChouette> ret = new ArrayList<AfficheObsChouette>();

  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
  Statement stmt = c.createStatement();
  ResultSet res = stmt.executeQuery("SELECT * FROM obs_chouette JOIN Observation ON obsH = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur;");

    while(res.next()){
      AfficheObsChouette ch = new AfficheObsChouette(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(9));
      ret.add(ch);
        
    }
  c.close();

  return ret;
}


}
