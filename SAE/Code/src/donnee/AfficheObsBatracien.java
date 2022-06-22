package donnee;
import java.util.*;
import java.sql.Time;

/**
 * This class displays the ObsBatracien.
 */
public class AfficheObsBatracien {
    
    private String obsB;
    private String espece;
    private String nombreAdultes;
    private String nombreAmplexus;
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

    /**
     * Builder that creates the object.
     * @param obsB obsB
     * @param espece espece
     * @param nombreAdultes nombreAdultes
     * @param nombresAmplexus nombresAmplexus
     * @param nombrePonte nombrePonte
     * @param nombreTetard nombreTetard
     * @param temperature temperature
     * @param meteo_ciel meteo_ciel
     * @param meteo_temp meteo_temp
     * @param meteo_vent meteo_vent
     * @param meteo_pluie meteo_pluie
     * @param concerne_ZH concerne_ZH
     * @param concerne_vege concerne_vege
     * @param dateObs dateObs
     * @param heureObs heureObs
     * @param lieu_Lambert_X lieu_Lambert_X
     * @param lieu_Lambert_Y lieu_Lambert_Y
     * @param idObservateur idObservateur
     * @param nom nom
     * @param prenom prenom
     * @param zh_temporaire zh_temporaire
     * @param zh_profondeur zh_profondeur
     * @param zh_surface zh_surface
     * @param zh_typeMare zh_typeMare
     * @param zh_pente zh_pente
     * @param zh_ouverture zh_ouverture
     * @param natureVege natureVege
     * @param vegetation vegetation
     * @param decrit_LieuVege decrit_LieuVege
     */
	public AfficheObsBatracien(String obsB, String espece, String nombreAdultes, String nombresAmplexus, String nombrePonte, String nombreTetard, String temperature, String meteo_ciel, String meteo_temp,  String meteo_vent, String meteo_pluie, String concerne_ZH, String concerne_vege, String dateObs, String heureObs, String lieu_Lambert_X, String lieu_Lambert_Y, String idObservateur, String nom, String prenom, String zh_temporaire, String zh_profondeur, String zh_surface, String zh_typeMare, String zh_pente, String zh_ouverture, String natureVege, String vegetation, String decrit_LieuVege) {
        
        this.obsB = obsB;
        this.espece = espece;
        this.nombreAdultes = nombreAdultes;
        this.nombreAmplexus = nombresAmplexus;
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

    /**
     * Gets the obsB.
     * @return the ObsB
     */
    public String getObsB() {
        return obsB;
    }

    /**
     * Gets the espece.
     * @return the espece
     */
    public String getEspece() {
        return espece;
    }

    /**
     * Gets the nbadultes.
     * @return the nbadultes
     */
    public String getNombreAdultes() {
        return nombreAdultes;
    }

    /**
     * Gets the nbamplexus.
     * @return the nbamplexus
     */
    public String getNombreAmplexus() {
        return nombreAmplexus;
    }

    /**
     * Gets the nbponte.
     * @return the nbponte
     */
    public String getNombrePonte() {
        return nombrePonte;
    }

    /**
     * Gets the nbtetard.
     * @return the nbtetard
     */
    public String getNombreTetard() {
        return nombreTetard;
    }

    /**
     * Gets the temp.
     * @return the temp
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Gets the meteociel.
     * @return the meteociel
     */
    public String getMeteo_ciel() {
        return meteo_ciel;
    }

    /**
     * Gets the meteotemp.
     * @return the meteotemp
     */
    public String getMeteo_temp() {
        return meteo_temp;
    }

    /**
     * Gets the meteovent.
     * @return the meteovent
     */
    public String getMeteo_vent() {
        return meteo_vent;
    }

    /**
     * Gets the meteopluie.
     * @return the meteopluie
     */
    public String getMeteo_pluie() {
        return meteo_pluie;
    }

    /**
     * Gets the concerneZh.
     * @return the concerneZh
     */
    public String getConcerne_ZH() {
        return concerne_ZH;
    }

    /**
     * Gets the concerneVege.
     * @return the concerneVege
     */
    public String getConcerne_vege() {
        return concerne_vege;
    }

    /**
     * Gets the dateObs.
     * @return the dateObs
     */
    public String getDateObs() {
        return this.dateObs;
    }

    /**
     * Gets the heureObs.
     * @return the heureObs
     */
    public String getHeureObs() {
        return this.heureObs;
    }

    /**
     * Gets the lambertX.
     * @return the lambertX
     */
    public String getLieu_Lambert_X() {
        return this.lieu_Lambert_X;
    }

    /**
     * Gets the lambertY.
     * @return the lambertY
     */
    public String getLieu_Lambert_Y() {
        return this.lieu_Lambert_Y;
    }

    /**
     * Gets the idobs.
     * @return the idobs
     */
    public String getIdObservateur() {
        return this.idObservateur;
    }

    /**
     * Gets the nom.
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Gets the prenom.
     * @return the prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Gets the zhtemp.
     * @return the zhtemp
     */
    public String getZh_temporaire() {
        return this.zh_temporaire;
    }

    /**
     * Gets the zhprofondeur.
     * @return the zhprofondeur
     */
    public String getZh_profondeur() {
        return this.zh_profondeur;
    }

    /**
     * Gets the zhsurface.
     * @return the zhsurface
     */
    public String getZh_surface() {
        return this.zh_surface;
    }

    /**
     * Gets the zhtypmare.
     * @return the zhtypemare
     */
    public String getZh_typeMare() {
        return this.zh_typeMare;
    }

    /**
     * Gets the zhpente.
     * @return the zhpente
     */
    public String getZh_pente() {
        return this.zh_pente;
    }

    /**
     * Gets the zhouverture.
     * @return the zhouverture
     */
    public String getZh_ouverture() {
        return this.zh_ouverture;
    }

    /**
     * Gets the natureVege.
     * @return the natureVege
     */
    public String getNatureVege() {
        return this.natureVege;
    }

    /**
     * Gets the Vege.
     * @return the Vege
     */
    public String getVegetation() {
        return this.vegetation;
    }

    /**
     * Gets the decritLieuVege.
     * @return the decritLieuVege
     */
    public String getDecrit_LieuVege() {
        return this.decrit_LieuVege;
    }
	
}