package data;
//import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import connexion.Compte;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Database {
    public static void main(String args[]){
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

  /*public static ObservableList<Compte> getComptes() {

    ObservableList<Compte> comptes = FXCollections.observableArrayList();
    try {
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
      Statement stmt = c.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM Connexion");
      while(res.next()) {
        comptes.add(new Compte(res.getString("login"), res.getString("mdp")));
      }
      c.close();
    } catch(Exception e) {
      System.out.println(e);
    }
    return comptes;
  }*/

}
