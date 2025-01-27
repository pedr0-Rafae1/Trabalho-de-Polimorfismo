package OO;

public class Pessoa implements Movimento, Voz{
	
	private String nome;
	private int Idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		Idade = idade;
	}
	
	@Override
	public void Andar() {
		System.out.println("A pessoa esta andando");
	}
	
	@Override
	public void Fala() {
		System.out.println("A Pessoa esta falando");
	}
	
	public void Exibir() {
		System.out.println("O nome da pessoa " + this.nome);
		System.out.println("A idade da pessoa " + this.Idade);
	}

}
