package OO;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Joao", 15);
		p1.Exibir();
		p1.Andar();
		p1.Fala();
		
		Pessoa p2 = new Pessoa("Ricardo", 30);
		p2.Exibir();
		p2.Andar();
		p2.Fala();
	}

}
