package traitement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe représentant un sommet d'un graphe
 */
public class Graphe {
//cum
    /**
     * Liste des sommets du graphe
     */
    private HashMap<Sommet,ArrayList<Sommet>> sommetsVoisins;

    /**
     * Constructeur de la classe Graphe
     * @param sommets liste des sommets du graphe
     * @param dist liste des distances entre les sommets du graphe
     */
    public Graphe(ArrayList<Sommet> sommets,double dist){

        if(sommets == null) {
            throw new IllegalArgumentException("sommets ne peut être null");
        }
        if(dist < 0) {
            throw new IllegalArgumentException("dist doit être positif");
        }

        sommetsVoisins = new HashMap<Sommet,ArrayList<Sommet>>();
    }

    /**
     * Ajoute un sommet au graphe
     * @param somVoisins liste des sommets voisins du sommet
     */
    public Graphe(HashMap<Sommet,ArrayList<Sommet>> somVoisins){

        if(somVoisins == null) {
            throw new IllegalArgumentException("somVoisins ne peut être null");
        }
        this.sommetsVoisins=somVoisins;

    }

    /**
     * Retourne la liste des sommets voisins du sommet
     * @param g graphe
     */
    public Graphe(Graphe g){

        if(g == null) {
            throw new IllegalArgumentException("g ne peut être null");
        }

        this.sommetsVoisins = g;
    }

    /**
     * Retourne le nombre de sommet voisins du sommet
     * @return liste des sommets voisins du sommet
     */
    public int nbSommets(){

        return sommetsVoisins.size();
    }

    /**
     * Retourne le d'arête du graphe
     */
    public int nbAretes(){
        
        int nbAretes = 0;
        for(Sommet s : sommetsVoisins.keySet()){
            nbAretes += sommetsVoisins.get(s).size();
        }
        return nbAretes;

    }

    /**
     * Retourne si le sommet est dans le graphe
     * @param idSom identifiant du sommet
     * @return true si le sommet est dans le graphe, false sinon
     */
    public boolean estDansGraphe(int idSom){

        for(Sommet s : sommetsVoisins.keySet()){
            if(s.getId() == idSom){
                return true;
            }
        }
        return false;
    }


    /**
     * Calcule le degré du sommet
     * @param idSom identifiant du sommet
     * @return le degré du sommet
     */
    public int calculeDegre(int idSom){

        if(!estDansGraphe(idSom)){
            throw new IllegalArgumentException("Le sommet n'est pas dans le graphe");
        }

        int degre = 0;
        for(Sommet s : sommetsVoisins.keySet()){
            if(s.getId() == idSom){
                degre = sommetsVoisins.get(s).size();
            }
        }
        return degre;
    }


    /**
     * Calcule le degré de tout le graphe
     * @return le degré de tout le graphe
     */
    public HashMap<Sommet,Integer> calculeDegres(){

        HashMap<Sommet,Integer> degre = new HashMap<Sommet,Integer>();

        for(Sommet s : sommetsVoisins.keySet()){
            degre.put(s,sommetsVoisins.get(s).size());
        }

        return degre;
    }

    /**
     * Retourne la somme maximum des degrés du graphe
     * @return somme maximum des degrés du graphe
     */
    public Sommet somMaxDegre(){

        Sommet s = null;
        int max = 0;

        for(Sommet sommet : sommetsVoisins.keySet()){

            if(sommetsVoisins.get(sommet).size() > max){
                max = sommetsVoisins.get(sommet).size();
                s = sommet;
            }
        }

        return s;
    }

    /**
     * Vérifie si deux sommets sont voisins
     * @param idSom1 identifiant du premier sommet
     * @param indSom2 identifiant du deuxième sommet
     * @return true si les sommets sont voisins, false sinon
     */
    public boolean sontVoisins(int idSom1, int indSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return somVoisins.get(idSom1).contains(sommets.get(indSom2));
    }

    /**
     * Vérifie si il existe un chemin entre deux sommets
     * @param indSom1 indice du premier sommet
     * @param indSom2 indice du deuxième sommet
     * @return true si il existe un chemin entre les sommets, false sinon
     */
    public boolean existeChemin(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return existeChemin(sommets.get(indSom1),sommets.get(indSom2));
    }

    /**
     * Renvoie les voisins d'un sommet
     * @param indSom indice du sommet
     * @return liste des voisins du sommet
     */
    public ArrayList<Sommet> voisins(int indSom){

        if(indSom < 0) {
            throw new IllegalArgumentException("indSom doit être positif");
        }

        return somVoisins.get(indSom);
    }

    /**
     * Ajoute une arête entre deux sommets
     * @param indSom1 indice du premier sommet
     * @param indSom2 indice du deuxième sommet
     * @return true si l'ajout a réussi, false sinon
     */
    public boolean ajouteArete(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return ajouteArete(sommets.get(indSom1),sommets.get(indSom2));
    }

    /**
     * Retire une arête entre deux sommets
     * @param indSom1 indice du premier sommet
     * @param indSom2 indice du deuxième sommet
     * @return true si la suppression a réussi, false sinon
     */
    public boolean retireArete(int indSom1, int indSom2){

        if(indSom1 < 0) {
            throw new IllegalArgumentException("indSom1 doit être positif");
        }
        if(indSom2 < 0) {
            throw new IllegalArgumentException("indSom2 doit être positif");
        }

        return retireArete(sommets.get(indSom1),sommets.get(indSom2));
    }

    /**
     * Renvoie la matrice d'adjacence du graphe
     * @return matrice d'adjacence du graphe
     */
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

    /**
     * Vérifie si le graphe est connexe
     * @return true si le graphe est connexe, false sinon
     */
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

    /**
     * Vérifie si le graphe possède une composante connexe
     * @return true si le graphe possède une composante connexe, false sinon
     */
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

    /**
     * Renvoie le nombre d'arêtes entre deux sommets
     * @param idSom1 identifiant du premier sommet
     * @param idSom2 identifiant du deuxième sommet
     * @return nombre d'arêtes entre les sommets
     */
    public int distAretes(int idSom1, int idSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(idSom2 < 0) {
            throw new IllegalArgumentException("idSom2 doit être positif");
        }

        return dist[idSom1][idSom2];
    }

    /**
     * Renvoie le nombre maximal d'arêtes entre deux sommets
     * @param idSom identifiant du sommet
     * @return nombre maximal d'arêtes entre deux sommets
     */
    public int excentrite(int idSom){

        if(idSom < 0) {
            throw new IllegalArgumentException("idSom doit être positif");
        }

        int excentrit = 0;

        for(int i = 0; i < nbSommets(); i++){

            if(distAretes(idSom,i) > excentrit){

                excentrit = distAretes(idSom,i);
            }
        }

        return excentrit;
    }

    /**
     * Renvoie le maximum d'excentrité d'un sommet
     * @return maximum d'excentrité d'un sommet
     */
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

    /**
     * Renvoie le minimum d'excentrité d'un sommet
     * @return minimum d'excentrité d'un sommet
     */
    public int rayon(){

        int rayon = 0;

        for(int i = 0; i < nbSommets(); i++){

            if(calculeDegre(i) > rayon){

                rayon = calculeDegre(i);
            }
        }

        return rayon;
    }

    /**
     * Calcule la somme des distances entre deux sommets
     * @param idSom1 identifiant du premier sommet
     * @param idSom2 identifiant du deuxième sommet
     * @return somme des distances entre deux sommets
     */
    public double calculeDist(int idSom1, int idSom2){

        if(idSom1 < 0) {
            throw new IllegalArgumentException("idSom1 doit être positif");
        }
        if(idSom2 < 0) {
            throw new IllegalArgumentException("idSom2 doit être positif");
        }

        return Math.sqrt(Math.pow(sommets.get(idSom1).getX() - sommets.get(idSom2).getX(),2) + Math.pow(sommets.get(idSom1).getY() - sommets.get(idSom2).getY(),2));
    }

    /**
     * Renvoie la distance maximale entre un sommet et tout les autres
     * @param idSom identifiant du sommet
     * @return distance maximale entre un sommet et tout les autres
     */
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

    /**
     * Renvoie le maximum d'excentrité de distance
     * @return maximum d'excentrité de distance
     */
    public double diametreDist(){

        double diametre = 0;

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(calculeDist(i,j) > diametre){

                    diametre = calculeDist(i,j);
                }
            }
        }

        return diametre;
    }

    /**
     * Renvoie le minimum d'excentrité de distance
     * @return minimum d'excentrité de distance
     */
    public double rayonDist(){

        double rayon = 0;

        for(int i = 0; i < nbSommets(); i++){

            if(calculeDegre(i) > rayon){

                rayon = calculeDegre(i);
            }
        }

        return rayon;
    }

    /**
     * Renvoie une matrice de pondération
     * @return matrice de pondération
     */
    public double[][] matricePonderation(){

        double[][] matrice = new double[nbSommets()][nbSommets()];

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(sontVoisins(i,j)){

                    matrice[i][j] = calculeDist(i,j);
                }
            }
        }

        return matrice;
    }

    /**
     * Renvoie un nouveau graphe qui est la clôture transitive du graphe courant
     * @return nouveau graphe qui est la clôture transitive du graphe courant
     */
    public Graphe clotureTransitive(){

        Graphe g = new Graphe(this);

        for(int i = 0; i < nbSommets(); i++){

            for(int j = 0; j < nbSommets(); j++){

                if(g.sontVoisins(i,j)){

                    for(int k = 0; k < nbSommets(); k++){

                        if(g.sontVoisins(j,k)){

                            if(!g.sontVoisins(i,k)){

                                g.ajouteArete(i,k);
                            }
                        }
                    }
                }
            }
        }

        return g;
    }

}