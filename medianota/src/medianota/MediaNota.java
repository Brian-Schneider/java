package medianota;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		System.out.printf("Inserir a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.printf("\nInserir a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.printf("\nInserir a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.printf("\nInserir a quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA Média Final é %.1f", mediaFinal);
	}

}
