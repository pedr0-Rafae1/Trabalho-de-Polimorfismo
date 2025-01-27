package OO;

public class ProdutoAlimentar extends Produto {
	
	public ProdutoAlimentar(String nome, double preço) {
		super(nome, preço);
	}
	
	@Override
    public void Desconto() {
		double Desconto = this.preço - (this.preço * 30/100);
		System.out.println("o valor do desconto nos Alimentos " + Desconto);
    }
	
}
