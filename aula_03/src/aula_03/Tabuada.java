package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		boolean ok = false;
		char continuar;
		
		do {
			
			do {
	
				do {
					
					System.out.println("Digite a Tabuada que você deseja calcular:");
					numero = leia.nextInt();
					
					if (numero < 1 || numero > 10)
						System.out.println("\nDigite um número entre 1 e 10!");
					else
						ok = true;
					
				} while (numero < 1 || numero > 10);
				
				for (int contador = 1; contador <= 10; contador++) {
					System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
				}
	
			} while (ok == false);
			
			ok = false;
			
			System.out.println("\nDeseja continuar (S/N)?");
			continuar = leia.next().charAt(0);
		
		}while(continuar == 's' || continuar == 'S');
		
		leia.close();

	}

}
