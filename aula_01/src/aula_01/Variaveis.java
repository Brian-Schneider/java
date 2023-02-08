package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("###.##");
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String nome;
		double area;
			
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
			
		System.out.println("Digite um nome: ");
	    leia.skip("\\R?");
		nome = leia.nextLine();
					
		System.out.print("Digite um número real: ");
		area = leia.nextFloat();
			
		System.out.println("O nome da participante é: " + nome);
		System.out.println("O numero é: " + numero);
		System.out.printf("O numero é: %.2f\n", area);
		System.out.println("O numero é: " + new DecimalFormat("###.##").format(area));
		

	}

}
