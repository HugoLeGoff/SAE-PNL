package donnee;
public class Observateur {

	private int idObservateur;
	private String nom;
	private String prenom;

	/**
	 * Constructeur de Observateur.
	 * @param id id de Observateur
	 * @param leNom leNom de Observateur
	 * @param lePrenom lePrenom de Observateur
	 */
	public Observateur(int id, String leNom, String lePrenom) {
		if(id > 0 && leNom != null && lePrenom != null){
			this.idObservateur = id;
			this.nom = leNom;
			this.prenom = lePrenom;
		}
		else{
			System.err.println("Observateur : id ne peut pas être inférieur ou égal à 0 et/ou leNom ne doit pas être null et/ou lePrnom ne doit pas être null");
		}
	}


	/**
	 * Renvoie l'id de Observateur.
	 * @return id de Observateur
	 */
	public int getIdObservateur() {
		return this.idObservateur;
	}


	/**
	 * Renvoie le nom de Observateur.
	 * @return nom de Observateur
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Renvoie le prenom de Observateur.
	 * @return prenom de Observateur
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * Définit l'id de Observateur.
	 * @param idObservateur id à définir
	 */
	public void setIdObservateur(int idObservateur) {
		if(idObservateur>0){
			
		}
		this.idObservateur = idObservateur;
	}

	/**
	 * Définit le nom de Observateur.
	 * @param nom nom à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Définit le prénom de Observateur.
	 * @param prenom prénom à définir
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}