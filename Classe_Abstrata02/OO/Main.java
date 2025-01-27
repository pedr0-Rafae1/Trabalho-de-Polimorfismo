package OO;

public class Main {

	public static void main (String[] args) {
		
		Quadrado q1 = new Quadrado("cinza", 7);
		q1.Area();
		q1.Cor();
		
		
		Circulo c1 = new Circulo("branco",10);
		c1.Area();
		c1.Cor();
		
		Triangulo t1 = new Triangulo( "preto", 5,9 );
		t1.Area();
		t1.Cor();
		
	}
}
