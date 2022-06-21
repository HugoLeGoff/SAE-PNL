package donnee;
import java.util.*;
import java.sql.Time;

public class AfficheObsGCI {
    
    private String obsG;
    private String nature;
    private String nombre;
    private String presentMaisNonObs;
    private String idNid;
    private String nomPlage;
    private String raisonArretObservation;
    private String nbEnvol;
    private String protection;
    private String bagueMale;
    private String bagueFemelle;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;


	public AfficheObsGCI(String obsG, String nature, String nombre, String presentMaisNonObs, String idNid, String nomPlage, String raisonArretObservation, String nbEnvol, String protection, String bagueMale, String bagueFemelle, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom) {
        
        this.obsG = obsG;
        this.nature = nature;
        this.nombre = nombre;
        this.presentMaisNonObs = presentMaisNonObs;
        this.idNid = idNid;
        this.nomPlage = nomPlage;
        this.raisonArretObservation = raisonArretObservation;
        this.nbEnvol = nbEnvol;
        this.protection = protection;
        this.bagueMale = bagueMale;
        this.bagueFemelle = bagueFemelle;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;

    }

    public String getObsG() {
        return obsG;
    }

    public String getNature() {
        return nature;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPresentMaisNonObs() {
        return presentMaisNonObs;
    }

    public String getIdNid() {
        return idNid;
    }

    public String getNomPlage() {
        return nomPlage;
    }

    public String getRaisonArretObservation() {
        return raisonArretObservation;
    }

    public String getNbEnvol() {
        return nbEnvol;
    }

    public String getProtection() {
        return protection;
    }

    public String getBagueMale() {
        return bagueMale;
    }

    public String getBagueFemelle() {
        return bagueFemelle;
    }

    public String getDateObs() {
        return dateObs;
    }

    public String getHeureObs() {
        return heureObs;
    }

    public String getLieu_Lambert_X() {
        return lieu_Lambert_X;
    }

    public String getLieu_Lambert_Y() {
        return lieu_Lambert_Y;
    }

    public String getIdObservateur() {
        return idObservateur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
	
}