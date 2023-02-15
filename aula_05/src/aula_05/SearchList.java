package aula_05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Integer[] array = new Integer []{2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		List<Integer> numeros = Arrays.asList(array);
		int num;
		
		
		
		System.out.println("Digite o número que você deseja encontrar:");
		num = leia.nextInt();
		
		if(numeros.contains(num))
			System.out.println("\nO número " + num + " está na posição: " + numeros.indexOf(num));
		else
			System.out.println("\nO número " + num + " não foi encontrado!");
		
		leia.close();		


	}

}
