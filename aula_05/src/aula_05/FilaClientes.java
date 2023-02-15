package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaClientes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		String cliente;	
		
		int opçao;
		
		do {
			System.out.println("1 - Adicionar Cliente a Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada:");
			opçao = leia.nextInt();
		
			
			switch(opçao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nFila:\n");
				fila.forEach(System.out::println);
				System.out.println("\nCliente Adicionado!\n");
				break;
			case 2:
				if(fila.isEmpty())
					System.out.println("\nA Fila está vazia!\n");
				else {
					System.out.println("\n");
					fila.forEach(System.out::println);
					System.out.println("\n");
				}
				break;
			case 3:
				if(fila.isEmpty())
					System.out.println("\nA Fila está vazia!\n");
				else {
					fila.poll();
					System.out.println("\nFila:\n");
					fila.forEach(System.out::println);
					System.out.println("\nO Cliente foi chamado!\n");
				}
				break;
			default:
				if(opçao > 3)
					System.out.println("\nOpção Inválida!\n");
			}
		} while(opçao != 0);
	
		leia.close();
	}

}
