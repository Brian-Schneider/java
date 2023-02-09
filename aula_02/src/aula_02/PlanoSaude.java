	package aula_02;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int faixa;
		
		System.out.println("Digite a sua faixa etária:");
		faixa = leia.nextInt();
		
		if (faixa == 1)
			System.out.println("O valor do seu Plano de Saúde será de R$ 100,00");
		else if (faixa == 2)
			System.out.println("O valor do seu Plano de Saúde será de R$ 200,00");
		else if (faixa == 3)
			System.out.println("O valor do seu Plano de Saúde será de R$ 300,00");
		else if (faixa == 4)
			System.out.println("O valor do seu Plano de Saúde será de R$ 500,00");
		else if (faixa == 5)
			System.out.println("O valor do seu Plano de Saúde será de R$ 600,00");
		else if (faixa == 6)
			System.out.println("O valor do seu Plano de Saúde será de R$ 1000,00");
		else
			System.out.println("Faixa etária inválida!");
		
		leia.close();
	}

}
