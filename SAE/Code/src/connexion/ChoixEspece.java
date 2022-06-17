package connexion;

import java.io.*;
import java.io.File;

import java.util.*;

public class ChoixEspece {
    private String espece;
    

    private Outils outil = new Outils();

    public ChoixEspece(){}

    public ChoixEspece(String espece){
        this.espece = espece;
        writeEspece(espece);
    }

    public String getEspece() {
        ArrayList<String> data = outil.readFile("../src/connexion/infoEspece.txt");
        String ret = data.get(0);
        return ret;
    }

    public void writeEspece(String espece){
        ArrayList<String> especeList = new ArrayList<String>();
        
        especeList.add(espece);
    
        
        outil.writeFile(especeList, "../src/connexion/infoEspece.txt") ;
    
    }

    public void setText(String nomEspece) {
    }
}
