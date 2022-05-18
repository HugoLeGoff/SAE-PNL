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
	 * @param id
	 * @param date
	 * @param heure
	 * @param lieu
	 * @param observateurs
	 * @param laTaille
	 * @param leTypePeche
	 * @param IEspece
	 * @param leSexe
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

	public EspeceObservee especeObs(){
		return EspeceObservee.HIPPOCAMPE;
	}
}