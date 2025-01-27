package OO;

public class Programador extends Funcionario {

	public Programador(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void exibir() {
		super.exibir();
	}
	
	@Override
	public void aumentar_Salario() {
		double aumento_salario = this.salario + (this.salario * 20/100);
		System.out.println(" o salario do programador com aumento e: " + aumento_salario);
	}
}
