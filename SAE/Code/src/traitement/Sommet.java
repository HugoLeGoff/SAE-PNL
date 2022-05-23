public class Sommet {
    
    private int id;
    private Lieu coordLieu;
    private Date date;
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
}
