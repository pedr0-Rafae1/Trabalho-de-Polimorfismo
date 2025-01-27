package OO;

public class Main {

	public static void main (String[] args) {
		
		Soma s1 = new Soma(3 , 5);
		s1.Calcular();
		
		Subtração d1 = new Subtração(5 , 9);
		d1.Calcular();
		
		Multiplicação m1 = new Multiplicação(4 , 7);
		m1.Calcular();
		
		Divisão c1 = new Divisão(10,5);
		c1.Calcular();
		
	}
}
