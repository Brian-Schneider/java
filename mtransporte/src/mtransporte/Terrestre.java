package mtransporte;

public class Terrestre extends Transporte{
	
	private int numRodas;
	private float velocidade;
	
	public Terrestre(int capacidade, int numRodas, float velocidade) {
		super(capacidade);
		this.numRodas = numRodas;
		this.velocidade = velocidade;
	}

	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {
		
		super.visualizar();
		System.out.println("Número de Rodas: " + this.numRodas);
		System.out.println("Velocidade: " + this.velocidade);
		
	}
	
	

}
