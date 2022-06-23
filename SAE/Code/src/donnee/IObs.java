package donnee;
import java.util.*;

/**
 * interface d'une observation
 */
public interface IObs <T>{

	/**
	 * Ajoute une observation à la liste des observations de la chouette.
	 * @param obs l'observation à ajouter
	 */
	void ajouteUneObs(T obs);

	/**
	 * Ajoute une liste d'observations à la liste des observations de la chouette.
	 * @param obs la liste d'observations à ajouter
	 */
	void ajoutePlsObs(ArrayList<T> obs);

	/**
	 * Vide la liste des observations de la chouette.
	 */
	void videObs();

	/**
	 * Retire une observation de la liste des observations de la chouette.
	 * @param idObs l'id de l'observation à retirer
	 * @return true si une observation est retiré, fasle sinon
	 */
	boolean retireObs(int idObs);

	/**
	 * Retourne le nombre d'observations de la chouette.
	 * @return true si l'obs à bien été retirer
	 */
	int nbObs();

}