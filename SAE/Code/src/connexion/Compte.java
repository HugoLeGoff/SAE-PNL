package connexion;

import java.util.*;

/**
 * This class creates an account
 */
public class Compte {

    /**
     * Empty builder
     */
    public Compte(){}

    /**
     * Builder that creates the object
     * @param login login
     * @param pw pw
     */
    public Compte(String login, String pw){
        writeLogin(login);
    }

    /**
     * Gets the login
     * @return the login
     */
    public String getLogin() {
        ArrayList<String> data = Outils.readFile("../src/connexion/infoConnexion.txt");
        String ret = data.get(0);
        return ret;
    }

    /**
     * Write the login
     * @param login the login
     */
    public void writeLogin(String login){
        ArrayList<String> loginList = new ArrayList<String>();
        
        loginList.add(login);
    
        
        Outils.writeFile(loginList, "../src/connexion/infoConnexion.txt") ;
    
    }
}


