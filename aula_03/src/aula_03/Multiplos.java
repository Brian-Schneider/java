package aula_03;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num2 <= num1) {
			
			System.out.println("\nIntervalo inválido!");
			System.exit(0);
			
		}
		
		else {
			
			System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ":\n");
			
			for(int i = num1; i <= num2; i++) {
				
				int mult3 = i % 3;
				int mult5 = i % 5;
				
				if(mult3 == 0 && mult5 == 0)
					System.out.println(i + " é múltiplo de 3 e 5");
			}
				
		}
		
		leia.close();

	}

}
