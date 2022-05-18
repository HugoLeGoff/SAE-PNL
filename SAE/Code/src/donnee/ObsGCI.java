package donnee;
import java.util.*;
import java.sql.Time;

public class ObsGCI extends Observation {

	private ContenuNid natureObs;
	private int nombre;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 * @param nature
	 * @param leNombre
	 */
	public ObsGCI(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsGCI.ObsGCI
		throw new UnsupportedOperationException();
	}


	public ContenuNid getNatureObs() {
		return natureObs;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNatureObs(ContenuNid natureObs) {
		this.natureObs = natureObs;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public EspeceObservee especeObs(){
		return EspeceObservee.GCI;
	}

}