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
	 * 
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
	public ObsHippocampes(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, double laTaille, Peche leTypePeche, EspeceHippocampes IEspece, Sexe leSexe, boolean estGestant) {
		super(id, date, heure, lieu, observateurs);
		// TODO - implement ObsHippocampes.ObsHippocampes
		throw new UnsupportedOperationException();
	}

	public EspeceHippocampes getEspece() {
		return espece;
	}

	public Peche getTypePeche() {
		return typePeche;
	}

	public double getTaille() {
		return taille;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public boolean getEstGestant() {
		return estGestant;
	}



}