package OO;

public class Main {
	
	public static void main (String[] args) {
		
		ProdutoEletronico e1 = new ProdutoEletronico ("Geladeira", 2500);
		e1.Desconto();
		e1.exibir();
		
		ProdutoVestimentas p1 = new ProdutoVestimentas("Sapatos", 400);
		p1.Desconto();
		p1.exibir();
		
		ProdutoAlimentar a1 = new ProdutoAlimentar("refrigerante", 25);
		a1.Desconto();
		a1.exibir();
	}
}