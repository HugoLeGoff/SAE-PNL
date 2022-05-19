package donnee;
import java.util.*;
import java.sql.Time;

public class ObsHippocampes extends Observation {

	private Peche typePeche;
	private EspeceHippocampes espece;
	private Sexe sexe;
	private double taille;
	private boolean estGestant;

	/**
	 * Constructeur de ObsHippocampes.
	 * @param id numéro d'identification de la chouette
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param laTaille Taille de l'individu
	 * @param leTypePeche Type de peche
	 * @param IEspece Espece observée
	 * @param leSexe Sexe de l'individu
	 */
	public ObsHippocampes(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, double laTaille, Peche leTypePeche, EspeceHippocampes IEspece, Sexe leSexe, boolean estGestant) {
		super(id, date, heure, lieu, observateurs);
		if(laTaille>0 && leTypePeche !=null && IEspece!=null && leSexe!=null){
			this.taille = laTaille;
			this.typePeche = leTypePeche;
			this.espece = IEspece;
			this.sexe = leSexe;
			this.estGestant = estGestant;
		}else{
			System.err.println("ObsHippocampes : la Taille est inférieure à 0 et/ou leTypePeche est null et/ou leSexe est null");
		}
	}

	/**
	 * Renvoie l'espece de ObsHippocampe.
	 * @return l'espece de ObsHippocampe
	 */
	public EspeceHippocampes getEspece() {
		return this.espece;
	}

	/**
	 * Renvoie le typePeche de ObsHippocampe.
	 * @return le typePeche de ObsHippocampe
	 */
	public Peche getTypePeche() {
		return this.typePeche;
	}

	/**
	 * Renvoie la taille de ObsHippocampe.
	 * @return la taille de ObsHippocampe
	 */
	public double getTaille() {
		return this.taille;
	}

	/**
	 * Renvoie le sexe de ObsHippocampe.
	 * @return le sexe de ObsHippocampe
	 */
	public Sexe getSexe() {
		return this.sexe;
	}

	/**
	 * Renvoie le booleen estGestant de ObsHippocampe.
	 * @return le booleen estGestant de ObsHippocampe
	 */
	public boolean getEstGestant() {
		return this.estGestant;
	}


	/**
	 * Définit l'espece de ObsHippocampe.
	 * @param espece espece à définir
	 */
	public void setEspece(EspeceHippocampes espece){
		if(espece!=null){
			this.espece = espece;
		}else{
			System.err.println("setEspece : espece ne peut pas être null");
		}
	}

	/**
	 * Définit le typePeche de ObsHippocampe.
	 * @param espece typePeche à définir
	 */
	public void setTypePeche(Peche typePeche){
		if(typePeche!=null){
			this.typePeche = typePeche;
		}else{
			System.err.println("setTypePeche : espece ne peut pas être null");
		}
	}

	/**
	 * Définit la taille de ObsHippocampe.
	 * @param espece taille à définir
	 */
	public void setTaille(double taille){
		if(taille>0){
			this.taille = taille;
		}else{
			System.err.println("setTaille : taille ne peut pas être <0");
		}
	}

	/**
	 * Définit le sexe de ObsHippocampe.
	 * @param espece sexe à définir
	 */
	public void setSexe(Sexe sexe){
		if(sexe!=null){
			this.sexe = sexe;
		}else{
			System.err.println("setSexe : sexe ne peut pas être null");
		}
	}

	/**
	 * Définit le booleen estGestant de ObsHippocampe.
	 * @param espece booleen estGestant à définir
	 */
	public void setEstGestant(boolean estGestant){
		this.estGestant = estGestant;
	}
	
	/**
<<<<<<< HEAD
	 * retourne l'espece observée
	 * @return l'espece observée
=======
	 * Renvoie hippocampe
	 * @return EspeceObservee.HIPPOCAMPE
>>>>>>> b26ac7b7820801d8e2e3ddbecae1c5e8474b3aae
	 */
	public EspeceObservee especeObs(){
		return EspeceObservee.HIPPOCAMPE;

	}
}