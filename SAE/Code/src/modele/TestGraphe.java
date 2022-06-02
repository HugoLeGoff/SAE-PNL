package modele;
import donnee.*;
import traitement.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class TestGraphe {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Sommet s1 = new Sommet(1, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.LOUTRE);
        Sommet s2 = new Sommet(2, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.HIPPOCAMPE);
        Sommet s3 = new Sommet(3, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.BATRACIEN);
        Sommet s4 = new Sommet(4, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.CHOUETTE);
        Sommet s5 = new Sommet(5, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.GCI);

        ArrayList<Sommet> listeSommets = new ArrayList<Sommet>();
        listeSommets.add(s2);
        listeSommets.add(s3);
        listeSommets.add(s4);
        listeSommets.add(s5);

        HashMap<Sommet,ArrayList<Sommet>> sommetsVoisins = new HashMap<Sommet,ArrayList<Sommet>>();

        sommetsVoisins.put(s1,listeSommets);

        Graphe g = new Graphe(sommetsVoisins);

        System.out.println(g.toString());

        System.out.println(g.nbSommets());

        System.out.println(g.nbAretes());

    }
}
