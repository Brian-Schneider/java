package menu;

import java.util.Scanner;

import pagamento.Metodos;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int id;
		
		System.out.println("1 - Cartão de Crédito");
		System.out.println("2 - Pix");
		System.out.println("3 - Boleto");
		id = leia.nextInt();
		
		Metodos m1 = new Metodos(id);
		
		float valor = 1200.0f;
		
		
		
		m1.metodos1(id, valor);
		
	}

}
