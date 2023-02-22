package farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia d1 = new Farmacia(123, "Scaflam", "Mantecorp", 1, 40.0f);
		Farmacia d2 = new Farmacia(456, "Nimesulida", "Cimed", 3, 21.0f);
		
		d1.visualizar();
		
		System.out.println("\n\n");
		
		d2.visualizar();
	}

}
