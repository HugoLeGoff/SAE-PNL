package donnee;
import java.util.*;
import java.sql.Time;

/**
 * crée une observation de loutres
 */
public class ObsLoutre extends Observation {

	/**
	 * indice de la loutre
	 */
	private IndiceLoutre indice;

	/**
	 * Constructeur de la classe ObsLoutre.
	 * @param id Numero d'identification de la loutre
	 * @param date Date de l'observation
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param lIndice indice de la loutre
	 */

	public ObsLoutre(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs,IndiceLoutre lIndice) {

		super( id, date, heure, lieu, observateurs);

		try{
			if(lIndice==null){
				throw new IllegalArgumentException("L'indice est null");
			}else{
				this.indice = lIndice; 
			}

		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}

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