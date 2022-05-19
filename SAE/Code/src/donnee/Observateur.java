package donnee;

/**
 * crée un observateur
 */
public class Observateur {

	/**
	 * identifiant de l'observateur
	 */
	private int idObservateur;

	/**
	 * nom de l'observateur
	 */
	private String nom;

	/**
	 * prenom de l'observateur
	 */
	private String prenom;

	/**
	 * Constructeur de Observateur.
	 * @param id id de Observateur
	 * @param leNom leNom de Observateur
	 * @param lePrenom lePrenom de Observateur
	 */
	public Observateur(int id, String leNom, String lePrenom) {
		try{
			if(id<0){
				throw new IllegalArgumentException("L'identifiant est incorrect");
			}else{
				this.idObservateur = id;
			}
			if(leNom==null){
				throw new IllegalArgumentException("Le nom entré est null");
			}else{
				this.nom = leNom;
			}
			if(lePrenom==null){
				throw new IllegalArgumentException("Le prenom entré est null");
			}else{
				this.prenom = lePrenom;
			}
		}catch(IllegalArgumentException i){
			i.printStackTrace();
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
		if(idObservateur > 0){
			this.idObservateur = idObservateur;
		}else {
			System.err.println("Observateur : idObservateur ne peut pas être inférieur ou égal à 0");
		}
	}

	/**
	 * Définit le nom de Observateur.
	 * @param nom nom à définir
	 */
	public void setNom(String nom) {
		if(nom != null){
			this.nom = nom;
		} else {
			System.err.println("setNom : nom ne doit pas être null");
		}
	}

	/**
	 * Définit le prénom de Observateur.
	 * @param prenom prénom à définir
	 */
	public void setPrenom(String prenom) {
		if(prenom != null){
			this.prenom = prenom;
		} else {
			System.err.println("setPrenom : prenom ne doit pas être null");
		}
	}

	
}