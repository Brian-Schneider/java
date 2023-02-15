package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int num;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar:");
		num = leia.nextInt();
		
		if(numeros.contains(num))
			System.out.println("\nO número " + num + " foi encontrado!");
		else
			System.out.println("\nO número " + num + " não foi encontrado!");
		
		leia.close();		

	}

}
