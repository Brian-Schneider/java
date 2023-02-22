package aula_metodos;

import static aula_metodos.pacote2.Classe2.*;

public class TestaMetodos {

	public static void main(String[] args) {
		
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		System.out.println(soma(4, 5));
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1();
		
		metodoPublicoPacote2();
		/* metodoPriendlyPacote2();
		metodoProtegidoPacote2();
		metodoPrivadoPacote2(); */
		
	}
	
	public static void metodoPublic() {
		System.out.println("Eu sou um Método Público!");
	}
	
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
		
	}
	
	static void metodoPadrao() {
		System.out.println("Eu sou um Método Frie]ndly!");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido!");
	}
	
	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado!");
	}
}
