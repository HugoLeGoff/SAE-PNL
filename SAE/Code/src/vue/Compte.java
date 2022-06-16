package vue;

public class Compte {

    private String nom;
    private String prenom;
    private String role;
    private int mdp;

    public Compte(String nom, String prenom, String role, int mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRole() {
        return role;
    }

    public int getMdp() {
        return mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setMdp(int mdp) {
        this.mdp = mdp;
    }
}
