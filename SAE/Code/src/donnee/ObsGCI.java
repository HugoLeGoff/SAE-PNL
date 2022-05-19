package donnee;
import java.util.*;
import java.sql.Time;

public class ObsGCI extends Observation {

	private ContenuNid natureObs;
	private int nombre;

	/**
	 * Constructeur de la classe ObsGCI.
	 * @param id Numero d'identification de la loutre
	 * @param date Date de l'observation
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param nature Observation de la nature
	 * @param leNombre Nombre d'oiseaux observés
	 */

	public ObsGCI(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) {
		
		super( id, date, heure, lieu, observateurs);
		try{
			this.natureObs = nature;
			this.nombre = leNombre;

		}catch(IllegalArgumentException i ){
			i.printStackTrace();
		}
		
	}


	/**
	 * Retourne la nature de l'observation.
	 * @return la nature de l'observation
	 */
	public ContenuNid getNatureObs() {
		return natureObs;
	}

	/**
	 * Retourne le nombre d'oiseaux observés.
	 * @return le nombre d'oiseaux observés
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * Définit la nature de l'observation.
	 * @param natureObs la nature de l'observation à définir
	 */
	public void setNatureObs(ContenuNid natureObs) {
		this.natureObs = natureObs;
	}

	/**
	 * Définit le nombre d'oiseaux observés.
	 * @param nombre le nombre d'oiseaux observés à définir
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Renvoie l'espece observée.
	 */
	public EspeceObservee especeObs(){
		return EspeceObservee.GCI;
	}

}