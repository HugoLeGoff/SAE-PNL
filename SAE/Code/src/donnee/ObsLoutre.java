package donnee;
import java.util.*;
import java.sql.Time;

/**
 * crée une observation de loutres
 */
public class ObsLoutre extends Observation {

	

	/**
	 * Constructeur de la classe ObsLoutre.
	 * @param id Numero d'identification de la loutre
	 * @param date Date de l'observation
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 */

	public ObsLoutre(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {

		super( id, date, heure, lieu, observateurs);
	
	}

	/**
	 * Retourne l'indice de la loutre.
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
		
		if(indice != null){
			this.indice = indice;
		}
		else{
			System.out.println("setIndice : indice ne doit pas être null");
		}
			
	}

	/**
	 * retourne l'espece observée
	 * @return l'espece observée
	 */
	public EspeceObservee especeObs(){
		return EspeceObservee.LOUTRE;
	}

}