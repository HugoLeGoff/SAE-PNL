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

  public ArrayList<Table> tableChouettes() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_chouette JOIN Observation ON numObs = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

      }
    c.close();

    return ret;

  }

  public ArrayList<Table> tableLoutres() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_loutre JOIN Observation ON obsL = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

      }
    c.close();

    return ret;
  }

  public ArrayList<Table> tableGCI() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_gci JOIN Observation ON leNid = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

      }
    c.close();

    return ret;
  }

  public ArrayList<Table> tableBatraciens() throws SQLException{

    ArrayList<Table> ret = new ArrayList<Table>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery(" SELECT DISTINCT YEAR (dateObs) FROM Obs_batracien JOIN Observation ON obsB = idObs;");

      while(res.next()){
        Table t = new Table(res.getString(1));
        ret.add(t);
          
        

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

  public ArrayList<AfficheObsChouette> chouette() throws SQLException{
      
    ArrayList<AfficheObsChouette> ret = new ArrayList<AfficheObsChouette>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM obs_chouette JOIN Observation ON numObs = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        AfficheObsChouette ch = new AfficheObsChouette(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(11),res.getString(12),res.getString(13));
        ret.add(ch);
          
      }
    c.close();

    return ret;
  }

  public ArrayList<AfficheObsLoutre> loutre() throws SQLException{
      
    ArrayList<AfficheObsLoutre> ret = new ArrayList<AfficheObsLoutre>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM Obs_Loutre LEFT JOIN Observation ON ObsL = idObs LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        AfficheObsLoutre ch = new AfficheObsLoutre(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(12),res.getString(13),res.getString(14));
        ret.add(ch);
          
      }
    c.close();

    return ret;
  }

  public ArrayList<AfficheObsGCI> gci() throws SQLException{
      
    ArrayList<AfficheObsGCI> ret = new ArrayList<AfficheObsGCI>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM Obs_GCI LEFT JOIN Nid_GCI ON idNid = leNid LEFT JOIN Observation ON obsG = idObs  LEFT JOIN Aobserve ON idObs = lobservation LEFT JOIN observateur ON lobservateur = idObservateur;");

      while(res.next()){
        AfficheObsGCI ch = new AfficheObsGCI(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10), res.getString(11),res.getString(12),res.getString(14),res.getString(15),res.getString(16),res.getString(17),res.getString(20),res.getString(21),res.getString(22));
        ret.add(ch);
          
      }
    c.close();

    return ret;
  }

  public ArrayList<AfficheObsBatracien> Batracien() throws SQLException{
      
    ArrayList<AfficheObsBatracien> ret = new ArrayList<AfficheObsBatracien>();

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT *  FROM Obs_Batracien  JOIN Observation ON obsB = idObs  JOIN Aobserve ON idObs = lobservation  JOIN observateur ON lobservateur = idObservateur JOIN ZoneHumide ON concerne_ZH = zh_id JOIN Vegetation ON concernes_vege = idVege JOIN Lieu_Vegetation ON idVegeLieu = decrit_LieuVege;");

      while(res.next()){
        AfficheObsBatracien ch = new AfficheObsBatracien(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10), res.getString(11),res.getString(12),res.getString(13),res.getString(15),res.getString(16),res.getString(17),res.getString(18),res.getString(21),res.getString(22),res.getString(23),res.getString(25),res.getString(26),res.getString(27),res.getString(28),res.getString(29),res.getString(30),res.getString(32),res.getString(33),res.getString(34));
        ret.add(ch);
          
      }
    c.close();

    return ret;
  }

  public String getID() throws SQLException{
      
    String ret = "";

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT idObs FROM Observation ORDER BY idObs DESC LIMIT 1;");

      while(res.next()){
        ret = Integer.toString(res.getInt(1)+1);
        
          
      }
    c.close();

    return ret;
  }




public ArrayList<AfficheCompte> getAllCompte() {
    
  ArrayList<AfficheCompte> ret = new ArrayList<AfficheCompte>();

  try {
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
      Statement stmt = c.createStatement();
      ResultSet res = stmt.executeQuery("SELECT idU, nom, prenom, login, passw, statut FROM User JOIN Connexion ON idUser = idU JOIN Statut ON idStatut = statut");

      while (res.next()) {
        
        AfficheCompte ch = new AfficheCompte(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
        ret.add(ch);
      }

      c.close();

  } catch (SQLException e) {

      e.printStackTrace();
  }

  return ret;

}

public ArrayList<AfficheUsers> getAllObs() {
    
  ArrayList<AfficheUsers> ret = new ArrayList<AfficheUsers>();

  try {
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
      Statement stmt = c.createStatement();
      ResultSet res = stmt.executeQuery("SELECT idU, prenom, nom FROM User JOIN Connexion ON idUser = idU JOIN Statut ON idStatut = statut");

      AfficheUsers ch = null;
      while (res.next()) {
        
        ch = new AfficheUsers(res.getString(1),res.getString(2),res.getString(3));
        ret.add(ch);
      }

      c.close();

  } catch (SQLException e) {

      e.printStackTrace();
  }

  return ret;

}

}
