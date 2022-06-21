package donnee;
import java.util.*;
import java.sql.Time;


public class AfficheCompte {
    
    private String idUser;
    private String login;
    private String passw;


	public AfficheCompte(String idUser, String login, String passw) {
        
        this.idUser = idUser;
        this.login = login;
        this.passw = passw;

		
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

	
}
