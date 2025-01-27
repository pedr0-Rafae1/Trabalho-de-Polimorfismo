package OO;

public class Subtração extends Operação {

	public Subtração(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public void Calcular() {
		int Diferença = this.numero1 - this.numero2;
		System.out.println("o valor da  Diferença do numero1 e numero2 " + Diferença);
	}
}
