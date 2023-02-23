package lojaGames;

public class Produto {
	
	
	private int id;
	private String nomeProd;
	private int tipoProd;
	private String distFabr;
	private float preco;
	
	
	public Produto(int id, String nomeProd, int tipoProd, String distFabr, float preco) {
		this.id = id;
		this.nomeProd = nomeProd;
		this.tipoProd = tipoProd;
		this.distFabr = distFabr;
		this.preco = preco;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomeProd() {
		return nomeProd;
	}



	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}



	public int getTipoProd() {
		return tipoProd;
	}



	public void setTipoProd(int tipoProd) {
		this.tipoProd = tipoProd;
	}



	public String getDistFabr() {
		return distFabr;
	}



	public void setDistFabr(String distFabr) {
		this.distFabr = distFabr;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public void visualizar() {
		String tipoProd = "";
		
		switch(this.tipoProd) {
		
			case 1 -> tipoProd = "Jogo";
			case 2 -> tipoProd = "Console";
		}
		
		System.out.println("||---------------------------------------------------||");
		System.out.println("||                                                   ||");
		System.out.println("||                 DADOS DO PRODUTO                  ||");
		System.out.println("||                                                   ||");
		System.out.println("||---------------------------------------------------||");
		System.out.println("                                                      ");
		System.out.println("Id do Produto: " + this.id);
		System.out.println("Nome do Produto: " + this.nomeProd);
		System.out.println("Tipo: " + tipoProd);
		System.out.println("Fabricante/Desenvolvedora: " + this.distFabr);
		System.out.println("Preço: " + this.preco);
	}
	

}
