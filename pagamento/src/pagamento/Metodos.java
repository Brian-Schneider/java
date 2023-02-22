package pagamento;

import java.util.Scanner;

public class Metodos {

Scanner leia = new Scanner(System.in);
	
	private int idTipo;
	int cvv, casa;
	long cred;
	
	Cartao pc = new Cartao(cred);


	public Metodos(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	public void metodos1(int idTipo, float num) {
		
		
		switch(this.idTipo) {
		
			case 1:
				pc.cartao1(num);
				System.out.println(pc.cartao2(num));
				
				break;
			case 2:
				System.out.println("Chave(CNPJ): 63.981.632/0001-01");
				break;
			case 3:
				
				
				
		}
	}

}
