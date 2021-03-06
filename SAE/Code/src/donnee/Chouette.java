package donnee;
import java.util.*;

/**
 * crée une chouette
 */
public class Chouette implements IObs<ObsChouette> {

	/**
	 * la liste des observateurs
	 */
	private ArrayList<ObsChouette> lesObservations = new ArrayList<ObsChouette>();

	/**
	 * sexe de la chouette
	 */
	private Sexe sexe;

	/**
	 * espece de la chouette
	 */
	private EspeceChouette espece;

	/**
	 * identifiant de la chouette
	 */
	private String idChouette;

	/**
	 * Constructeur de la classe chouette
	 * @param id Numero d'identification de la chouette
	 * @param leSexe Sexe de la chouette
	 * @param IEspece Espece de chouette
	 */
	public Chouette(String id, Sexe leSexe, EspeceChouette IEspece) {
		try{
			if(id==null){
				throw new IllegalArgumentException("L'identifiant est null");
			}else{
				this.idChouette = id;
			}

			if(leSexe==null){
				this.sexe=Sexe.INCONNU;
			}else{
				this.sexe=leSexe;
			}

			if(IEspece==null){
				throw new IllegalArgumentException("L'espece indiquée est null");
			}else{
				this.espece = IEspece;
			}
		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}
		
	}

	/**
	 * retourne l'espece de la chouetee
	 * @return l'espece de la chouette
	 */
	public EspeceChouette getEspece() {
		return this.espece;
	}


	/**
	 * retourne l'id de la chouette
	 * @return l'id de la chouette
	 */
	public String getIdChouette() {
		return idChouette;
	}

	/**
	 * retourne la liste des observations de la chouette
	 * @return la liste des observations de la chouette
	 */
	public Collection<ObsChouette> getLesObservations() {
		return lesObservations;
	}

	/**
	 * retourne le sexe de la chouette
	 * @return le sexe de la chouette
	 */
	public Sexe getSexe() {

		return sexe;
	}

	/**
	 * redéfinit l'espce de la chouette
	 * @param espece espece de la chouette
	 */
	public void setEspece(EspeceChouette espece) {

		if(espece != null){
			this.espece = espece;
		}
		else{
			System.err.println("L'espèce ne doit pas être null");
		}
	}

	/**
	 * redéfinit l'id de la chouette
	 * @param idChouette id de la chouette
	 */
	public void setIdChouette(String idChouette) {
	
		if(idChouette != null){
			this.idChouette = idChouette;
		}
		else{
			System.err.println("L'id ne doit pas être null");
		}
	}

	/**
	 * redéfinit la liste des observations de la chouette
	 * @param lesObservations liste des observations de la chouette
	 */
	public void setLesObservations(ArrayList<ObsChouette> lesObservations) {
	
		if(lesObservations != null){
			this.lesObservations = lesObservations;
		}
		else{
			System.err.println("La liste des observations ne doit pas être null");
		}
	}

	/**
	 * redéfinit le sexe de la chouette
	 * @param sexe sexe de la chouette
	 */
	public void setSexe(Sexe sexe) {
		
		if(sexe != null){
			this.sexe = sexe;
		}
		else{
			System.err.println("Le sexe ne doit pas être null");
		}
	}


	/**
	 * ajoute une observation à la liste des observations de la chouette
	 * @param obs l'observation à ajouter
	 */
	public void ajouteUneObs(ObsChouette obs) {

		if(obs != null){
			boolean estDansListe = false;
			for(int i=0; i < lesObservations.size(); i++){
				if(obs.getIdObs() == lesObservations.get(i).getIdObs()){
					estDansListe = true;
				}
			}
			if(estDansListe == false){
				this.lesObservations.add(obs);
			}
			else{
				System.err.println("Erreur : L'observation est déjà dans la liste");
			}
		}
		else{
			System.err.println("L'observation ne doit pas être null");
		}
	};

	/**
	 * ajoute une liste d'observations à la liste des observations de la chouette
	 * @param obs la liste d'observations à ajouter
	 */
	public void ajoutePlsObs(ArrayList<ObsChouette> obs){

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