package traitement;
import donnee.*;
import java.sql.Date;

/**
 * Classe représentant un sommet d'un graphe
 */
public class Sommet {
    /**
     * Identifiant du sommet
     */
    private int id;
    /**
     * Coordonnées du lieu
     */
    private Lieu coordLieu;
    /**
     * Date de l'observation
     */
    private Date date;
    /**
     * Espèce observée
     */
    private EspeceObservee espece;

    /**
     * Constructeur de la classe Sommet
     * @param id identifiant du sommet
     * @param coordLieu coordonnées du lieu
     * @param date date de l'observation
     */
    public Sommet(int id, Lieu coordLieu, Date date, EspeceObservee espece) {
        
        if(id < 0) {
            throw new IllegalArgumentException("id doit être positif");
        }
        if(coordLieu == null) {
            throw new IllegalArgumentException("coordLieu ne peut être null");
        }
        if(date == null) {
            throw new IllegalArgumentException("date ne peut être null");
        }
        if(espece == null) {
            throw new IllegalArgumentException("espece ne peut être null");
        }

        this.id = id;
        this.coordLieu = coordLieu;
        this.date = date;
        this.espece = espece;
    }

    /**
     * Constructeur de la classe Sommet
     * @param obs observation
     */
    public Sommet(Observation obs){
            
        if(obs == null) {
            throw new IllegalArgumentException("obs ne peut être null");
        }
    
    }

    /**
     * calcule la distance à parir d'un sommet
     * @param som sommet
     * @return distance
     */
    public double calculeDistance(Sommet som) {

        if(som == null) {
            throw new IllegalArgumentException("som ne peut être null");
        }

        double ret = Math.sqrt(Math.pow(this.coordLieu.getxCoord() - som.getCoordLieu().getxCoord(), 2) + Math.pow(this.coordLieu.getyCoord() - som.getCoordLieu().getyCoord(), 2));
        
        return ret;
    }


    /**
     * retourne l'identifiant du sommet
     * @return identifiant du sommet
     */
    public int getId(){

        return this.id;
    }

    /**
     * retourne la coordonnée du lieu
     * @return coordonnée du lieu
     */
    public Lieu getCoordLieu(){

        return this.coordLieu;
    }

    /**
     * retourne la date de l'observation
     * @return date de l'observation
     */
    public Date getDate(){

        return this.date;
    }

    /**
     * retourne l'espèce observée
     * @return espèce observée
     */
    public EspeceObservee getEspece(){

        return this.espece;
    }

}
