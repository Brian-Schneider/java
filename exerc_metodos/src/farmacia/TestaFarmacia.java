package farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia d1 = new Farmacia(123, "Scaflam", "Mantecorp", 1, 40.0f);
		Farmacia d2 = new Farmacia(456, "Creme de Olhos Hyalu B5 Repair 15ml", "La Roche-Posay", 2, 152.0f);
		
		Medicamento m1 = new Medicamento(123, "Scaflam", "Mantecorp", 1, 40.0f, 1);
		Medicamento m2 = new Medicamento(456, "Nimesulida", "Cimed", 1, 21.0f, 3);
		
		Perfumaria p1 = new Perfumaria(123, "Talco Para Pés Tenys Pé 100g", "Baruel", 2, 16.0f, 1);
		Perfumaria p2 = new Perfumaria(456, "Creme de Olhos Hyalu B5 Repair 15ml", "La Roche-Posay", 2, 152.0f, 3);
		
		d1.visualizar();
		
		System.out.println("\n\n");
		
		d2.visualizar();
		
		System.out.println("\n\n");
		
		m1.visualizar();
		
		System.out.println("\n\n");
		
		m2.visualizar();
		
		System.out.println("\n\n");
		
		p1.visualizar();
		
		System.out.println("\n\n");
		
		p2.visualizar();
	}

}
