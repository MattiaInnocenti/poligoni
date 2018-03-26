package poligoni;

/**
 * Questa è una classe che descrive l'entità punto.
 * @author mattia.innocenti3
 * @version 1.1
 */
public class Punto {

	private double x, y;

	/**
	 * Costruttore parametico che prende in ingresso i valori x e y del punto che si intende
	 * inizializzare
	 * @param x ascissa del punto
	 * @param y ordinata del punto
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @return Metodo accessor restituisce il valore della x del punto corrente.
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * 
	 * @return Metodo accessor restituisce il valore della x del punto corrente.
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * Fornisce una rappresentazione del punto nel formato (x, y)
	 */
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
