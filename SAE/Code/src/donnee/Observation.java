package donnee;
import java.util.*;
import java.util.Date;
import java.sql.*;

public abstract class Observation {

	protected Lieu lieuObs;
	protected Collection<Observateur> lesObservateurs;
	protected int idObs;
	protected java.sql.Date dateObs;
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
		if(id > 0 && date != null && heure != null && lieu != null && observateurs != null){
			this.idObs = id;
			this.dateObs = (java.sql.Date) date;
			this.heureObs = heure;
			this.lieuObs = lieu;
			this.lesObservateurs = observateurs;
		}
	}

	/**
	 * 
	 * @param o
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
	 * 
	 * @param idObservateur
	 */
	public void retireObservateur(int idObservateur) {

		if(lesObservateurs != null && idObservateur >= 0){
			lesObservateurs.remove(idObs);
		}
		else{
			System.err.println("La liste des observateurs ne doit pas être null et l'id doit être supérieur ou égal à 0");
		}
	}

	public abstract EspeceObservee especeObs();

	

	public java.sql.Date getDateObs() {
		return dateObs;
	}

	public java.sql.Time getHeureObs() {
		return heureObs;
	}

	public int getIdObs() {
		return idObs;
	}

	public Collection<Observateur> getLesObservateurs() {
		return lesObservateurs;
	}

	public Lieu getLieuObs() {
		return lieuObs;
	}

	public void setDateObs(java.sql.Date dateObs) {
		this.dateObs = dateObs;
	}

	public void setHeureObs(java.sql.Time heureObs) {
		this.heureObs = heureObs;
	}
	public void setIdObs(int idObs) {
		this.idObs = idObs;
	}

	public void setLesObservateurs(Collection<Observateur> lesObservateurs) {
		lesObservateurs = lesObservateurs;
	}

	public void setLieuObs(Lieu lieuObs) {
		lieuObs = lieuObs;
	}

}