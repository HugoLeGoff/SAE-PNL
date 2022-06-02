package data;
//import java.util.*;
import java.sql.*;
import donnee.*;


public class Database {
    public static void main(String args[])
  {
    try
    {

    
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "root", "Hugo2002!");
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
}
