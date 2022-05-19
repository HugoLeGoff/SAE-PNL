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
		try{
			if(x<0){
				throw new IllegalArgumentException("Les coordonnées x sont <0");
			}else{
				this.xCoord = x;
			}

			if(y<0){
				throw new IllegalArgumentException("Les coordonnées y sont <0");
			}else{
				this.yCoord = y;
			}
		}catch(IllegalArgumentException i){
			i.printStackTrace();
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
		if(xCoord > 0){
			this.xCoord = xCoord;
		}
		else{
			System.err.println("Lieu : Les coordonnées de x ne sont pas valides");
		}
	}

	/**
	 * Définit les coordonnees de y en Lambert 93 de Lieu.
	 * @param yCoord coordonnees de y en Lambert 93 de Lieu
	 */
	public void setyCoord(double yCoord) {
		if(yCoord > 0){
			this.yCoord = yCoord;
		}
		else{
			System.err.println("Lieu : Les coordonnées de y ne sont pas valides");
		}
	}

}