package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("###.##");
		Scanner leia = new Scanner(System.in);
		
		int operaçao;
		double saldo = 1000;
		double saque, deposito;
		
		System.out.println("Operação:");
		operaçao = leia.nextInt();
		
		switch(operaçao) {
			case 1:
				System.out.println("\nOperação - Saldo");
				System.out.println("\nSaldo: R$" + df.format(saldo));
				break;
			case 2:
				System.out.println("\nOperação - Saque");
				System.out.println("\nDigite valor a ser sacado: ");
				saque = leia.nextFloat();
				if(saque <= saldo)
					System.out.println("\nNovo saldo: R$" + df.format(saldo - saque));
				else
					System.out.println("\nSaldo insufuciente!");
				break;
			case 3:
				System.out.println("\nOperação - Depóstio");
				System.out.println("\nDigite valor a ser depositado: ");
				deposito = leia.nextFloat();
				System.out.println("\nNovo saldo: R$" + df.format(saldo + deposito));
				break;
			default:
				System.out.println(("\nOperação inválida"));
				
		}
		
		leia.close();

	}

}
