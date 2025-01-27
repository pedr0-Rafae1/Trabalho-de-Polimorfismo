package OO;

public class ProdutoVestimentas extends Produto{
	
	public ProdutoVestimentas(String nome, double preço) {
		super(nome, preço);
	}

	@Override
    public void Desconto() {
		double Desconto = this.preço - (this.preço * 5/100);
		System.out.println("o valor do desconto das vestimentas " + Desconto);
    }
}
