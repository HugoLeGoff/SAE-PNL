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

	public EspeceBatracien getEspece() {
		return espece;
	}

	public int getNombreAdultes() {
		return nombreAdultes;
	}

	public int getNombreAmplexus() {
		return nombreAmplexus;
	}

	public int getNombrePonte() {
		return nombrePonte;
	}

	public int getNombreTetard() {
		return nombreTetard;
	}

	public void setEspece(EspeceBatracien espece) {
		this.espece = espece;
	}

	public void setNombreAdultes(int nombreAdultes) {
		this.nombreAdultes = nombreAdultes;
	}

	public void setNombreAmplexus(int nombreAmplexus) {
		this.nombreAmplexus = nombreAmplexus;
	}

	public void setNombrePonte(int nombrePonte) {
		this.nombrePonte = nombrePonte;
	}

	public void setNombreTetard(int nombreTetard) {
		this.nombreTetard = nombreTetard;
	}

	

}