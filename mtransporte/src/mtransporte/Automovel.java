package mtransporte;

public class Automovel extends Terrestre{
	
	private String cor;
	private int numPortas;
	private String placa;
	private int marchas;
	
	public Automovel(int capacidade, int numRodas, float velocidade, String cor, int numPortas, String placa,
			int marchas) {
		super(capacidade, numRodas, velocidade);
		this.cor = cor;
		this.numPortas = numPortas;
		this.placa = placa;
		this.marchas = marchas;
	}
	
	public Automovel(int capacidade, int numRodas, float velocidade, String cor, int numPortas,
			int marchas) {
		super(capacidade, numRodas, velocidade);
		this.cor = cor;
		this.numPortas = numPortas;
		this.marchas = marchas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cor: " + this.cor);
		System.out.println("Número de Portas: " + this.numPortas);
		System.out.println("Placa: " + this.placa);
		System.out.println("Marchas: " + this.marchas);
	}
	
	public void mensagem() {
		System.out.println("Mensagem Padrão!");
	}
	
	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

}
