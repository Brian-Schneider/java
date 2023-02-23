package farmacia;

public class Farmacia {
	
	private long id;
	private String nome;
	private String fabricante;
	private int categoria;
	private float valor;
	
	public Farmacia(long id, String nome, String fabricante, int categoria, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
		this.categoria = categoria;
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

	public int getcategoria() {
		return categoria;
	}

	public void setcategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		String categoria = "";
		
		switch(this.categoria) {
			case 1 -> categoria = "Medicamento";
			case 2 -> categoria = "Perfumaria";
		}
		
		System.out.println("||--------------------------------------------------||");
		System.out.println("||                                                  ||");
		System.out.println("||                 DADOS DO PRODUTO                 ||");
		System.out.println("||                                                  ||");
		System.out.println("||--------------------------------------------------||");
		System.out.println("                                                      ");
		System.out.println("Id do Medicamento: " + this.id);
		System.out.println("Nome do Medicamento: " + this.nome);
		System.out.println("Nome do fabricante: " + this.fabricante);
		System.out.println("categoria do Medicamento: " + categoria);
		System.out.println("Valor do Medicamento: " + this.valor);
	}

}
