package donnee;
import java.util.*;
import java.sql.Time;

public class ObsBatracien extends Observation {

	EspeceBatracien espece;
	private int nombreAdultes;
	private int nombreAmplexus;
	private int nombreTetard;
	private int nombrePonte;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 * @param resObs
	 * @param lEspece
	 */
	public ObsBatracien(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, int[] resObs, EspeceBatracien lEspece) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsBatracien.ObsBatracien
		throw new UnsupportedOperationException();
	}

}