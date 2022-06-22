package donnee;
import java.util.*;
import java.sql.Time;

public class AfficheObsLoutre {
    
    private String obsL;
    private String commune;
    private String lieuDit;
    private String indice;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;


	public AfficheObsLoutre(String obsL, String commune, String lieuDit, String indice, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom) {
        
        this.obsL = obsL;
        this.commune = commune;
        this.lieuDit = lieuDit;
        this.indice = indice;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;	
	}

    public String getObsL() {
        return obsL;
    }

    public String getCommune() {
        return commune;
    }

    public String getLieuDit() {
        return lieuDit;
    }

    public String getIndice() {
        return indice;
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

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }
	
}