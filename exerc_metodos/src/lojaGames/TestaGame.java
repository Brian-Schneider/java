package lojaGames;

public class TestaGame {

	public static void main(String[] args) {
		
		Produtos g1 = new Produtos ("Elden Ring", 123, "Bandai Namco", 1, 225.0f);
		Produtos g2 = new Produtos ("Marvel's Midnight Suns", 456, "2K Games", 2, 200.0f);
		
		g1.visualizar();
		
		System.out.println("\n\n");
		
		g2.visualizar();
	}

}
