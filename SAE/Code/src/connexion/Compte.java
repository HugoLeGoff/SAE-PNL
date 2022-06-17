package connexion;

import java.io.*;
import java.io.File;

import java.util.*;

public class Compte {

    private String login;
    private String pw;

    private Outils outil = new Outils();

    public Compte(){}

    public Compte(String login, String pw){
        this.login = login;
        this.pw = pw;
        writeLogin(login);
    }

    public String getLogin() {
        ArrayList<String> data = outil.readFile("../src/connexion/infoConnexion.txt");
        String ret = data.get(0);
        return ret;
    }

    public void writeLogin(String login){
        ArrayList<String> loginList = new ArrayList<String>();
        
        loginList.add(login);
    
        
        outil.writeFile(loginList, "../src/connexion/infoConnexion.txt") ;
    
    }
}


