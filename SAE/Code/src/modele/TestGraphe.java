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

        System.out.println("sommets voisins : [(1,(2,4)), (2, (1,4)), (3,(4)),(4,(1,2,3,6)),(5,()),(6,(4))] \n" + g.toString());

        System.out.println("nb sommets : " + g.nbSommets() + " doit valoir 6");

        System.out.println("nb aretes : " + g.nbAretes() + " doit valoir 5");

        System.out.println("");

        System.out.println("est dans graphe : " + g.estDansGraphe(7) + " doit valoir false");

        System.out.println("calcul degre : " + g.estDansGraphe(5) + " doit valoir true");

        System.out.println("");

        System.out.println("calcul degre : " + g.calculeDegre(3) + " doit valoir 1");

        System.out.println("calcule degre : " + g.calculeDegre(4) + " doit valoir 4");

        System.out.println("calcule degre : " + g.calculeDegre(5) + " doit valoir 0");

        System.out.println("calcule degre : " + g.calculeDegres() + " doit valoir [(1,2), (2, 2), (3,1),(4,4),(5,0),(6,1)]");

        System.out.println("");

        System.out.println("sont voisins : " + g.sontVoisins(3,4) + " doit valoir true");

        System.out.println("sont voisins : " + g.sontVoisins(6,2) + " doit valoir false");

        System.out.println("");

        System.out.println("il existe un chemin entre 5 et 6 : " + g.existeChemin(5,6) + " doit valoir false");

        System.out.println("il existe un chemin entre 6 et 2 : " + g.existeChemin(6,2) + " doit valoir true");

        System.out.println("");

        System.out.println("Matrice adjacence : " + g.matriceAdjacence());

        System.out.println("est connexe : " + g.estConnexe());

        System.out.println("composante connexe : ");

        System.out.println("");

        for(int i = 0; i < g.composanteConnexe().size(); i++) {
            System.out.print(g.composanteConnexe().get(i));
        }

        System.out.println("distAretes(6,2) : " + g.distAretes(6, 2));

        System.out.println("excentricite(6) : " + g.excentricite(6));

        System.out.println("matrice de pondération : " + g.matricePonderation());

        System.out.println("");

        Graphe grapheEx2=g.clotureTransitive();

        System.out.println("GrapheEx2 estConnexe()"+grapheEx2.estConnexe()+" Doit valoir true");

        System.out.println("");

        System.out.println("GrapheEx2 exentricite(6)"+grapheEx2.excentricite(6)+" Doit valoir 2");

        System.out.println("GrapheEx2 exentricite(4)"+grapheEx2.excentricite(4)+" Doit valoir 1");

        System.out.println("");

        System.out.println("GrapheEx2 diametre()"+grapheEx2.diametre()+" Doit valoir 2");

        System.out.println("GrapheEx2 rayon()"+grapheEx2.rayon()+" Doit valoir 1");

        System.out.println("");

        System.out.println("GrapheEx2 calculDist(6,2)"+grapheEx2.calculeDist(6,2)+" Doit valoir 6");

        System.out.println("GrapheEx2 calculDist(3,2)"+grapheEx2.calculeDist(3,2)+" Doit valoir 8");

        System.out.println("");

        System.out.println("GrapheEx2 exentriciteDist(6)"+grapheEx2.excentriciteDist(6)+" Doit valoir 6");

        System.out.println("GrapheEx2 diametreDist()"+grapheEx2.diametreDist()+" Doit valoir 8");

        System.out.println("");
        
        System.out.println("GrapheEx2 rayonDist() "+grapheEx2.rayonDist()+" Doit valoir 4");




    }
}
