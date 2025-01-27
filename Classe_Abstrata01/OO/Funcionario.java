package OO;

abstract class Funcionario {
	
	 protected String nome;
	 protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	abstract void aumentar_Salario();
	
	public void exibir() {
		System.out.println("o seu nome " + this.nome);
		System.out.println("o seu salario " + this.salario);
	}
}
