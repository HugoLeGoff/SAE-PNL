package donnee;
import java.util.*;
import java.sql.Time;

public class ObsLoutre extends Observation {

	private IndiceLoutre indice;

	/**
	 * Constructeur de la classe ObsLoutre
	 * @param id Numero d'identification de la loutre
	 * @param date Date de l'observation
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 */
	public ObsLoutre(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsLoutre.ObsLoutre
		throw new UnsupportedOperationException();
	}

	/**
	 * retourne l'indice de la loutre
	 * @return l'indice de la loutre
	 */
	public IndiceLoutre getIndice() {
		return indice;
	}

	/**
	 * définit l'indice de la loutre
	 * @param indice l'indice de la loutre
	 */
	public void setIndice(IndiceLoutre indice) {
		this.indice = indice;
	}

	public EspeceObservee especeObs(){
		return EspeceObservee.LOUTRE;
	}

}