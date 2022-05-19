package donnee;
import java.util.*;
import java.sql.*;

public abstract class Observation {

	protected Lieu lieuObs;
	protected Collection<Observateur> lesObservateurs;
	protected int idObs;
	protected java.sql.Date dateObs;
	protected java.sql.Time heureObs;

	/**
<<<<<<< HEAD
	 * Constructeur de Observation.
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
=======
	 * Constructeur de la classe observation
	 * @param id Identifiant de l'observation
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation 
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
>>>>>>> 74030a4383c8ad499afcd6b098b28411d2d9086b
	 */
	public Observation(int id, java.sql.Date date, java.sql.Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		if(id > 0 && date != null && heure != null && lieu != null && observateurs != null){
			this.idObs = id;
			this.dateObs = (java.sql.Date) date;
			this.heureObs = heure;
			this.lieuObs = lieu;
			this.lesObservateurs = observateurs;
		}
	}

	/**
	 * Ajoute un observateur dans la collection observateurs.
	 * @param o observateur à ajouter
	 */
	public void ajouteObservateur(Observateur o) {
		if(o != null){
			lesObservateurs.add(o);
		}
		else{
			System.err.println("ajouteObservateur : L'observateur ne doit pas être null");
		}
	}

	/**
	 * Retire un observateur dans la collection observateurs.
	 * @param idObservateur id de l'observateur à enlever
	 */
	public void retireObservateur(int idObservateur) {

		if(lesObservateurs != null && idObservateur >= 0){
			lesObservateurs.remove(idObs);
		}
		else{
			System.err.println("retireObservateur : La liste des observateurs ne doit pas être null et l'id doit être supérieur ou égal à 0");
		}
	}

	public abstract EspeceObservee especeObs();

	/**
	 * Renvoie la dateObs de Observation.
	 * @return dateObs de Observation
	 */
	public java.sql.Date getDateObs() {
		return dateObs;
	}

	/**
	 * Renvoie l'heure de Observation.
	 * @return heure de Observation
	 */
	public java.sql.Time getHeureObs() {
		return heureObs;
	}

	/**
	 * Renvoie l'idObs de Observation.
	 * @return idObs de Observation
	 */
	public int getIdObs() {
		return idObs;
	}

	/**
	 * Renvoie les Observateurs de la collection lesObservateurs.
	 * @return les Observateurs de la collection lesObservateurs
	 */
	public Collection<Observateur> getLesObservateurs() {
		return lesObservateurs;
	}

	/**
	 * Renvoie le lieu de Observation.
	 * @return lieu de Observation
	 */
	public Lieu getLieuObs() {
		return lieuObs;
	}

	/**
	 * Définit la dateObs de Observation.
	 * @param dateObs dateObs à définir
	 */
	public void setDateObs(java.sql.Date dateObs) {
		this.dateObs = dateObs;
	}

	/**
	 * Définit l'heureObs de Observation.
	 * @param heureObs heureObs à définir
	 */
	public void setHeureObs(java.sql.Time heureObs) {
		this.heureObs = heureObs;
	}

	/**
	 * Définit l'idObs de Observation.
	 * @param idObs idObs à définir
	 */
	public void setIdObs(int idObs) {
		this.idObs = idObs;
	}

	/**
	 * Définit les Observateurs dans la collection lesObservateurs.
	 * @param lesObservateurs lesObservateurs à définir dans la collection
	 */
	public void setLesObservateurs(Collection<Observateur> lesObservateurs) {
		this.lesObservateurs = lesObservateurs;
	}

	/**
	 * Définit le lieu de Observation.
	 * @param lieuObs lieu à définir
	 */
	public void setLieuObs(Lieu lieuObs) {
		this.lieuObs = lieuObs;
	}

}