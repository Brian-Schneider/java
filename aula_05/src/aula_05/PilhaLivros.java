package aula_05;

import java.util.Stack;
import java.util.Scanner;

public class PilhaLivros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		String livro;	
		
		int opçao;
		
		do {
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livro");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada:");
			opçao = leia.nextInt();
		
			
			switch(opçao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha:\n");
				pilha.forEach(System.out::println);
				System.out.println("\nLivro Adicionado!\n");
				break;
			case 2:
				if(pilha.isEmpty())
					System.out.println("\nA Pilha está vazia!\n");
				else {
					System.out.println("\n");
					pilha.forEach(System.out::println);
					System.out.println("\n");
				}
				break;
			case 3:
				if(pilha.isEmpty())
					System.out.println("\nA Pilha está vazia!\n");
				else {
					pilha.pop();
					System.out.println("\nPilha:\n");
					pilha.forEach(System.out::println);
					System.out.println("\nUm Livro foi retirado da Pilha!\n");
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
