package OO;

abstract class Figura {
	
	protected String cor;
	
	public Figura(String cor) {
		super();
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void Cor() {
		System.out.println("a cor da figura " + this.cor);
	}
	
	abstract void Area();

}
