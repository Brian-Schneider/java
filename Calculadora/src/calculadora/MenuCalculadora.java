package calculadora;
import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Calculos calc = new Calculos();
		
		double numero1, numero2;
		int opcao;
		
		while(true) {
			
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Sair");
			
			System.out.println("\nDigite o número da Operação desejada:");
			opcao = leia.nextInt();
			
			
			if(opcao == 0) {
				leia.close();
				System.exit(0);
			}
			
			System.out.println("\nDigite o primeiro número:");
			numero1 = leia.nextDouble();
			System.out.println("\nDigite o segundo número:");
			numero2 = leia.nextDouble();
			
			switch(opcao) {
				case 1 -> System.out.println("\nResultado da Soma: " + calc.soma(numero1, numero2));
				case 2 -> System.out.println("\nResultado da Soma: " + calc.subtracao(numero1, numero2));
				case 3 -> System.out.println("\nResultado da Soma: " + calc.multiplicacao(numero1, numero2));
				case 4 -> System.out.println("\nResultado da Soma: " + calc.divisao(numero1, numero2));
				default -> System.out.println("\nOpção Inválida!");
				
			}
		}
	}
		
}


