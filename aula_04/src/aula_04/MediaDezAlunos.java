package aula_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaDezAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("###.#");
		float [][] notasAlunos = new float[10][4];;
		float [] mediasAlunos = new float [10];
		
		
		for (int linha = 0; linha < notasAlunos.length; linha++) {
			
			float soma = 0;
			
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				
					System.out.println("Inserir a " + (coluna + 1) + "ª nota do aluno " + (linha + 1) + ":");
					notasAlunos[linha][coluna] = leia.nextFloat();
					soma = soma + notasAlunos[linha][coluna];
					System.out.println();				
			}
			
			mediasAlunos [linha] = soma/(notasAlunos[linha].length);
					
		}
		
		for (int linha = 0; linha < 3; linha++) {
			
			System.out.println("A nota do aluno " + (linha + 1) + " é " + df.format(mediasAlunos[linha]));
		}
		
		leia.close();

	}
	
}
