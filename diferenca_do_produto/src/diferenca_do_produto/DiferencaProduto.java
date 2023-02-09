package diferenca_do_produto;

import java.util.Scanner;

public class DiferencaProduto {
	
	static Scanner leia = new Scanner(System.in);
	
	static float leitor = leia.nextFloat();
	
	public static void main(String[] args) {
		

		float numero1, numero2, numero3, numero4, diferença;
		
		System.out.printf("Inserir o primeiro número: ");
		numero1 = leitor;
		System.out.printf("\nInserir o segundo número: ");
		numero2 = leitor;
		System.out.printf("\nInserir o terceiro número: ");
		numero3 = leitor;
		System.out.printf("\nInserir o quarto número: ");
		numero4 = leitor;
		
		diferença = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("\nDiferença = %.0f", diferença);
		
	}

}