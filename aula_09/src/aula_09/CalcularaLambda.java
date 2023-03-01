package aula_09;

import java.util.Scanner;

public class CalcularaLambda {

	public static int calcular(OperacaoMatematica om, int num1, int num2) {
		return om.executar(num1, num2);
	}
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = leia.nextInt();
		
		System.out.println("A Soma dos 2 números é igual a: " + calcular((a,b) -> a + b, num1, num2));
		System.out.println("A Soma dos 2 números é igual a: " + calcular((a,b) -> a - b, num1, num2));
		
		leia.close();
	}

}
