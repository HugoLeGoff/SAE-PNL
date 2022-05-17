package donnee;
import java.util.*;
import java.sql.Time;

public class NidGCI {

	private Collection<ObsGCI> lesObservations;
	private int idNid;
	private int nbEnvol;
	private String nomPlage;

	/**
	 * Constructeur de la classe NidGCI
	 * @param id
	 * @param plage
	 */
	public NidGCI(int id, String plage) {
		if(id > 0 && plage != null){
			this.idNid;
		}
		
	
	}

	public Date dateDebutObs() {
		// TODO - implement NidGCI.dateDebutObs
		throw new UnsupportedOperationException();
	}

	public Date dateFinObs() {
		// TODO - implement NidGCI.dateFinObs
		throw new UnsupportedOperationException();
	}

}