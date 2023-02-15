package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		int num;
		
		System.out.println("Digitar 10 númeroa entre 1 e 10:");
		for(int i = 0; i < 10; i++) {
			num = leia.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("\nListar os dados do Set:\n");
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		leia.close();
	}

}
