package aula_03;

import java.util.Scanner;

public class PesquisaInterna {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char continuar = 's';
		int numBack = 0;
		int numFront = 0;
		int homMob = 0;
		int mulFS = 0;
		
		System.out.println("AVISO: para as partes sobre 'Sexo' e 'Categoira', inserir os respectivos códigos abaixo");
		
		System.out.println("\nSexo:");
		System.out.println("\t1 - Masculino");
		System.out.println("\t2 - Feminino");
		System.out.println("\t3 - Outros");
		System.out.println("\nCategoria");
		System.out.println("\t1 - Backend");
		System.out.println("\t2 - Frontend");
		System.out.println("\t3 - Mobile");
		System.out.println("\t4 - FullStack");
		
		while(continuar == 's' || continuar == 'S') {
			
			int idade = -1;
			int sexo = 0;
			int categoria = 0;
			
			while(idade < 0) {			
				System.out.println("\nDigite a Idade:");
				idade = leia.nextInt();
				if(idade < 0)
					System.out.println("\nNão existe idade negativa. Favor inserir idade válida.");
			}
			
			while(sexo < 1 || sexo > 3) {
				System.out.println("\nDigite o Sexo:");
				sexo = leia.nextInt();
				if(sexo < 1 || sexo > 3)
					System.out.println("\nCódigo Inválido! Digite: 1 - Masculino, 2 - Feminino ou 3 - Outros");
			}
			
			while(categoria < 1 || categoria > 4) {
				System.out.println("\nDigite a Categoria");
				categoria = leia.nextInt();
				if(categoria < 1 || categoria > 4)
					System.out.println("\nCódigo Inválido! Digite: 1 - Backend, 2 - Frontend, 3 - Mobile ou 4 - FullStack");
			}
			
			if(categoria == 1)
				numBack++;	
			if(sexo == 2 && categoria == 2)
				numFront++;
			if(sexo == 1 && categoria == 3 && idade > 40)
				homMob++;
			if(sexo == 2 && categoria == 4 && idade < 30)
				mulFS++;
			
			System.out.println("Deseja continuar (S/N)? ");
			continuar = leia.next().charAt(0);
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + numBack);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + numFront);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + homMob);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulFS);
		
		leia.close();
	}

}
;