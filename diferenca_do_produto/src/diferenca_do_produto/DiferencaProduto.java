package diferenca_do_produto;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4, diferença;
		
		System.out.printf("Inserir o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.printf("\nInserir o segundo número: ");
		numero2 = leia.nextFloat();
		System.out.printf("\nInserir o terceiro número: ");
		numero3 = leia.nextFloat();
		System.out.printf("\nInserir o quarto número: ");
		numero4 = leia.nextFloat();
		
		diferença = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("\nDiferença = %.0f", diferença);
		
	}

}