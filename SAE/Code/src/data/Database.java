package data;
import java.util.*;
import java.sql.*;


public class Database {
    public static void main(String args[])
  {
    try
    {
      //étape 1: charger la classe de driver
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr","root","Enzolebodo2003");
      Statement stmt = c.createStatement();
      //étape 4: exécuter la requête
      
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
