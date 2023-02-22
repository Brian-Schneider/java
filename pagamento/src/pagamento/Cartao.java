package pagamento;

import java.util.Scanner;

public class Cartao {
	
	Scanner leia = new Scanner(System.in);
	private float cred;
	float credito = 1000.0f;
	
	
	long numCartao;
	String nomeTitular;
	int cvv;
	
	public float getCred() {
		return cred;
	}

	public void setCred(float cred) {
		this.cred = cred;
	}

	
	public Cartao(float cred) {
		
		this.cred = cred;
	}
	
	
	
	public void cartao1(float num) {
		
		System.out.println("Digite número do Cartão");
		numCartao = leia.nextLong();
		System.out.println("Digite Nome do Titular");
		leia.skip("\\R?");
		nomeTitular = leia.nextLine();
		System.out.println("Digite o CVV");
		cvv = leia.nextInt();
		
	}
	
	public boolean cartao2(float num) {
		
		if(num > credito)
			return false;
		else
			return true;
	}


}
