package ioOperadores;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        
        double n = 3.14159;
        double raio;
        raio = leia.nextDouble();
        
        System.out.println(String.format("A=%.4f", (n*raio*raio)));

	}

}
