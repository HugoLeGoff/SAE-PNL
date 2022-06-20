package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheObsChouette {
    
    private String obsC;
    private String espece;
    private String sexe;
    private String idObs;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;


	public AfficheObsChouette(String obsC, String espece, String sexe, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur) {
        
        this.obsC = obsC;
        this.espece = espece;
        this.sexe = sexe;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;

		
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
