package donnee;

/**
 * This class displays obschouette.
 */
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

    /**
     * This builder creates the object.
     * @param protocole protocole
     * @param typeObs typeObs
     * @param leNumIndividu leNumIndividu
     * @param numObs numObs
     * @param dateObs dateObs
     * @param heureObs heureObs
     * @param  lieu_Lambert_X lieu_Lambert_X
     * @param lieu_Lambert_Y lieu_Lambert_Y
     * @param idObservateur idObservateur
     * @param nom nom
     * @param prenom prenom
     */
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

    /**
     * Gets the numindiv.
     * @return the numindiv
     */
    public String getLeNumIndividu() {
        return leNumIndividu;
    }

    /**
     * Gets the nom.
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets the numobs.
     * @return the numbos
     */
    public String getNumObs() {
        return numObs;
    }

    /**
     * Gets the prenom.
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Gets the protocole.
     * @return the protocole
     */
    public String getProtocole() {
        return protocole;
    }

    /**
     * Gets the typeobs.
     * @return the typeobs
     */
    public String getTypeObs() {
        return typeObs;
    }

    /**
     * Gets the dateobs.
     * @return the dateobs
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
     * Gets the LambertY.
     * @return the LambertY
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
	
}
