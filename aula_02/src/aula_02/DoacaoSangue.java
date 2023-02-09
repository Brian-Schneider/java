package aula_02;

import java.text.Normalizer;
import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nomeDoador;
		int idadeDoador;
		boolean primDoaçao;
		
		System.out.println("Digite o Nome do doador(a/e):");
		leia.skip("\\R?");
		nomeDoador = leia.nextLine();
		
		System.out.println("Digite a Idade do doador(a/e):");
		idadeDoador = leia.nextInt();
		
		System.out.println("Primeira vez doando sangue (digite 'false' para NÃO e 'true' para SIM)");
		primDoaçao = leia.nextBoolean();

		if (idadeDoador < 18 || idadeDoador > 69 || ((idadeDoador >= 60 && idadeDoador <= 69) && primDoaçao == true))
			System.out.println(nomeDoador + " não está apto(a/e) para doar sangue!");
		else
			System.out.println(nomeDoador + " está apto(a/e) para doar sangue!");

		leia.close();


	}

}
