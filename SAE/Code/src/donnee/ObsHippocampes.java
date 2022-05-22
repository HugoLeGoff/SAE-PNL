package donnee;
import java.util.*;
import java.sql.Time;

/**
 * crée une observation d'hippocampes
 */
public class ObsHippocampes extends Observation {

	/**
	 * type de pêches
	 */
	private Peche typePeche;

	/**
	 * espece de l'hippocampes
	 */
	private EspeceHippocampes espece;

	/**
	 * sexe de l'hippocampe
	 */
	private Sexe sexe;

	/**
	 * taille de l'hippocampe
	 */
	private double taille;

	/**
	 * définit si l'hippocampe est gestant
	 */
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
	public ObsHippocampes(int id, java.sql.Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, double laTaille, Peche leTypePeche, EspeceHippocampes lEspece, Sexe leSexe, boolean estGestant) {
		super(id, date, heure, lieu, observateurs);
		try{
			if(laTaille<0){
				throw new IllegalArgumentException("La taille est <0");
			}else{
				this.taille = laTaille;
			}
			if(leTypePeche==null){
				throw new IllegalArgumentException("Le type de peche est null");
			}else{
				this.typePeche = leTypePeche;
			}
			if(lEspece==null){
				throw new IllegalArgumentException("L'espece indiquée est null");
			}else{
				this.espece = lEspece;
			}
			if(leSexe==null){
				this.sexe=Sexe.INCONNU;
			}else{
				this.sexe=leSexe;
			}
			this.estGestant = estGestant;

		}catch(IllegalArgumentException i){
			i.printStackTrace();
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
	 * retourne l'espece observée
	 * @return l'espece observée

	 */
	public EspeceObservee especeObs(){
		return EspeceObservee.HIPPOCAMPE;

	}
}