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
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;

		
	}

    /**
     * Gets the espece.
     * @return the espece
     */
    public String getEspece() {
        return this.espece;
    }

    /**
     * Gets the sexe.
     * @return the sexe
     */
    public String getSexe() {
        return this.sexe;
    }

    /**
     * Gets the tempeau.
     * @return the tempeau
     */
    public String getTemperatureEau() {
        return this.temperatureEau;
    }

    /**
     * Gets the typepeche.
     * @return the typepeche
     */
    public String getTypePeche() {
        return this.typePeche;
    }

    /**
     * Gets the taille.
     * @return the taille
     */
    public String getTaille() {
        return this.taille;
    }

    /**
     * Gets the gestant.
     * @return the gestant
     */
    public String getGestant() {
        return this.gestant;
    }

    /**
     * Gets the idObs.
     * @return the idObs
     */
    public String getIdObs() {
        return this.idObs;
    }

    /**
     * Gets the dateObs.
     * @return the dateObs
     */
    public String getDateObs() {
        return this.dateObs;
    }

    /**
     * Gets the heureObs.
     * @return the heureObs
     */
    public String getHeureObs() {
        return this.heureObs;
    }

    /**
     * Gets the lambertX.
     * @return the lambertX
     */
    public String getLieu_Lambert_X() {
        return this.lieu_Lambert_X;
    }

    /**
     * Gets the lambertY.
     * @return the lambertY
     */
    public String getLieu_Lambert_Y() {
        return this.lieu_Lambert_Y;
    }

    /**
     * Gets the observateur.
     * @return the observateur
     */
    public String getLobservateur() {
        return this.lobservateur;
    }

    /**
     * Gets the observation.
     * @return the observation
     */
    public String getLobservation() {
        return this.lobservation;
    }

    /**
     * Gets the idObs.
     * @return the idObs
     */
    public String getIdObservateur() {
        return this.idObservateur;
    }

    /**
     * Gets the nom.
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Gets the prenom.
     * @return the prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Gets the obsH.
     * @return the obsH
     */
    public String getObsH() {
        return this.obsH;
    }
	
}