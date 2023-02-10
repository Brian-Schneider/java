package aula_03;

import java.util.Scanner;

public class MediaMultTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int i = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if((numero % 3) == 0 && numero != 0){
				soma = soma + numero;
				i++;
				
			}
			
		} while(numero != 0);
		
		double media = (float) soma/i;
		
		System.out.printf("\nA média de todos os números múltiplso de 3 é %.2f: ", media);
		
		leia.close();

	}

}
