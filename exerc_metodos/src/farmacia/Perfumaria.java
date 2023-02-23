package farmacia;

public class Perfumaria extends Farmacia {
	
	private int catPerfumaria;

	public Perfumaria(long id, String nome, String fabricante, int categoria, float valor, int catPerfumaria) {
		super(id, nome, fabricante, categoria, valor);
		this.catPerfumaria = catPerfumaria;
	}

	public int getCatPerfumaria() {
		return catPerfumaria;
	}

	public void setCatPerfumaria(int catPerfumaria) {
		this.catPerfumaria = catPerfumaria;
	}
	
	@Override
	public void visualizar() {
		
		super.visualizar();
		String catPerfumaria = "";
		
		switch(this.catPerfumaria) {
			case 1 -> catPerfumaria = "Higiene Pessoal";
			case 2 -> catPerfumaria = "Maquiagem";
			case 3 -> catPerfumaria = "Cosméticos";
		}
		
		System.out.println("Tipo do Medicamento: " + catPerfumaria);
	}

}
