package OO;

public class Operação {

	protected int numero1;
	protected int numero2;
	
	public Operação(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public void Calcular() {
		System.out.println("calcula qualquer coisa");
	}
	
	
}
