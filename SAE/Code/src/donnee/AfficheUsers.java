package donnee;

/**
 * This class displays the users.
 */
public class AfficheUsers {
    
    private String idU;
    private String nom;
    private String prenom;

    /**
     * Builder that creates the object.
     * @param idU idU
     * @param nom nom
     * @param prenom prenom
     */
	public AfficheUsers(String idU,String nom, String prenom) {
        
        this.idU = idU;
        this.nom = nom;
        this.prenom = prenom;
	}

    /**
     * Gets the nom
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets the prenom
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Gets the idU
     * @return the idU
     */
    public String getIdU() {
        return this.idU;
    }
}
