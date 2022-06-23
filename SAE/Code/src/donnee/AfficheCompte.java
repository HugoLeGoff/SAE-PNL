package donnee;

/**
 * This class displays the comptes.
 */
public class AfficheCompte {
    
    private String idUser;
    private String login;
    private String passw;
    private String nom;
    private String prenom;
    private String statut;


    /**
     * Builder that creates the object.
     * @param idUser id
     * @param nom nom
     * @param prenom prenom
     * @param login login
     * @param passw password
     * @param statut statut
     */
	public AfficheCompte(String idUser, String nom, String prenom, String login, String passw, String statut) {
        
        this.idUser = idUser;
        this.login = login;
        this.passw = passw;
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;

		
	}

    /**
     * Gets the id of the user.
     * @return the id of the user.
     */
    public String getIdUser() {
        return this.idUser;
    }

    /**
     * Gets the login of the user.
     * @return the login of the user.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Gets the password of the user.
     * @return the password of the user.
     */
    public String getPassw() {
        return this.passw;
    }

    /**
     * Gets the name of the user.
     * @return the name of the user.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Gets the prenom of the user.
     * @return the prenom of the user.
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Gets the statut of the user.
     * @return the statut of the user.
     */
    public String getStatut() {
        return this.statut;
    }

	
}
