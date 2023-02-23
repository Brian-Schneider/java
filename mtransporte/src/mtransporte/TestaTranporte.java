package mtransporte;

public class TestaTranporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(5);
		Terrestre tr1 = new Terrestre(5, 4, 200);
		Automovel a1 = new Automovel(5, 4, 200, "Branco", 4, "XPT-2131", 5);
		Transporte t2 = new Transporte();
		
		t1.visualizar();
		
		System.out.println("\n\n");
		
		tr1.visualizar();
		
		System.out.println("\n\n");
		
		a1.visualizar();
		
		System.out.println("\n\n");
		
		t2.visualizar();
		
		System.out.println("\n\n");
		
		a1.mensagem();
		
		System.out.println("\n\n");
		
		a1.mensagem("O Carnaval acabou!!!");

	}

}
