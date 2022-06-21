package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheObsChouette {
    
    private String protocole;
    private String obsC;
    private String espece;
    private String sexe;
    private String idObs;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;


	public AfficheObsChouette(String protocole, String typeObs, String leNumIndividu, String obsC, String espece, String sexe, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur,String nom, String prenom) {
        
        this.obsC = obsC;
        this.espece = espece;
        this.sexe = sexe;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;

		
	}

    public String getEspece() {
        return this.espece;
    }

    public String getSexe() {
        return this.sexe;
    }

    public String getIdObs() {
        return this.idObs;
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
