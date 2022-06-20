package donnee;
import java.util.*;
import java.sql.Time;

/**
 * crée une observation d'hippocampes
 */
public class AfficheObsHippocampes {

	/**
	 * type de pêches
	 */
	private String typePeche;

	/**
	 * espece de l'hippocampes
	 */
	private String espece;

	/**
	 * sexe de l'hippocampe
	 */
	private String sexe;

	/**
	 * taille de l'hippocampe
	 */
	private String taille;

	/**
	 * définit si l'hippocampe est gestant
	 */
	private String estGestant;

    private String id;

    private String date;
    
    private String heure;

    private String lieu;

    private String observateur;



	/**
	 * Constructeur de ObsHippocampes.
	 * @param id numéro d'identification de la chouette
	 * @param date Date de l'observation 
	 * @param heure Heure de l'observation
	 * @param lieu Lieu de l'observation
	 * @param observateurs Liste des observateurs
	 * @param laTaille Taille de l'individu
	 * @param leTypePeche Type de peche
	 * @param lEspece Espece observée
	 * @param leSexe Sexe de l'individu
	 * @param estGestant Indique si l'individu est gestant
	 */
	public AfficheObsHippocampes(String id, String date, String heure, String lieu,String observateurs, String laTaille, String leTypePeche, String lEspece, String leSexe, String estGestant) {
        
		
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
	 * @param typePeche typePeche à définir
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
	 * @param taille taille à définir
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
	 * @param sexe sexe à définir
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
	 * @param estGestant booleen estGestant à définir
	 */
	public void setEstGestant(boolean estGestant){
		if(this.sexe==Sexe.FEMELLE && estGestant==true){
			System.err.println("Une femelle ne peut être gestant");
		}
		if(this.sexe==Sexe.INCONNU && estGestant==true){
			this.sexe=Sexe.MALE;
		}
		if(this.sexe==Sexe.MALE){
			this.estGestant=estGestant;
		}
	}
	
	/**
	 * retourne l'espece observée
	 */
	public EspeceObservee especeObs(){
		
		return EspeceObservee.HIPPOCAMPE;

	}
}