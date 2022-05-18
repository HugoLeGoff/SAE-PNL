package donnee;
public class Observateur {

	private int idObservateur;
	private String nom;
	private String prenom;

	/**
	 * 
	 * @param id
	 * @param leNom
	 * @param lePrenom
	 */
	public Observateur(int id, String leNom, String lePrenom) {
		// TODO - implement Observateur.Observateur
		throw new UnsupportedOperationException();
	}

	public int getIdObservateur() {
		return idObservateur;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setIdObservateur(int idObservateur) {
		this.idObservateur = idObservateur;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}