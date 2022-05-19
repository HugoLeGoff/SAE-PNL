package donnee;
import java.util.*;
import java.sql.Time;

public interface IObs <T>{

	/**
	 * ajoute une observation à la liste des observations de la chouette
	 * @param obs l'observation à ajouter
	 */
	void ajouteUneObs(T obs);

	/**
	 * ajoute une liste d'observations à la liste des observations de la chouette
	 * @param obs la liste d'observations à ajouter
	 */
	void ajoutePlsObs(ArrayList<T> obs);

	/**
	 * vide la liste des observations de la chouette
	 */
	void videObs();

	/**
	 * retire une observation de la liste des observations de la chouette
	 * @param idObs l'id de l'observation à retirer
	 */
	boolean retireObs(int idObs);

	/**
	 * retourne le nombre d'observations de la chouette
	 * @return true si l'obs à bien été retirer
	 */
	int nbObs();

}