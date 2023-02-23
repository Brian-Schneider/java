package lojaGames;

public class Console extends Produto{
	
	private int numDeControles;

	public Console(int id, String nomeProd, int tipoProd, String distFabr, float preco, int numDeControles) {
		super(id, nomeProd, tipoProd, distFabr, preco);
		this.numDeControles = numDeControles;
	}

	public int getnumDeControles() {
		return numDeControles;
	}

	public void setnumDeControles(int numDeControles) {
		this.numDeControles = numDeControles;
	}
	
	@Override
	public void visualizar() {
		
		super.visualizar();
		
		System.out.println("Número de Controles: " + this.numDeControles);
	}
	

}
