package donnee;
import java.util.*;
import java.sql.Time;

public class ObsChouette extends Observation {

	private TypeObservation typeObs;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 * @param type
	 */
	public ObsChouette(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, TypeObservation type) {
		super( id, date, heure, lieu, observateurs);
		// TODO - implement ObsChouette.ObsChouette
		throw new UnsupportedOperationException();
	}

	public TypeObservation getTypeObs() {
		return typeObs;
	}

	public void setTypeObs(TypeObservation typeObs) {
		this.typeObs = typeObs;
	}

}