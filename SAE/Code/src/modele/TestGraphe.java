package modele;
import donnee.*;
import traitement.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class TestGraphe {

    public static void main(String[] args) {
        
        Sommet s1 = new Sommet(1, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.LOUTRE);
        Sommet s2 = new Sommet(2, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.HIPPOCAMPE);
        Sommet s3 = new Sommet(3, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.BATRACIEN);
        Sommet s4 = new Sommet(4, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.CHOUETTE);
        Sommet s5 = new Sommet(5, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.GCI);

        ArrayList<Sommet> listeSommets1 = new ArrayList<Sommet>();
        listeSommets1.add(s2);
        listeSommets1.add(s3);
        listeSommets1.add(s4);
        listeSommets1.add(s5);

        HashMap<Sommet,ArrayList<Sommet>> sommetsVoisins = new HashMap<Sommet,ArrayList<Sommet>>();
        ArrayList<Sommet> listeSommets0 = new ArrayList<Sommet>();

        sommetsVoisins.put(s1,listeSommets0);
        sommetsVoisins.put(s2,listeSommets0);
        sommetsVoisins.put(s3,listeSommets0);
        sommetsVoisins.put(s4,listeSommets0);
        sommetsVoisins.put(s5,listeSommets0);

        Graphe g = new Graphe(sommetsVoisins);

        System.out.println("sommets voisins : " + g.toString());

        System.out.println("nb sommets : " + g.nbSommets());

        System.out.println("nb aretes : " + g.nbAretes());

        //System.out.println("est connexe : " + g.estConnexe());

        System.out.println("est dans graphe : " + g.estDansGraphe(1));


    }
}
