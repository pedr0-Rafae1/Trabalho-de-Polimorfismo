package OO;

public class Soma extends Operação {

	public Soma(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public void Calcular() {
		int Soma = this.numero1 + this.numero2;
		System.out.println("o valor da soma do numero1 e numero2 " + Soma);
	}
	
}
