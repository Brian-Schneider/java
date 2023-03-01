package vetores;
import java.util.Scanner;

public class PreenchVetoII {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int [] vetor = new int[1000];
		int num1 = 0;
		
		do {
			num = leia.nextInt();
			if(num < 2 && num > 50)
				System.out.println("Número inválido!");
		} while(num < 2 || num > 50);
		
		for(int i = 0; i < vetor.length; i++) {
			
			vetor[i] = num1;
			System.out.println("N[" + i + "] = " + vetor[i]);
			if(num1 < (num-1)) 
				num1++;
			
			else
				num1 = 0;
		
		}
		
		leia.close();
		
	}
}
