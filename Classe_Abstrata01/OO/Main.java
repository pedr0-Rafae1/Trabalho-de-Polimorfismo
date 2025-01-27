package OO;

public class Main {
	
	public static void main (String[] args) {
		
		Gerente n1 = new Gerente("Fabricio", 1500);
		n1.aumentar_Salario();
		
		Programador p1 = new Programador("Miguel", 1800);
		p1.aumentar_Salario();
	}
}
