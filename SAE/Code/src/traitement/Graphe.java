package traitement;
import java.util.ArrayList;
import java.util.HashMap;
public class Graphe {
    private HashMap<Sommet,int> sommetsVoisins;
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

    public Graphe(HashMap<Sommet,ArrayList<Sommet>> somVoisins){
        this.sommetsVoisins=somVoisins;



    }

    public Graphe(Graphe g){

        if(g == null) {
            throw new IllegalArgumentException("g ne peut être null");
        }

        this.sommetsVoisins = g;
    }

    public int nbSommets(){

        return sommetsVoisins.size();
    }

    public int nbAretes(){
        //à faire
        
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

    public HashMap<Sommet,int> calculeDegres(){

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
