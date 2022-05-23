package traitement;

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
    private EpseceObservee espece;

    /**
     * Constructeur de la classe Sommet
     * @param id identifiant du sommet
     * @param coordLieu coordonnées du lieu
     * @param date date de l'observation
     */
    public Sommet(int id, Lieu coordLieu, Date date) {
        
        if(id < 0) {
            throw new IllegalArgumentException("id doit être positif");
        }
        if(coordLieu == null) {
            throw new IllegalArgumentException("coordLieu ne peut être null");
        }
        if(date == null) {
            throw new IllegalArgumentException("date ne peut être null");
        }

        this.id = id;
        this.coordLieu = coordLieu;
        this.date = date;
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

        return coordLieu.calculeDistance(som.coordLieu);
    }


}
