package OO;

public class Produto {

	protected String nome;
	protected double preço;
	
	public Produto(String nome, double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public void exibir() {
		System.out.println("o nome do produto " + this.nome);
		System.out.println("o preço do produto " + this.preço);
	}
	public void Desconto() {
		double Desconto = this.preço - (this.preço * 10/100);
		System.out.println("o valor do desconto " + Desconto);
	}
}
