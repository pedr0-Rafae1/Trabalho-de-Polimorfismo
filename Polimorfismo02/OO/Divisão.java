package OO;

public class Divisão extends Operação {

	public Divisão(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public void Calcular() {
		double Divisão = this.numero1/ this.numero2;
		System.out.println("o valor da divisão do numero1 e numero2 " + Divisão);
	}
	
}
