package aula_02;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeColaborador;
		String cargos = "";
		int codigoColaborador;
		double salarioColaborador, salarioReajustado;
		double porcReajuste = 0;
		
		System.out.println("Digite Nome do colaborador:");
		leia.skip("\\R?");
		nomeColaborador = leia.nextLine();
		
		System.out.println("\nDigite o Código do Cargo do colaborador:");
		codigoColaborador = leia.nextInt();
		
		System.out.println("\nDigite o Salário do colaborador:");
		salarioColaborador = leia.nextDouble();
		
		switch (codigoColaborador) {
			case 1:
				porcReajuste = 0.1;
				cargos = "Gerente";
				break;
			case 2:
				porcReajuste = 0.07;
				cargos = "Vendedor";
				break;
			case 3:
				porcReajuste = 0.09;
				cargos = "Supervisor";
				break;
			case 4:
				porcReajuste = 0.06;
				cargos = "Motorista";
				break;
			case 5:
				porcReajuste = 0.05;
				cargos = "Estoquista";
				break;
			case 6:
				porcReajuste = 0.08;
				cargos = "Técnico de TI";
				break;
			case 7:
				System.out.println("\nCódigo Inválido!");
				System.exit(0);
		}
		
		salarioReajustado = salarioColaborador + (porcReajuste * salarioColaborador);
		
		System.out.printf("Nome do colaborador: %s\n", nomeColaborador);
		System.out.printf("Cargo: %s\n", cargos);
		System.out.printf("Salário: R$ %.2f", salarioReajustado);
		

	}

}
