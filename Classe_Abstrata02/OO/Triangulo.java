package OO;

public class Triangulo extends Figura {

	private int base;
	private int altura;
	
	
	public Triangulo(String cor, int base, int altura) {
		super(cor);
		this.altura = altura;
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public void Area() {
		int Area = (base* altura)/2;
		System.out.println("a area do triangulo e " + Area);
	}
	@Override
	public void Cor() {
		super.Cor();
	}
}
