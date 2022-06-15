package data;
//import java.util.*;
import java.sql.*;
import donnee.*;


public class Database {
    public static void main(String args[])
  {
    try
    {

    
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
      //étape 3: créer l'objet statement 
      Statement stmt = c.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM Observateur LIMIT 10");
      //étape 4: exécuter la requête
      while(res.next())
        System.out.println(res.getInt(1)+"  "+res.getString(2)
        +"  "+res.getString(3));

      //étape 5: fermez l'objet de connexion*/
      c.close();
    }

    catch(Exception e){ 
      System.out.println(e);
    }
  }


  public boolean testMDP(String login, String pw) throws SQLException{
    boolean ret = false;

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM Connexion");

      while(res.next()){
        
        if(res.getString(1).equals(login) && res.getString(2).equals(pw)){
          ret = true;
        }

      }
      c.close();

      return ret;
  }

}
