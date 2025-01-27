package OO;

public class Quadrado extends Figura {
	
	private int lado;

	public Quadrado(String cor, int lado) {
		super(cor);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public void Area() {
	    double Area = this.lado * this.lado;
	    System.out.println("a area do quadrado e " + Area);
	}
	@Override
	public void Cor() {
		super.Cor();
	}
}
