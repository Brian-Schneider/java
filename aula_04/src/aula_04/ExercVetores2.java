package aula_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercVetores2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		int[] vetor = new int [10];
		int soma = 0;
		
		for (int indice = 0; indice < vetor.length; indice++) {
			
			System.out.println("Digite o " + (indice + 1) + " º número:");
			vetor[indice] = leia.nextInt();
			System.out.println();
			soma += vetor[indice];
			
		}
		
		System.out.println("\nElementos nos índices ímpares:");
		
		for (int indice = 0; indice < vetor.length; indice++) {
			
			if (indice % 2 != 0)
				System.out.println(vetor[indice]);
			
		}
		
		System.out.println("\nElementos pares:");
		
		for (int indice = 0; indice < vetor.length; indice++) {
			
			if (vetor[indice] % 2 == 0)
				System.out.println(vetor[indice]);
			
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + df.format((float) soma/vetor.length));
		
		leia.close();
	}

}
