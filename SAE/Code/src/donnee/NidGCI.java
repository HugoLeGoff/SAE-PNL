package donnee;
import java.util.*;
import java.sql.Time;

public class NidGCI implements IObs<ObsGCI>{

	/**
	 * collection lesObservations
	 */
	private Collection<ObsGCI> lesObservations;
	/**
	 * id de NidGCI
	 */
	private int idNid;
	/**
	 * nbEnvol de NidGCI
	 */
	private int nbEnvol;
	/**
	 * nomPlage de NidGCI
	 */
	private String nomPlage;

	/**
	 * Constructeur de la classe NidGCI
	 * @param id identifiant du nid
	 * @param plage nom de la plage
	 */
	public NidGCI(int id, String plage) {
		try{
			if(id<0){
				throw new IllegalArgumentException("L'identifiant est incorrect");
			}else{
				this.idNid = id;
			}
			if(plage==null){
				throw new IllegalArgumentException("La plage est null");
			}else{
				this.nomPlage = plage;
			}
			
		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}
			
	}
	
	/**
	 * Renvoie la dateDebutObs de NidGCI.
	 * @return dateDebutObs de NidGCI
	 */
	public Date dateDebutObs() {
		return ((Observation) lesObservations.toArray()[0]).getDateObs();
	}

	/**
	 * Renvoie la dateFinObs de NidGCI.
	 * @return dateFinObs de NidGCI
	 */
	public Date dateFinObs() {
		return ((Observation) lesObservations.toArray()[lesObservations.size()]).getDateObs();
	}

	/**
	 * Renvoie l'identifiant de nid
	 * @return l'identifiant de nid
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
	 * Définir l'identifiant du nid
	 * @param idNid nouvel identifiant du nid
	 */
	public void setIdNid(int idNid) {
		if(idNid > 0){
			this.idNid = idNid;
		} else {
			System.err.println("setIdNid : idNid doit être supérieur à 0");
		}
	}

	/**
	 * Définir la collection d'observation de GCI
	 * @param lesObservations les observation
	 */
	public void setLesObservations(Collection<ObsGCI> lesObservations) {
		if(lesObservations != null){
			this.lesObservations = lesObservations;
		} else {
			System.err.println("setLesObservations : lesObservations doit être supérieur à 0");
		}
	}

	/**
	 * Défini le nombre d'envol des occupant du nid
	 * @param nbEnvol nombre d'envol
	 */
	public void setNbEnvol(int nbEnvol) {
		if(nbEnvol >= 0){
			this.nbEnvol = nbEnvol;
		} else {
			System.err.println("setIdNid : idNid ne doit pas être inférieur à 0");
		}
	}

	/**
	 * Défini le nom de la plage ou se trouve le nid
	 * @param nomPlage nom de la plage
	 */
	public void setNomPlage(String nomPlage) {
		if(nomPlage != null){
			this.nomPlage = nomPlage;
		} else {
			System.err.println("setNomPlage : nomPlage doit être supérieur à 0");
		}
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