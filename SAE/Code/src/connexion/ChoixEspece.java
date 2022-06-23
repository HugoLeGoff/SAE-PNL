package connexion;

import java.util.*;

/**
 * This class choose the espece
 */
public class ChoixEspece {
    private String espece;
    

    private Outils outil = new Outils();

    /**
     * Empty builder
     */
    public ChoixEspece(){}

    /**
     * Builder that creates the object
     * @param espece espece
     */
    public ChoixEspece(String espece){
        this.espece = espece;
        writeEspece(espece);
    }

    /**
     * Gets the espece
     * @return the espece
     */
    public String getEspece() {
        ArrayList<String> data = outil.readFile("../src/connexion/infoEspece.txt");
        String ret = data.get(0);
        return ret;
    }

    /**
     * Write the espece
     * @param espece espece
     */
    public void writeEspece(String espece){
        ArrayList<String> especeList = new ArrayList<String>();
        
        especeList.add(espece);
    
        
        outil.writeFile(especeList, "../src/connexion/infoEspece.txt") ;
    
    }

    /**
     * Sets text
     * @param nomEspece nomEspece
     */
    public void setText(String nomEspece) {
    }
}
