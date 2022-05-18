package donnee;
import java.util.*;

public class Chouette {

	private Collection<ObsChouette> lesObservations;
	private Sexe sexe;
	private EspeceChouette espece;
	private String idChouette;

	/**
	 * Constructeur de la classe chouette
	 * @param id Numero d'identification de la chouette
	 * @param leSexe Sexe de la chouette
	 * @param IEspece Espece de chouette
	 */
	public Chouette(String id, Sexe leSexe, EspeceChouette IEspece) {
		if(id != null && leSexe != null && IEspece != null){
			this.idChouette = id;
			this.sexe = leSexe;
			this.espece = IEspece;
		}
		else{
			System.err.println("L'id ou le sexe ou l'espèce n'est pas valide");
		}
		
	}


	/**
	 * retourne l'espece de la chouetee
	 * @return l'espece de la chouette
	 */
	public EspeceChouette getEspece() {
		return espece;
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
	 */
	public void setLesObservations(Collection<ObsChouette> lesObservations) {
	
		if(lesObservations != null){
			this.lesObservations = lesObservations;
		}
		else{
			System.err.println("La liste des observations ne doit pas être null");
		}
	}

	/**
	 * redéfinit le sexe de la chouette
	 */
	public void setSexe(Sexe sexe) {
		
		if(sexe != null){
			this.sexe = sexe;
		}
		else{
			System.err.println("Le sexe ne doit pas être null");
		}
	}


	
	

}