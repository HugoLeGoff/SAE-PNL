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
		if(id > 0 && leNom != null && lePrenom != null){
			this.idObservateur = id;
			this.nom = leNom;
			this.prenom = lePrenom;
		}
		else{
			System.err.println("Error");
		}
	}


	/**
	 * 
	 * @return
	 */
	public int getIdObservateur() {
		return this.idObservateur;
	}


	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return this.prenom;
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