package lojaGames;

public class Jogo extends Produto {
	
	private int plataforma;

	public Jogo(int id, String nomeProd, int tipoProd, String distFabr, float preco, int plataforma) {
		super(id, nomeProd, tipoProd, distFabr, preco);
		this.plataforma = plataforma;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}
	
	@Override
	public void visualizar() {
		
		super.visualizar();
		String plataforma = "";
		
		switch(this.plataforma) {
			case 1 -> plataforma = "PlayStation 5";
			case 2 -> plataforma = "Xbox One Series X/S ";
			case 3 -> plataforma = "Nintendo Switch";
			case 4 -> plataforma = "PC";
		}
		
		System.out.println("Plataforma: " + plataforma);
	}
	

}
