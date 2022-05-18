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
	public ObsBatracien(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, int[] resObs, EspeceBatracien lEspece) {
		super( id, date, heure, lieu, observateurs);
		if(resObs!=null && lEspece!=null){

		}else{
			System.err.println("ObsBatracien : resBos est null et/ou lEspece est null");
		}
	}

	/**
	 * Renvoie l'espece de ObsBatracien.
	 * @return espece de ObsBatracien
	 */
	public EspeceBatracien getEspece() {
		return this.espece;
	}

	/**
	 * Renvoie le nombreAdultes de ObsBatracien.
	 * @return nombreAdultes de ObsBatracien
	 */
	public int getNombreAdultes() {
		return this.nombreAdultes;
	}

	/**
	 * Renvoie le nombreAmplexus de ObsBatracien.
	 * @return nombreAmplexus de ObsBatracien
	 */
	public int getNombreAmplexus() {
		return this.nombreAmplexus;
	}

	/**
	 * Renvoie le nombrePonte de ObsBatracien.
	 * @return nombrePonte de ObsBatracien
	 */
	public int getNombrePonte() {
		return this.nombrePonte;
	}

	/**
	 * Renvoie le nombreTetard de ObsBatracien.
	 * @return nombreTetard de ObsBatracien
	 */
	public int getNombreTetard() {
		return nombreTetard;
	}

	/**
	 * Définit l'espece de ObsBatracien.
	 * @param espece espece de ObsBatracien à définir
	 */
	public void setEspece(EspeceBatracien espece) {
		if(espece!=null){
			this.espece = espece;
		}else{
			System.err.println("setEspece : espece ne peut pas être null");
		}
	}

	/**
	 * Définit le nombreAdultes de ObsBatracien.
	 * @param nombreAdultes nombreAdultes de ObsBatracien à définir
	 */
	public void setNombreAdultes(int nombreAdultes) {
		if(nombreAdultes>=0){
			this.nombreAdultes = nombreAdultes;
		}else{
			System.err.println("setNombreAdultes : nombreAdultes ne peut pas être inférieur à 0");
		}
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

	public EspeceObservee especeObs(){
		return EspeceObservee.BATRACIEN;
	}

	

}