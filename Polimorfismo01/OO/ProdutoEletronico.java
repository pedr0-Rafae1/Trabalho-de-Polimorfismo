package OO;

public class ProdutoEletronico extends Produto {
	

    public ProdutoEletronico(String nome, double preço) {
		super(nome, preço);
    }
	@Override
    public void Desconto() {
		double Desconto = this.preço - (this.preço * 15/100);
		System.out.println("o valor do desconto nos eletronicos " + Desconto);
    }
}
