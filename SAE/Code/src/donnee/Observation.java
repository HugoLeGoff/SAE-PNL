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
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 */
	public Observation(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		if(id > 0 && date != null && heure != null && lieu != null && observateurs != null){
			this.idObs = id;
			this.dateObs = date;
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
		// TODO - implement Observation.ajouteObservateur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idObservateur
	 */
	public void retireObservateur(int idObservateur) {
		// TODO - implement Observation.retireObservateur
		throw new UnsupportedOperationException();
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