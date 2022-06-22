package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheCompte {
    
    private String idUser;
    private String nom;
    private String prenom;
    private String login;
    private String passw;
    private String statut;



	public AfficheCompte(String idUser, String nom, String prenom, String login, String passw, String statut) {
        
        this.idUser = idUser;
        this.login = login;
        this.passw = passw;
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;

		
	}

    public String getIdUser() {
        return this.idUser;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassw() {
        return this.passw;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getStatut() {
        return this.statut;
    }

	
}
