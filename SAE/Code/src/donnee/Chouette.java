package donnee;
import java.util.*;

public class Chouette {

	private Collection<ObsChouette> lesObservations;
	private Sexe sexe;
	private EspeceChouette espece;
	private String idChouette;

	/**
	 * Constructeur de la classe chouette
	 * @param id Numero d'identification d ela chouette
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


	public EspeceChouette getEspece() {
		return this.espece;
	}

	public String getIdChouette() {
		return idChouette;
	}

	public Collection<ObsChouette> getLesObservations() {
		return lesObservations;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setEspece(EspeceChouette espece) {
		this.espece = espece;
	}

	public void setIdChouette(String idChouette) {
		this.idChouette = idChouette;
	}

	public void setLesObservations(Collection<ObsChouette> lesObservations) {
		this.lesObservations = lesObservations;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	
	

}