package donnee;
import java.util.*;
<<<<<<< HEAD

=======
>>>>>>> 4d4ce6e61d6f5a529436cd5b14509a76014ec51c
import java.sql.Time;

public class ObsChouette extends Observation {

	private TypeObservation typeObs;

	/**
	 * Constructeur de la classe ObsChouette
	 * @param id Numero d'identification de la chouette
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param type Type d'observation
	 */
	public ObsChouette(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, TypeObservation type) {

		if( type != null){
			this.typeObs = type;
		}
		else{
			System.err.println("Le type d'observation n'est pas valide");
		}
		if(id != 0 && date != null && heure != null && lieu != null && observateurs != null){
			super.setId(id);
			super.setDate(date);
			super.setHeure(heure);
			super.setLieu(lieu);
			super.setObservateurs(observateurs);
		}
		else{
			System.err.println("L'id, la date, l'heure, le lieu ou la liste d'observateurs ne doivent pas être null");
		}

		throw new UnsupportedOperationException();
	}

	/**
	 * retourne le type d'observation
	 * @return le type d'observation
	 */
	public TypeObservation getTypeObs() {
		return typeObs;
	}

	/**
	 * définit le type d'observation
	 * @param typeObs le type d'observation
	 */
	public void setTypeObs(TypeObservation typeObs) {
	
		if(typeObs != null){
			this.typeObs = typeObs;
		}
		else{
			System.out.println("Type d'observation ne doit pas être null");
		}
			
	}

}