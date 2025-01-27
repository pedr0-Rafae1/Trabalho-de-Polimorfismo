package OO;

    public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void exibir() {
		super.exibir();
	}
	
	@Override
	 public void aumentar_Salario() {
		double aumento_salario = this.salario + (this.salario * 10/100);
		System.out.println("o novo salario do gerente e: " + aumento_salario);
	}
}
