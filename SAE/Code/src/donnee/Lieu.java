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
		// TODO - implement Lieu.Lieu
		if(x > 0 && y>0){
			this.xCoord = x;
			this.yCoord = y;
		}
		else{
			System.err.println("Les coordonnées de x ou y ne sont pas valides");
		}
	}
	
	public double getxCoord() {
		return xCoord;
	}

	public double getyCoord() {
		return yCoord;
	}

	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}

	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}

}