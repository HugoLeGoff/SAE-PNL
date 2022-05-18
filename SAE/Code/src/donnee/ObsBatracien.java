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
	 * Constructeur de ObsBatracien.
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
		if(resObs!=null && lEspece!=null){

		}else{
			System.err.println("ObsBatracien : resBos est null et/ou lEspece est null");
		}
	}

	/**
	 * Renvoie l'espece de ObsBatracien.
	 * @return
	 */
	public EspeceBatracien getEspece() {
		return this.espece;
	}

	/**
	 * Renvoie le nombreAdultes de ObsBatracien.
	 * @return
	 */
	public int getNombreAdultes() {
		return this.nombreAdultes;
	}

	/**
	 * Renvoie le nombreAmplexus de ObsBatracien.
	 * @return
	 */
	public int getNombreAmplexus() {
		return this.nombreAmplexus;
	}

	/**
	 * Renvoie le nombrePonte de ObsBatracien.
	 * @return
	 */
	public int getNombrePonte() {
		return this.nombrePonte;
	}

	/**
	 * Renvoie le nombreTetard de ObsBatracien.
	 * @return
	 */
	public int getNombreTetard() {
		return nombreTetard;
	}

	/**
	 * Définit l'espece de ObsBatracien.
	 * @param espece espece de ObsBatracien à définir
	 */
	public void setEspece(EspeceBatracien espece) {
		this.espece = espece;
	}

	/**
	 * Définit le nombreAdultes de ObsBatracien.
	 * @param nombreAdultes nombreAdultes de ObsBatracien à définir
	 */
	public void setNombreAdultes(int nombreAdultes) {
		this.nombreAdultes = nombreAdultes;
	}

	/**
	 * Définit le nombreAmplexus de ObsBatracien.
	 * @param nombreAmplexus nombreAmplexus de ObsBatracien à définir
	 */
	public void setNombreAmplexus(int nombreAmplexus) {
		this.nombreAmplexus = nombreAmplexus;
	}

	/**
	 * Définit le nombrePonte de ObsBatracien.
	 * @param nombrePonte nombrePonte de ObsBatracien à définir
	 */
	public void setNombrePonte(int nombrePonte) {
		this.nombrePonte = nombrePonte;
	}

	/**
	 * Définit le nombreTetard de ObsBatracien.
	 * @param nombreTetard nombreTetard de ObsBatracien à définir
	 */
	public void setNombreTetard(int nombreTetard) {
		this.nombreTetard = nombreTetard;
	}

	

}