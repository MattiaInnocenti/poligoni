package poligoni;

/**
 * Classe che descrive l'entità poligono, dotato di nome e costituito da un'insieme di vertici
 * @author mattia.innocenti3
 * @version 1.1
 */
public class Poligono {

	private Punto[] vertici;
	private String nome;

	public Poligono(String nome, Punto[] vertici) {
		this.nome = nome;
		this.vertici = vertici;
	}

	public String getNome() {
		return this.nome;
	}

	public Punto[] getVertici() {
		return this.vertici;
	}

	public int getNumVertici() {
		return this.vertici.length;
	}

	private double getLength(Punto p1, Punto p2) {
		double res = 0;
		res = Math.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()), 2) + Math.pow(Math.abs(p1.getY() - p2.getY()), 2));
		return res;
	}

	public double getPerimetro() {
		double res = 0;
		for (int i = 0; i < this.getNumVertici(); i++) {
			if (i == this.getNumVertici() - 1)
				res += this.getLength(vertici[i], vertici[0]);
			else
				res += this.getLength(vertici[i], vertici[i + 1]);
		}
		return res;
	}

	public String toString() {
		String res = "";
		for (Punto p : this.vertici)
			res += p.toString() + " ";
		res += "perimetro = " + this.getPerimetro();
		return res;
	}
}
