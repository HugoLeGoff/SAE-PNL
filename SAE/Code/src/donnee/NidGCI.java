package donnee;
import java.util.*;
import java.sql.Time;

public class NidGCI implements IObs<ObsGCI>{

	private Collection<ObsGCI> lesObservations;
	private int idNid;
	private int nbEnvol;
	private String nomPlage;

	/**
	 * Constructeur de la classe NidGCI
	 * @param id identifiant du nid
	 * @param plage nom de la plage
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

	/**
	 * Renvoie l'identifiant du nid
	 * @return l'identifiant du nid
	 */
	public int getIdNid() {
		return idNid;
	}

	/**
	 * Renvoie la liste des observations pour cette objet
	 * @return liste des observations
	 */
	public Collection<ObsGCI> getLesObservations() {
		return lesObservations;
	}

	/**
	 * Renvoie le nombre d'envol
	 * @return le nombre d'envol
	 */
	public int getNbEnvol() {
		return nbEnvol;
	}

	/**
	 * Renvoie le nom de la plage
	 * @return le nom de la plage
	 */
	public String getNomPlage() {
		return nomPlage;
	}

	/**
	 * Défini l'identifiant du nid
	 * @param idNid l'identifiant du nid
	 */
	public void setIdNid(int idNid) {
		this.idNid = idNid;
	}

	/**
	 * Défini les observations du nid
	 * @param lesObservationsles observations du nid
	 */
	public void setLesObservations(Collection<ObsGCI> lesObservations) {
		this.lesObservations = lesObservations;
	}

	
	public void setNbEnvol(int nbEnvol) {
		this.nbEnvol = nbEnvol;
	}

	public void setNomPlage(String nomPlage) {
		this.nomPlage = nomPlage;
	}


	/**
	 * ajoute une observation à la liste des observations de la chouette
	 * @param obs l'observation à ajouter
	 */
	public void ajouteUneObs(ObsGCI obs) {

		if(obs != null){
			this.lesObservations.add(obs);
		}
		else{
			System.err.println("L'observation ne doit pas être null");
		}
	};

	/**
	 * ajoute une liste d'observations à la liste des observations de la chouette
	 * @param obs la liste d'observations à ajouter
	 */
	public void ajoutePlsObs(ArrayList<ObsGCI> obs){ 

		if(lesObservations != null){
			lesObservations.addAll(obs);
		}
		else{
			System.err.println("La liste des observations ne doit pas être null");
		}
	};

	/**
	 * vide la liste des observations de la chouette
	 */
	public void videObs(){

		lesObservations.clear();
	};

	/**
	 * retire une observation de la liste des observations de la chouette
	 * @param idObs l'id de l'observation à retirer
	 * @return true si l'obs à bien été retirer
	 */
	public boolean retireObs(int idObs){
		boolean retirer = false;
		if(lesObservations != null){
			lesObservations.remove(idObs);
			retirer = true;
		}
		else{
			System.err.println("La liste des observations ne doit pas être null");
		}
		return retirer;
	}

	/**
	 * retourne le nombre d'observations de la chouette
	 * @return le nombre d'observations de la chouette
	 */
	public int nbObs(){

		return lesObservations.size();
	};
	

}