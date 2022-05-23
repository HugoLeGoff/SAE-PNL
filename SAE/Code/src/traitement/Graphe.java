package traitement;
import java.util.ArrayList;
import java.util.HashMap;

public class Graphe {

    private HashMap<Sommet,ArrayList<Sommet>> sommetsVoisins;

    public Graphe(ArrayList<Sommet> sommets,double dist){

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

        return sommetsVoisins.containsKey(idSom);
    }

    public int calculeDegre(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        return sommetsVoisins.get(idSom).size();
    }

    public HashMap<Sommet,ArrayList<Sommet>> calculeDegres(){

        HashMap<Sommet,ArrayList<Sommet>> degre = new HashMap<Sommet,int>();

        for(Sommet s : sommets){

            degre.put(s,calculeDegre(s.id));
        }

        return degre;
    }

    public Sommet somMaxDegre(){

        Sommet s = null;
        int max = 0;

        for(Sommet som : this.sommetsVoisins){

            if(calculeDegre(som.getId()) > max){

                max = calculeDegre(som.getId());
                s = som;
            }
        }

        return s;
    }

    public boolean sontVoisins(int idSom1, int indSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return somVoisins.get(idSom1).contains(sommets.get(indSom2));
    }

    public boolean existeChemin(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return existeChemin(sommets.get(indSom1),sommets.get(indSom2));
    }

    public ArrayList<Sommet> voisins(int indSom){

        if(indSom < 0) {
            throw new IllegalArgumentException("indSom doit être positif");
        }

        return somVoisins.get(indSom);
    }

    public boolean ajouteArete(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return ajouteArete(sommets.get(indSom1),sommets.get(indSom2));
    }

    public boolean retireArete(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return retireArete(sommets.get(indSom1),sommets.get(indSom2));
    }

    public int[][] matriceAdjacente(){

        int[][] matrice = new int[nbSommets()][nbSommets()];

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(sontVoisins(i,j)){

                    matrice[i][j] = 1;
                }
            }
        }

        return matrice;
    }

    public boolean estConnexe(){

        int[][] matrice = matriceAdjacente();

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(matrice[i][j] == 0){

                    return false;
                }
            }
        }

        return true;
    }

    public ArrayList<Graphe> composanteConnexe(){

        ArrayList<Graphe> composantes = new ArrayList<Graphe>();

        if(estConnexe()){

            composantes.add(this);
        }
        else{

            int[][] matrice = matriceAdjacente();

            for(int i = 0; i < nbSommets(); i++){

                for(int j = 0; j < nbSommets(); j++){

                    if(matrice[i][j] == 0){

                        matrice[i][j] = 1;
                        matrice[j][i] = 1;

                        Graphe g = new Graphe(this);
                        g.retireArete(i,j);

                        composantes.addAll(g.composanteConnexe());
                    }
                }
            }
        }

        return composantes;
    }

    public int distAretes(int idSom1, int idSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(idSom2 < 0) {
            throw new IllegalArgumentException("idSom2 doit être positif");
        }

        return dist[idSom1][idSom2];
    }

    public int excentrite(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        return somVoisins.get(idSom).size() - calculeDegre(idSom);
    }

    public int diametre(){

        int diametre = 0;

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(distAretes(i,j) > diametre){

                    diametre = distAretes(i,j);
                }
            }
        }

        return diametre;
    }

    public int rayon(){

        int rayon = 0;

        for(int i = 0; i < nbSommets(); i++){

            if(calculeDegre(i) > rayon){

                rayon = calculeDegre(i);
            }
        }

        return rayon;
    }

    public double calculeDist(int idSom1, int idSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(idSom2 < 0) {
            throw new IllegalArgumentException("idSom2 doit être positif");
        }

        return Math.sqrt(Math.pow(sommets.get(idSom1).getX() - sommets.get(idSom2).getX(),2) + Math.pow(sommets.get(idSom1).getY() - sommets.get(idSom2).getY(),2));
    }

    public double excentriteDist(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        double excentrite = 0;

        for(int i = 0; i < nbSommets(); i++){

            if(i != idSom){

                excentrite += calculeDist(idSom,i);
            }
        }

        return excentrite;
    }

}