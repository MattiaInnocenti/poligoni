package poligoni;

public class Punto {

	private double x, y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
