package donnee;
import java.util.*;
import java.sql.Time;

public class AfficheObsBatracien {
    
    private String obsB;
    private String espece;
    private String nombreAdultes;
    private String nombresAmplexus;
    private String nombrePonte;
    private String nombreTetard;
    private String temperature;
    private String meteo_ciel;
    private String meteo_temp;
    private String meteo_vent;
    private String meteo_pluie;
    private String concerne_ZH;
    private String concerne_vege;
    private String dateObs;
    private String heureObs;
    private String lieu_Lambert_X;
    private String lieu_Lambert_Y;
    private String idObservateur;
    private String nom;
    private String prenom;
    private String zh_temporaire;
    private String zh_profondeur;
    private String zh_surface;
    private String zh_typeMare;
    private String zh_pente;
    private String zh_ouverture;
    private String natureVege;
    private String vegetation;
    private String decrit_LieuVege;


	public AfficheObsBatracien(String obsB, String espece, String nombreAdultes, String nombresAmplexus, String nombrePonte, String nombreTetard, String temperature, String meteo_ciel, String meteo_temp,  String meteo_vent, String meteo_pluie, String concerne_ZH, String concerne_vege, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom, String zh_temporaire, String zh_profondeur, String zh_surface, String zh_typeMare, String zh_pente, String zh_ouverture, String natureVege, String vegetation, String decrit_LieuVege) {
        
        this.obsB = obsB;
        this.espece = espece;
        this.nombreAdultes = nombreAdultes;
        this.nombresAmplexus = nombresAmplexus;
        this.nombrePonte = nombrePonte;
        this.nombreTetard = nombreTetard;
        this.temperature = temperature;
        this.meteo_ciel = meteo_ciel;
        this.meteo_temp = meteo_temp;
        this.meteo_vent = meteo_vent;
        this.meteo_pluie = meteo_pluie;
        this.concerne_ZH = concerne_ZH;
        this.concerne_vege = concerne_vege;
        this.dateObs = dateObs;
        this.heureObs = heureObs;
        this.lieu_Lambert_X = lieu_Lambert_X;
        this.lieu_Lambert_Y = lieu_Lambert_Y;
        this.idObservateur = idObservateur;
        this.nom = nom;
        this.prenom = prenom;
        this.zh_temporaire = zh_temporaire;
        this.zh_profondeur = zh_profondeur;
        this.zh_surface = zh_surface;
        this.zh_typeMare = zh_typeMare;
        this.zh_pente = zh_pente;
        this.zh_ouverture = zh_ouverture;
        this.natureVege = natureVege;
        this.vegetation = vegetation;
        this.decrit_LieuVege = decrit_LieuVege;
	}

    public String getObsB() {
        return obsB;
    }

    public String getEspece() {
        return espece;
    }


    public String getNombreAdultes() {
        return nombreAdultes;
    }

    public String getNombresAmplexus() {
        return nombresAmplexus;
    }

    public String getNombrePonte() {
        return nombrePonte;
    }

    public String getNombreTetard() {
        return nombreTetard;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getMeteo_ciel() {
        return meteo_ciel;
    }

    public String getMeteo_temp() {
        return meteo_temp;
    }

    public String getMeteo_vent() {
        return meteo_vent;
    }

    public String getMeteo_pluie() {
        return meteo_pluie;
    }

    public String getConcerne_ZH() {
        return concerne_ZH;
    }

    public String getConcerne_vege() {
        return concerne_vege;
    }

    public String getDateObs() {
        return this.dateObs;
    }

    public String getHeureObs() {
        return this.heureObs;
    }

    public String getLieu_Lambert_X() {
        return this.lieu_Lambert_X;
    }

    public String getLieu_Lambert_Y() {
        return this.lieu_Lambert_Y;
    }

    public String getIdObservateur() {
        return this.idObservateur;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getZh_temporaire() {
        return this.zh_temporaire;
    }

    public String getZh_profondeur() {
        return this.zh_profondeur;
    }

    public String getZh_surface() {
        return this.zh_surface;
    }

    public String getZh_typeMare() {
        return this.zh_typeMare;
    }

    public String getZh_pente() {
        return this.zh_pente;
    }

    public String getZh_ouverture() {
        return this.zh_ouverture;
    }

    public String getNatureVege() {
        return this.natureVege;
    }

    public String getVegetation() {
        return this.vegetation;
    }

    public String getDecrit_LieuVege() {
        return this.decrit_LieuVege;
    }
	
}