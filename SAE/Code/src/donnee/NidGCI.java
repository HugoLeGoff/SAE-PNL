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
			this.idNid = id;
			this.nomPlage = plage;
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

	public int getIdNid() {
		return idNid;
	}

	public Collection<ObsGCI> getLesObservations() {
		return lesObservations;
	}

	public int getNbEnvol() {
		return nbEnvol;
	}

	public String getNomPlage() {
		return nomPlage;
	}

	public void setIdNid(int idNid) {
		this.idNid = idNid;
	}

	public void setLesObservations(Collection<ObsGCI> lesObservations) {
		this.lesObservations = lesObservations;
	}

	public void setNbEnvol(int nbEnvol) {
		this.nbEnvol = nbEnvol;
	}

	public void setNomPlage(String nomPlage) {
		this.nomPlage = nomPlage;
	}
	

}