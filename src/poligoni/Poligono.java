package poligoni;

public class Poligono {
	
	private Punto[] vertici;
	private String nome;
	
	public Poligono(String nome, Punto[] vertici) {
		this.nome = nome;
		this.vertici = vertici;
	}
	
	public String getName() {
		return this.nome;
	}
	
	public Punto[] getVertici() {
		return this.vertici;
	}
	
	public String toString() {
		String res = "";
		for(Punto p : this.vertici)
			res += p.toString()+ " ";
		return res;
	}
}
