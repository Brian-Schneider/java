package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int dp = 0, ds = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
				System.out.println("Digite elemento da matriz: ");
				matriz[linha][coluna] = leia.nextInt();
				
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal:");	
		for(int linha = 0; linha < matriz.length; linha++) {
			
			System.out.println(matriz[linha][linha]);
			dp += matriz[linha][linha];
			
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");	
		for(int linha = 0; linha < matriz.length; linha++) {
			
			System.out.println(matriz[linha][matriz.length - linha - 1]);
			ds += matriz[linha][matriz.length - linha - 1];
			
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + dp);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + ds);
		
		leia.close();
	}

}
