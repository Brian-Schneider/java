package salarioliquido;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	
		System.out.printf("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.printf("\nDigite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.printf("\nDigite Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.printf("\nDigite Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (5 * horasExtras) - descontos;
		
		System.out.printf("\nO Salário Liquido é %.2f", salarioLiquido);

	}

}
