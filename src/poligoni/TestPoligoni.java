package poligoni;

public class TestPoligoni {

	public static void main(String[] args) {
		// collaudo perimetro
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p3 = new Punto(5, -2);

		Punto[] vertici = { p1, p2, p3 };

		Poligono triangolo = new Poligono("Triangolo", vertici);
		// verifica toString
		System.out.println(triangolo);

		// verifica accessor
		System.out.println(triangolo.getNome());
		System.out.println(triangolo.getPerimetro());
		for (Punto p : triangolo.getVertici())
			System.out.println(p.toString());

		// test farfalle e poligoni vari
		// collaudo perimetro
		Punto r1 = new Punto(1, 1);
		Punto r2 = new Punto(5, 1);
		Punto r3 = new Punto(1, -2);
		Punto r4 = new Punto(5, -2);
		Punto[] pt = { r1, r2, r3, r4 };
		Punto[] pt2 = { r1, r4, r2, r3 };
		
		Poligono rect = new Poligono("rettangolo", pt);
		Poligono farf2 = new Poligono("farfalla", pt2);
		System.out.println(rect);
		System.out.println(farf2);
		
	}

}
