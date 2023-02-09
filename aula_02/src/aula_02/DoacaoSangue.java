package aula_02;

import java.text.Normalizer;
import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nomeDoador;
		int idadeDoador;
		char primDoaçao;
		boolean verificaçao = false;
		
		System.out.println("Digite o Nome do doador(a/e):");
		leia.skip("\\R?");
		nomeDoador = leia.nextLine();
		
		System.out.println("\nDigite a Idade do doador(a/e):");
		idadeDoador = leia.nextInt();
		
		System.out.println("\nPrimeira vez doando sangue (digite S ou N)");
		primDoaçao = leia.next().charAt(0);
		
		if (primDoaçao == 's' || primDoaçao =='S')
			verificaçao = true;
		else if (primDoaçao == 'n' || primDoaçao == 'N')
			verificaçao = false;
		else {
			System.out.println("\nCaractere Inválido!");
			System.exit(0); //Interrompe o programa no caso de inserido um caractere invalido
		}
		
		if (idadeDoador < 18 || idadeDoador > 69 || ((idadeDoador >= 60 && idadeDoador <= 69) && verificaçao == true))
			System.out.println("\n"+ nomeDoador + " não está apto(a/e) para doar sangue!");
		else
			System.out.println("\n" + nomeDoador + " está apto(a/e) para doar sangue!");

		leia.close();


	}

}
