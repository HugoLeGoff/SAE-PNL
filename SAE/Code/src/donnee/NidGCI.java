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
		try{
			if(id >= 0){
				throw new IllegalArgumentException("L'identifiant est incorrect ");
			}else{
				this.idNid = id;
			}

			if(plage==null){
				throw new IllegalArgumentException("La valeur en plage est null");
			}else{
				this.nomPlage = plage;
			}
		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}
		
		
	
	}

	/**
	 * Renvoie la date de début de l'observaion du nid
	 * @return la date de début de l'observaion du nid
	 */
	public Date dateDebutObs() {
		// TODO - implement NidGCI.dateDebutObs
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie la date de fin de l'observaion du nid
	 * @return la date de fin de l'observaion du nid
	 */
	public Date dateFinObs() {
		// TODO - implement NidGCI.dateFinObs
		throw new UnsupportedOperationException();
	}

	/**
	 * renvoie l'identifiant du nid
	 * @return l'identifiant du nid
	 */
	public int getIdNid() {
		return idNid;
	}

	/**
	 * renvoie la liste des observations du nid
	 * @return la liste des observations du nid
	 */
	public Collection<ObsGCI> getLesObservations() {
		return lesObservations;
	}

	/**
	 * renvoie le nombre d'envol du nid
	 * @return le nombre d'envol du nid
	 */
	public int getNbEnvol() {
		return nbEnvol;
	}

	/**
	 * renvoie le nom de la plage du nid
	 * @return le nom de la plage du nid
	 */
	public String getNomPlage() {
		return nomPlage;
	}

	/**
	 * définit l'identifiant du nid
	 * @param idNid identifiant du nid
	 */
	public void setIdNid(int idNid) {
		this.idNid = idNid;
	}

	/**
	 * définit la liste des observations du nid
	 * @param lesObservations liste des observations du nid
	 */
	public void setLesObservations(Collection<ObsGCI> lesObservations) {
		this.lesObservations = lesObservations;
	}

	/**
	 * définit le nombre d'envol du nid
	 * @param nbEnvol nombre d'envol du nid
	 */
	public void setNbEnvol(int nbEnvol) {
		this.nbEnvol = nbEnvol;
	}

	/**
	 * définit le nom de la plage du nid
	 * @param nomPlage nom de la plage du nid
	 */
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