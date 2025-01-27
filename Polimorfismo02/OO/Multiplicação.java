package OO;

public class Multiplicação extends Operação{

	public Multiplicação(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public void Calcular() {
		int Produto = this.numero1 * this.numero2;
		System.out.println("o produto de numero1 e numero2 " + Produto);
	}
}
