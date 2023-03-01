package aula_04;

import java.util.Scanner;

class MatrizQuadrada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n = leia.nextInt();
		
		int [][] arrayNum = new int [n][n];
		
		for(int i = 1; i <= n; i++) {
			int k = 1;
			for(int j = 1; j <= n; j++) { 
				if (i > j){
					if(n%2 == 1) {
						if(j < ((i/2) + 1))
						{
							k++;
							arrayNum[i-1][j-1] = k;
						}
						else {
							arrayNum[i-1][j-1] = k;
							k--;
						}
					}
					else if(n%2 == 0) {
						if(j < ((i/2)))
						{
							k++;
							arrayNum[i-1][j-1] = k;
						}
						else {
							arrayNum[i-1][j-1] = k;
							k--;
						}
					}
			
				}
					
			}
			
		}
		
		for (int[] numeros : arrayNum) {
			for (int numero : numeros) {
				System.out.print(numero);
				
			}
			System.out.println();
		}
		leia.close();	
		}
	}	


