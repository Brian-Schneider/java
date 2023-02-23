package farmacia;

public class Medicamento extends Farmacia{
	
	private int tipoMedicamento;

	public Medicamento(long id, String nome, String fabricante, int categoria, float valor, int tipoMedicamento) {
		super(id, nome, fabricante, categoria, valor);
		this.tipoMedicamento = tipoMedicamento;
	}

	public int getTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(int tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}
	
	@Override
	public void visualizar() {
		
		super.visualizar();
		String tipoMedicamento = "";
		
		switch(this.tipoMedicamento) {
			case 1 -> tipoMedicamento = "Referência";
			case 2 -> tipoMedicamento = "Similar";
			case 3 -> tipoMedicamento = "Genérico";
		}
		
		System.out.println("Tipo do Medicamento: " + tipoMedicamento);
	}

}
