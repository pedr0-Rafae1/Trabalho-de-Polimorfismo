package OO;

public class Circulo extends Figura {
	
	private int raio;
	
	public Circulo(String cor, int raio) {
		super(cor);
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	public void Area() {
	    double area = (this.raio * this.raio) * 3.14;
	    System.out.println("a area do circulo e " + area);
	}
	@Override
	public void Cor() {
		super.Cor();
	}
}
