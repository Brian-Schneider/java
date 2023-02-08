package salario_com_abono;

import java.util.Scanner;

public class SalarioAtualizado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
		
		System.out.printf("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.printf("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("\nO novo salário é %.2f\n", novoSalario);
		
	}

}
