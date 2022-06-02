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
        Sommet s6 = new Sommet(6, new Lieu(0,0), new Date(01/02/2021), EspeceObservee.LOUTRE);

        ArrayList<Sommet> listeSommets1 = new ArrayList<Sommet>();
        listeSommets1.add(s2);
        listeSommets1.add(s4);

        ArrayList<Sommet> listeSommets2 = new ArrayList<Sommet>();
        listeSommets2.add(s1);
        listeSommets2.add(s4);

        ArrayList<Sommet> listeSommets3 = new ArrayList<Sommet>();
        listeSommets3.add(s4);

        ArrayList<Sommet> listeSommets4 = new ArrayList<Sommet>();
        listeSommets4.add(s1);
        listeSommets4.add(s2);
        listeSommets4.add(s3);
        listeSommets4.add(s6);

        ArrayList<Sommet> listeSommets5 = new ArrayList<Sommet>();

        ArrayList<Sommet> listeSommets6 = new ArrayList<Sommet>();
        listeSommets6.add(s4);


        HashMap<Sommet,ArrayList<Sommet>> sommetsVoisins = new HashMap<Sommet,ArrayList<Sommet>>();

        sommetsVoisins.put(s1,listeSommets1);
        sommetsVoisins.put(s2,listeSommets2);
        sommetsVoisins.put(s3,listeSommets3);
        sommetsVoisins.put(s4,listeSommets4);
        sommetsVoisins.put(s5,listeSommets5);
        sommetsVoisins.put(s6,listeSommets6);

        Graphe g = new Graphe(sommetsVoisins);

        System.out.println("sommets voisins : \n" + g.toString());

        System.out.println("nb sommets : " + g.nbSommets());

        System.out.println("nb aretes : " + g.nbAretes());

        //System.out.println("est connexe : " + g.estConnexe());

        System.out.println("est dans graphe : " + g.estDansGraphe(1));

        System.out.println("est dans graphe : " + g.estDansGraphe(6));




    }
}
