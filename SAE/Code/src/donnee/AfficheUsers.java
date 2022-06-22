package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheUsers {
    
    private String idU;
    private String nom;
    private String prenom;


	public AfficheUsers(String idU,String nom, String prenom) {
        
        this.idU = idU;
        this.nom = nom;
        this.prenom = prenom;
	}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIdObservateur() {
        return this.idU;
    }
}
