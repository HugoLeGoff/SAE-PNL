package data;
//import java.util.*;
import java.sql.*;
import donnee.*;

public class AccTest {
    private String login;
    private String pw;

    public AccTest(String login, String pw){
        this.login = login;
        this.pw = pw;
      
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
