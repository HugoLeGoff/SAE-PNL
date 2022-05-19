package donnee;
import java.util.*;
import java.util.Date;
import java.sql.*;

/**
 * crée une observation
 */
public abstract class Observation {

	/**
	 * lieu de l'observation
	 */
	protected Lieu lieuObs;

	/**
	 * la liste des observateurs
	 */
	protected Collection<Observateur> lesObservateurs;

	/**
	 * identifiatn de l'observation
	 */
	protected int idObs;
	
	/**
	 * date de l'observation
	 */
	protected java.sql.Date dateObs;

	/**
	 * heure de l'observation
	 */
	protected java.sql.Time heureObs;

	/**
	 * Constructeur de la classe observation
	 * @param id Identifiant de l'observation
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation 
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 */
	public Observation(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		try{

			if(id<0){
				throw new IllegalArgumentException("L'identifiant est incorrect");
			}else{
				this.idObs = id;
			}
			if(date==null){
				throw new IllegalArgumentException("La date entrée est null");
			}else{
				this.dateObs = (java.sql.Date) date;
			}
			if(heure==null){
				throw new IllegalArgumentException("L'heure entrée est null");
			}else{
				this.heureObs = heure;
			}
			if(lieu==null){
				throw new IllegalArgumentException("Le lieu est null");
			}else{
				this.lieuObs = lieu;
			}
			if(observateurs==null){
				throw new IllegalArgumentException("observateurs est null");
			}else{
				this.lesObservateurs = observateurs;
			}
		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}
		
	}

	/**
	 * ajoute un observateur a la liste des observateurs
	 * @param o Observateur a ajouter
	 */
	public void ajouteObservateur(Observateur o) {
		if(o != null){
			lesObservateurs.add(o);
		}
		else{
			System.err.println("L'observateur ne doit pas être null");
		}
	}

	/**
	 * retire un observateur de la liste des observateurs
	 * @param idObservateur Identifiant de l'observateur a retirer
	 */
	public void retireObservateur(int idObservateur) {

		if(lesObservateurs != null && idObservateur >= 0){
			lesObservateurs.remove(idObservateur); 
		}
		else{
			System.err.println("La liste des observateurs ne doit pas être null et l'id doit être supérieur ou égal à 0");
		}
	}

	/**
	 * retorune l'espece observee
	 * @return l'espece observee
	 */
	public abstract EspeceObservee especeObs();

	/**
	 * retourne la date de l'observation
	 * @return la date de l'observation
	 */
	public java.sql.Date getDateObs() {
		return dateObs;
	}

	/**
	 * retourne l'heure de l'observation
	 * @return l'heure de l'observation
	 */
	public java.sql.Time getHeureObs() {
		return heureObs;
	}

	/**
	 * retourne l'id de l'observation
	 * @return l'id de l'observation
	 */
	public int getIdObs() {
		return idObs;
	}

	/**
	 * retourne les observateurs
	 * @return les observateurs
	 */
	public Collection<Observateur> getLesObservateurs() {
		return lesObservateurs;
	}

	/**
	 * retourne le lieu de l'observation
	 * @return le lieu de l'observation
	 */
	public Lieu getLieuObs() {
		return lieuObs;
	}

	/**
	 * modifie la date de l'observation
	 * @param dateObs la nouvelle date de l'observation
	 */
	public void setDateObs(java.sql.Date dateObs) {
		
		if(dateObs != null){
			this.dateObs = dateObs;
		}
		else{
			System.err.println("La date ne doit pas être null");
		}
	}

	/**
	 * modifie l'heure de l'observation
	 * @param heureObs la nouvelle heure de l'observation
	 */
	public void setHeureObs(java.sql.Time heureObs) {
		
		if(heureObs != null){
			this.heureObs = heureObs;
		}
		else{
			System.err.println("L'heure ne doit pas être null");
		}
	}

	/**
	 * modifie l'id de l'observation
	 * @param idObs la nouvelle id de l'observation
	 */
	public void setIdObs(int idObs) {
		
		if(idObs >= 0){
			this.idObs = idObs;
		}
		else{
			System.err.println("L'id doit être supérieur ou égal à 0");
		}
	}

	/**
	 * modifie la liste des observateurs
	 * @param lesObservateurs la nouvelle liste des observateurs
	 */
	public void setLesObservateurs(Collection<Observateur> lesObservateurs) {
		
		if(lesObservateurs != null){
			this.lesObservateurs = lesObservateurs;
		}
		else{
			System.err.println("La liste des observateurs ne doit pas être null");
		}
	}

	/**
	 * modifie le lieu de l'observation
	 * @param lieuObs la nouvelle lieu de l'observation
	 */
	public void setLieuObs(Lieu lieuObs) {
		
		if(lieuObs != null){
			this.lieuObs = lieuObs;
		}
		else{
			System.err.println("Le lieu ne doit pas être null");
		}
	}

}