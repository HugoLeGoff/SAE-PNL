package donnee;
import java.util.*;
import java.sql.Time;

/**
* crée une observation de loutres
*/
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

    /**
     * Constructeur de obsLoutre
     * @param obsL obsL
     * @param commune commune
     * @param lieuDit lieuDit
     * @param indice indice
     * @param dateObs dateObs
     * @param heureObs heureObs
     * @param lieu_Lambert_X lieu_Lambert_X
     * @param lieu_Lambert_Y lieu_Lambert_Y
     * @param idObservateur idObservateur
     * @param nom nom
     * @param prenom prenom
     */
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

    /**
     * Gets the obsL.
     * @return the obsL
     */
    public String getObsL() {
        return obsL;
    }

    /**
     * Gets the commune.
     * @return the commune
     */
    public String getCommune() {
        return commune;
    }

    /**
     * Gets the lieuDit.
     * @return the lieuDit
     */
    public String getLieuDit() {
        return lieuDit;
    }

    /**
     * Gets the indice.
     * @return the indice
     */
    public String getIndice() {
        return indice;
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
	
}