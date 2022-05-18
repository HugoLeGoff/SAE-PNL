package donnee;
import java.util.*;
import java.sql.Time;

public class ObsGCI extends Observation {

	private ContenuNid natureObs;
	private int nombre;

	/**
	 * Constructeur de la classe ObsGCI
	 * @param id Numero d'identification de la loutre
	 * @param date Date de l'observation
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param nature Observation de la nature
	 * @param leNombre Nombre d'oiseaux observés
	 */
	public ObsGCI(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) {

		super( id, date, heure, lieu, observateurs);
		
		if(nature != null && leNombre > 0){
			this.natureObs = nature;
			this.nombre = leNombre;
		}
		else{
			System.err.println("ObsGCI : La nature de l'observation n'est pas valide");
		}

		throw new UnsupportedOperationException();
	}


	/**
	 * retourne la nature de l'observation
	 * @return la nature de l'observation
	 */
	public ContenuNid getNatureObs() {
		return natureObs;
	}

	/**
	 * retorune le nombre d'oiseaux observés
	 * @return
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * définit la nature de l'observation
	 * @param natureObs la nature de l'observation
	 */
	public void setNatureObs(ContenuNid natureObs) {
		this.natureObs = natureObs;
	}

	/**
	 * définit le nombre d'oiseaux observés
	 * @param nombre le nombre d'oiseaux observés
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	

}