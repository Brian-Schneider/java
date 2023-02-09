package aula_02;

import java.text.Normalizer;
import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String grupo, filo, alimentaçao;

		System.out.println("Esse animal é do grupo dos Vertebrados ou Invertebrados?");
		leia.skip("\\R?");
		grupo = leia.nextLine();

		if (grupo.equalsIgnoreCase("Vertebrados")) {
			System.out.println("\nEsse animal é Ave ou Mamífero?");
			leia.skip("\\R?");
			filo = leia.nextLine();

			filo = Normalizer.normalize(filo, Normalizer.Form.NFD);
			filo = filo.replaceAll("[^\\p{ASCII}]", "");

			if (filo.equalsIgnoreCase("Ave")) {

				System.out.println("\nEsse animal é Carnívoro ou Onívoro?");
				leia.skip("\\R?");
				alimentaçao = leia.nextLine();

				alimentaçao = Normalizer.normalize(alimentaçao, Normalizer.Form.NFD);
				alimentaçao = alimentaçao.replaceAll("[^\\p{ASCII}]", "");

				if (alimentaçao.equalsIgnoreCase("Carnivoro"))
					System.out.println("Águia");
				else if (alimentaçao.equalsIgnoreCase("Onivoro"))
					System.out.println("Pomba");
				else
					System.out.println("\nTipo de alimentação inválida!");
			}

			else if (filo.equalsIgnoreCase("Mamifero")) {

				System.out.println("\nEsse animal é Onívoro ou Herbívoro?");
				leia.skip("\\R?");
				alimentaçao = leia.nextLine();

				alimentaçao = Normalizer.normalize(alimentaçao, Normalizer.Form.NFD);
				alimentaçao = alimentaçao.replaceAll("[^\\p{ASCII}]", "");

				if (alimentaçao.equalsIgnoreCase("Herbivoro"))
					System.out.println("Vaca");
				else if (alimentaçao.equalsIgnoreCase("Onivoro"))
					System.out.println("Homem");
				else
					System.out.println("\nTipo de alimentação inválida!");
			} else
				System.out.println("\nFilo inválido!");
		}

		else if (grupo.equalsIgnoreCase("Invertebrados")) {
			System.out.println("\nEsse animal é Inseto ou Anelídeo");
			leia.skip("\\R?");
			filo = leia.nextLine();

			filo = Normalizer.normalize(filo, Normalizer.Form.NFD);
			filo = filo.replaceAll("[^\\p{ASCII}]", "");

			if (filo.equalsIgnoreCase("Inseto")) {

				System.out.println("\nEsse animal é Hematófago ou Herbívoro?");
				leia.skip("\\R?");
				alimentaçao = leia.nextLine();

				alimentaçao = Normalizer.normalize(alimentaçao, Normalizer.Form.NFD);
				alimentaçao = alimentaçao.replaceAll("[^\\p{ASCII}]", "");

				if (alimentaçao.equalsIgnoreCase("Hematofago"))
					System.out.println("Pulga");
				else if (alimentaçao.equalsIgnoreCase("Herbivoro"))
					System.out.println("Lagarta");
				else
					System.out.println("\nTipo de alimentação inválida!");
			}

			else if (filo.equalsIgnoreCase("Anelideo")) {

				System.out.println("\nEsse animal é Onívoro ou Hematófago?");
				leia.skip("\\R?");
				alimentaçao = leia.nextLine();

				alimentaçao = Normalizer.normalize(alimentaçao, Normalizer.Form.NFD);
				alimentaçao = alimentaçao.replaceAll("[^\\p{ASCII}]", "");

				if (alimentaçao.equalsIgnoreCase("Hematofago"))
					System.out.println("Sanguessuga");
				else if (alimentaçao.equalsIgnoreCase("Onivoro"))
					System.out.println("Minhoca");
				else
					System.out.println("\nTipo de alimentação inválida!");
			}

			else
				System.out.println("\nFilo inválido!");
		} else
			System.out.println("\nGrupo inválido!");

		leia.close();

	}

}
