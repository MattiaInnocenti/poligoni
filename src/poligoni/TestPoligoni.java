package poligoni;

public class TestPoligoni {

	public static void main(String[] args) {
		Punto p1 = new Punto(2,1);
		Punto p2 = new Punto(4,1);
		Punto p3 = new Punto(5,2);
		
		Punto[] vertici = {p1,p2,p3}; 
		
		Poligono triangolo = new Poligono("Triangolo", vertici);
		System.out.println(triangolo);
	}

}
