package donnee;
import java.util.*;
import java.sql.Time;

/**
 * This class displays the obsGCI
 */
public class AfficheObsGCI {
    
    private String obsG;
    private String nature;
    private String nombre;
    private String presentMaisNonObs;
    private String idNid;
    private String nomPlage;
    private String raisonArretObservation;
    private String nbEnvol;
    private String protection;
    private String bagueMale;
    private String bagueFemelle;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;


    /**
     * Builder that creates the object.
     * @param obsG obsG
     * @param nature nature
     * @param nombre nombre
     * @param  presentMaisNonObs presentMaisNonObs
     * @param idNid idNid
     * @param nomPlage nomPlage
     * @param raisonArretObservation raisonArretObservation
     * @param nbEnvol nbEnvol
     * @param protection protection
     * @param bagueMale bagueMale
     * @param bagueFemelle bagueFemelle
     * @param dateObs dateObs
     * @param heureObs heureObs
     * @param lieu_Lambert_X lieu_Lambert_X
     * @param lieu_Lambert_Y lieu_Lambert_Y
     * @param idObservateur idObservateur
     * @param nom nom
     * @param prenom prenom
     */
	public AfficheObsGCI(String obsG, String nature, String nombre, String presentMaisNonObs, String idNid, String nomPlage, String raisonArretObservation, String nbEnvol, String protection, String bagueMale, String bagueFemelle, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom) {
        
        this.obsG = obsG;
        this.nature = nature;
        this.nombre = nombre;
        this.presentMaisNonObs = presentMaisNonObs;
        this.idNid = idNid;
        this.nomPlage = nomPlage;
        this.raisonArretObservation = raisonArretObservation;
        this.nbEnvol = nbEnvol;
        this.protection = protection;
        this.bagueMale = bagueMale;
        this.bagueFemelle = bagueFemelle;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;

    }
    /**
     * Gets the obsG.
     * @return the obsG
     */
    public String getObsG() {
        return obsG;
    }

    /**
     * Gets the nature.
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * Gets the nombre.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets the presentmaisnonobs.
     * @return the presentmaisnonobs
     */
    public String getPresentMaisNonObs() {
        return presentMaisNonObs;
    }

    /**
     * Gets the idnid.
     * @return the idnid
     */
    public String getIdNid() {
        return idNid;
    }

    /**
     * Gets the nomplage.
     * @return the nomplage
     */
    public String getNomPlage() {
        return nomPlage;
    }

    /**
     * Gets the rasonarret.
     * @return the rasonarret
     */
    public String getRaisonArretObservation() {
        return raisonArretObservation;
    }

    /**
     * Gets the nbenvol.
     * @return the nbenvol
     */
    public String getNbEnvol() {
        return nbEnvol;
    }

    /**
     * Gets the protection.
     * @return the protection
     */
    public String getProtection() {
        return protection;
    }

    /**
     * Gets the bagueMale.
     * @return the bagueMal
     */
    public String getBagueMale() {
        return bagueMale;
    }

    /**
     * Gets the bagueFemelle.
     * @return the bagueFemelle
     */
    public String getBagueFemelle() {
        return bagueFemelle;
    }

    /**
     * Gets the dateObs.
     * @return the dateObs
     */
    public String getDateObs() {
        return dateObs;
    }

    /**
     * Gets the heureObs.
     * @return the heureObs
     */
    public String getHeureObs() {
        return heureObs;
    }

    /**
     * Gets the lambertX.
     * @return the lambertX
     */
    public String getLieu_Lambert_X() {
        return lieu_Lambert_X;
    }

    /**
     * Gets the lambertY.
     * @return the lambertY
     */
    public String getLieu_Lambert_Y() {
        return lieu_Lambert_Y;
    }

    /**
     * Gets the idobs.
     * @return the idobs
     */
    public String getIdObservateur() {
        return idObservateur;
    }

    /**
     * Gets the nom.
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets the prenom.
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }
	
}