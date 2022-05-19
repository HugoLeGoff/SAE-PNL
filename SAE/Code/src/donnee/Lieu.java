package donnee;

public class Lieu {

	private double xCoord;
	private double yCoord;

	/**
	 * Constructeur de la classe lieu
	 * @param x Coordonnees de x en Lambert 93
	 * @param y Coordonnees de y en Lambert 93
	 */
	public Lieu(double x, double y) {
		if(x > 0 && y>0){
			this.xCoord = x;
			this.yCoord = y;
		}
		else{
			System.err.println("Lieu : Les coordonnées de x ou y ne sont pas valides");
		}
	}
	
	/**
	 * Renvoie les coordonnees de x en Lambert 93 de Lieu.
	 * @return coordonnees de x en Lambert 93 de Lieu
	 */
	public double getxCoord() {
		return this.xCoord;
	}
	/**
	 * Renvoie les coordonnees de y en Lambert 93 de Lieu.
	 * @return coordonnees de y en Lambert 93 de Lieu
	 */
	public double getyCoord() {
		return this.yCoord;
	}

	/**
	 * Définit les coordonnees de x en Lambert 93 de Lieu.
	 * @param xCoord coordonnees de x en Lambert 93 de Lieu
	 */
	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}

	/**
	 * Définit les coordonnees de y en Lambert 93 de Lieu.
	 * @param yCoord coordonnees de y en Lambert 93 de Lieu
	 */
	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}

}