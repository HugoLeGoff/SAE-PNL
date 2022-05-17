package donnee;
import java.util.*;
import java.sql.Time;

public abstract class Observation {

	protected Lieu LieuObs;
	protected Collection<Observateur> LesObservateurs;
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
	public Observation(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		// TODO - implement Observation.Observation
		throw new UnsupportedOperationException();
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

	public EspeceObservee especeObs() {
		// TODO - implement Observation.especeObs
		throw new UnsupportedOperationException();
	}

}