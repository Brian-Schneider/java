package lojaGames;

public class Produtos {
	
	private String nomeGame;
	private int codGame;
	private String publisherGame;
	private int plataforma;
	private float precoGame;
	
	public Produtos(String nomeGame, int codGame, String publisherGame, int plataforma, float precoGame) {
		this.nomeGame = nomeGame;
		this.codGame = codGame;
		this.publisherGame = publisherGame;
		this.plataforma = plataforma;
		this.precoGame = precoGame;
	}
	
	public String getNomeGame() {
		return nomeGame;
	}
	public void setNomeGame(String nomeGame) {
		this.nomeGame = nomeGame;
	}
	public int getCodGame() {
		return codGame;
	}
	public void setCodGame(int codGame) {
		this.codGame = codGame;
	}
	public String getPublisherGame() {
		return publisherGame;
	}
	public void setPublisherGame(String publisherGame) {
		this.publisherGame = publisherGame;
	}
	public int getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}
	public float getPrecoGame() {
		return precoGame;
	}
	public void setPrecoGame(float precoGame) {
		this.precoGame = precoGame;
	}
	
	public void visualizar() {
		String console = "";
		
		switch(this.plataforma) {
		
			case 1 -> console = "PlayStation 5";
			case 2 -> console = "Xbox One Series X/S";
			case 3 -> console = "Nintendo Switch";
			case 4 -> console = "PC";
		
		}
		
		System.out.println("||---------------------------------------------------||");
		System.out.println("||                                                   ||");
		System.out.println("||                   DADOS DO GAME                   ||");
		System.out.println("||                                                   ||");
		System.out.println("||---------------------------------------------------||");
		System.out.println("                                                      ");
		System.out.println("Nome do Jogo: " + this.nomeGame);
		System.out.println("Código do Game: " + this.codGame);
		System.out.println("Publisher do Game: " + this.publisherGame);
		System.out.println("Plataforma do Game: " + console);
		System.out.println("Preço do Game: " + this.precoGame);
	}
	

}
