package donnee;
import java.util.*;
import java.sql.Time;

public class ObsLoutre extends Observation {

	private IndiceLoutre indice;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 */
	public ObsLoutre(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsLoutre.ObsLoutre
		throw new UnsupportedOperationException();
	}

}