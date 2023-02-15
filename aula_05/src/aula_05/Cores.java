package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			String cor;
			System.out.println("Digite uma cor:");
			leia.skip("\\R?");
			cor = leia.nextLine().toUpperCase();
			cores.add(cor);
		}
		
		System.out.println("Listar todas as cores:\n");
		cores.forEach(System.out::println);
		System.out.println("\nOrdenar cores:\n");
		Collections.sort(cores);	
		cores.forEach(System.out::println);
		
		leia.close();

	}

}
