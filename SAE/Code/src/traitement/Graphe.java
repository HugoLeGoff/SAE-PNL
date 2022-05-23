package traitement;
import java.util.ArrayList;
import java.util.HashMap;
public class Graphe {

    public Graphe(ArrayList<Sommets> sommets,double dist){

        if(sommets == null) {
            throw new IllegalArgumentException("sommets ne peut être null");
        }
        if(dist < 0) {
            throw new IllegalArgumentException("dist doit être positif");
        }

        this.sommets = sommets;
        this.dist = dist;
    }

    public Graphe(HashMap<Sommet,ArrayList<Sommet>>){
        



    }

    public Graphe(Graphe g){

        if(g == null) {
            throw new IllegalArgumentException("g ne peut être null");
        }

        this.somVoisins = g.somVoisins;
        this.sommets = g.sommets;
        this.dist = g.dist;
    }

    public int nbSommets(){

        return sommets.size();
    }

    public int nbAretes(){

        return somVoisins.size();
    }

    public boolean estDansGraphe(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        return somVoisins.containsKey(idSom);
    }

    public int calculeDegre(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        return somVoisins.get(idSom).size();
    }

    public HashMap<Sommet,int> calculeDegre(){

        HashMap<Sommet,int> degre = new HashMap<Sommet,int>();

        for(Sommet s : sommets){

            degre.put(s,calculeDegre(s.id));
        }

        return degre;
    }

    public Sommet somMaxDegre(){

        Sommet s = null;
        int max = 0;

        for(Sommet som : sommets){

            if(calculeDegre(som.getId()) > max){

                max = calculeDegre(som.getId());
                s = som;
            }
        }

        return s;
    }


    
}
