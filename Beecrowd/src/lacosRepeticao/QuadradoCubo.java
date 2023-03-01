package lacosRepeticao;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		do {
			n = leia.nextInt();
		}while(n < 2 || n > 999);
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i+" "+(i*i)+" "+(i*i*i));
		}
		leia.close();
	}

}
