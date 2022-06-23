package data;
import java.sql.*;
import donnee.*;

/**
 * This class tests the accounts.
 */
public class AccTest {

  /**
   * Tests the password of the login.
   * @param login login
   * @param pw password
   * @return true or false
   * @throws SQLException SQLException
   */
  public boolean testMDP(String login, String pw) throws SQLException{
    boolean ret = false;

    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
    Statement stmt = c.createStatement();
    ResultSet res = stmt.executeQuery("SELECT * FROM Connexion");
      while(res.next()){
        if(res.getString(2).equals(login) && res.getString(3).equals(pw)){
          
          ret = true;
        }

      }
    c.close();

    return ret;
  }


}
