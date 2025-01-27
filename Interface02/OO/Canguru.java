package OO;

public class Canguru extends Animal implements Caminhador,Saltador{
	
	@Override
	public void Comer() {
		System.out.println("o canguru esta comendo folhas de arbusto");
	}
	
	@Override 
	public void Caminhar() {
		System.out.println("o canguru esta caminhando");
		
	}
	@Override
	public void Saltar() {
		System.out.println("o canguru deu um grande salto");
	}

}
