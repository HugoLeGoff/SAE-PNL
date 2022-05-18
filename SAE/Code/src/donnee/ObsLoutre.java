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
<<<<<<< HEAD
	public ObsLoutre(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
=======
	public ObsLoutre(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, IndiceLoutre indice) {

>>>>>>> c6054ab877b4164d039a3d80d4ea65087e986cba
		super( id, date, heure, lieu, observateurs);

		if(indice != null){
			this.indice = indice;
		}
		else{
			System.err.println("ObsLoutre : L'indice n'est pas valide");
		}

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
		
		if(indice != null){
			this.indice = indice;
		}
		else{
			System.out.println("setIndice : indice ne doit pas être null");
		}
			
	}

	public EspeceObservee especeObs(){
		return EspeceObservee.LOUTRE;
	}

}