package donnee;
import java.util.*;
import java.sql.Time;

/**
 * crée une observation d'hippocampes
 */
public class AfficheObsHippocampes {
    
    private String obsH;
    private String espece;
    private String sexe;
    private String temperatureEau;
    private String typePeche;
    private String taille;
    private String gestant;
    private String idObs;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String lobservateur;
    private String idObservateur;
    private String lobservation;
    private String nom;
    private String prenom;



	/**
	 * Constructeur de ObsHippocampes.
	 * @param id numéro d'identification de la chouette
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param laTaille Taille de l'individu
	 * @param leTypePeche Type de peche
	 * @param lEspece Espece observée
	 * @param leSexe Sexe de l'individu
	 * @param estGestant Indique si l'individu est gestant
	 */
	public AfficheObsHippocampes(String obsH, String espece, String sexe, String temperatureEau, String typePeche, String taille, String gestant, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom) {
        
        this.obsH = obsH;
        this.espece = espece;
        this.sexe = sexe;
        this.temperatureEau = temperatureEau;
        this.typePeche = typePeche;
        this.taille = taille;
        this.gestant = gestant;
        this.idObs = idObs;
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

    public String getTemperatureEau() {
        return this.temperatureEau;
    }

    public String getTypePeche() {
        return this.typePeche;
    }

    public String getTaille() {
        return this.taille;
    }

    public String getGestant() {
        return this.gestant;
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

    public String getLobservateur() {
        return this.lobservateur;
    }

    public String getLobservation() {
        return this.lobservation;
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

    public String getObsH() {
        return this.obsH;
    }
	
}