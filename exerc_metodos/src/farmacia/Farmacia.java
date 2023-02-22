package farmacia;

public class Farmacia {
	
	private long id;
	private String nome;
	private String fabricante;
	private int tipo;
	private float valor;
	
	public Farmacia(long id, String nome, String fabricante, int tipo, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.valor = valor;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getfabricante() {
		return fabricante;
	}

	public void setfabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
			case 1 -> tipo = "Referência";
			case 2 -> tipo = "Similar";
			case 3 -> tipo = "Genérico";
		}
		
		System.out.println("||--------------------------------------------------||");
		System.out.println("||                                                  ||");
		System.out.println("||               DADOS DO MEDICAMENTO               ||");
		System.out.println("||                                                  ||");
		System.out.println("||--------------------------------------------------||");
		System.out.println("                                                      ");
		System.out.println("Id do Medicamento: " + this.id);
		System.out.println("Nome do Medicamento: " + this.nome);
		System.out.println("Nome do fabricante: " + this.fabricante);
		System.out.println("Tipo do Medicamento: " + tipo);
		System.out.println("Valor do Medicamento: " + this.valor);
	}

}
