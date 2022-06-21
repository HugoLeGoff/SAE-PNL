package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheObsChouette {
    
    private String protocole;
    private String typeObs;
    private String leNumIndividu;
    private String numObs;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;


	public AfficheObsChouette(String protocole, String typeObs, String leNumIndividu, String numObs, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur,String nom, String prenom) {
        
        this.protocole = protocole;
        this.typeObs = typeObs;
        this.numObs = numObs;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;

		
	}

    public String getLeNumIndividu() {
        return leNumIndividu;
    }

    public String getNom() {
        return nom;
    }
    public String getNumObs() {
        return numObs;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getProtocole() {
        return protocole;
    }
    public String getTypeObs() {
        return typeObs;
    }
    public String getDateObs() {
        return this.dateObs;
    }

    public String getHeureObs() {
        return this.heureObs;
    }

    public String getLieu_Lambert_X() {
        return this.lieu_Lambert_X;
    }

    public String getLieu_Lambert_Y() {
        return this.lieu_Lambert_Y;
    }

    public String getIdObservateur() {
        return this.idObservateur;
    }
	
}
