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

    public Sommet(Observation obs){

        if(obs == null) {
            throw new IllegalArgumentException("obs ne peut être null");
        }
    }

    public double calculeDistance(Sommet som) {

        return coordLieu.calculeDistance(som.coordLieu);
    }


}
