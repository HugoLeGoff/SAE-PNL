package donnee;
import java.util.*;
import java.sql.Time;

public class ObsGCI extends Observation {

	private ContenuNid natureObs;
	private int nombre;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 * @param nature
	 * @param leNombre
	 */
	public ObsGCI(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsGCI.ObsGCI
		throw new UnsupportedOperationException();
	}

}