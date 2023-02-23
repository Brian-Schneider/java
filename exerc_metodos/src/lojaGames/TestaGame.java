package lojaGames;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto g1 = new Produto (123, "Elden Ring", 1, "Bandai Namco", 225.0f);
		Produto g2 = new Produto (456, "Switch", 2, "Nintendo", 2500.0f);
		
		Jogo j1 = new Jogo (123, "Elden Ring", 1, "Bandai Namco", 225.0f, 1);
		Jogo j2 = new Jogo (456, "Marvel's Midnight Suns", 1, "2K Games", 225.0f, 2);
		
		Console c1 = new Console (123, "PlayStation 5", 2, "Sony", 5000.0f, 1);
		Console c2 = new Console (456, "Switch", 2, "Nintendo", 2500.0f, 0);
		
		g1.visualizar();
		
		System.out.println("\n\n");
		
		g2.visualizar();
		
		System.out.println("\n\n");
		
		j1.visualizar();
		
		System.out.println("\n\n");
		
		j2.visualizar();
		
		System.out.println("\n\n");
		
		c1.visualizar();
		
		System.out.println("\n\n");
		
		c2.visualizar();
	}

}
