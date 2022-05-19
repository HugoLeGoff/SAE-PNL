package donnee;
import java.util.*;

import java.sql.Time;

/**
 * crée une observation de chouette
 */
public class ObsChouette extends Observation {

	/**
	 * type de l'observation
	 */
	private TypeObservation typeObs;

	/**
	 * Constructeur de la classe ObsChouette.
	 * @param id Numero d'identification de la chouette
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param type Type d'observation
	 */
	public ObsChouette(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, TypeObservation type) {

		super(id, date, heure, lieu, observateurs);
		
		if( type != null){
			this.typeObs = type;
		}
		else{
			System.err.println("ObsChouette : Le type d'observation n'est pas valide");
		}
	}

	/**
	 * Retourne le type d'observation.
	 * @return le type d'observation
	 */
	public TypeObservation getTypeObs() {
		return this.typeObs;
	}
	
	/**
	 * Définit le type d'observation.
	 * @param typeObs le type d'observation
	 */
	public void setTypeObs(TypeObservation typeObs) {
	
		if(typeObs != null){
			this.typeObs = typeObs;
		}
		else{
			System.out.println("setTypeObs : typeObs ne doit pas être null");
		}
			
	}

	/**
	 * renvoie l'espece observée
	 * @return l'espece observée
	 */
	public EspeceObservee especeObs(){
		return EspeceObservee.CHOUETTE;
	}
}