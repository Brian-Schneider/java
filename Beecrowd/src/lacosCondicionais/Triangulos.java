package lacosCondicionais;

import java.util.Scanner;

public class Triangulos {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double A, B, C, temp;
		
		A = leia.nextDouble();
		B = leia.nextDouble();
		C = leia.nextDouble();
		
		if (B > A) {
			temp = A;
			A = B;
			B = temp;
		}
		
		if(C > A) {
			temp = A;
			A = C;
			C = temp;
		}
		
		if(C > B) {
			temp = B;
			B = C;
			C = temp;
		}
		
		if(A >= (B + C))
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if((A*A) == ((B*B) + (C*C)))
				System.out.println("TRIANGULO RETANGULO");
			if((A*A) > ((B*B) + (C*C)))
				System.out.println("TRIANGULO OBTUSANGULO");
			if((A*A) < ((B*B) + (C*C)))
				System.out.println("TRIANGULO ACUTANGULO");
			if(A == B && B == C)
				System.out.println("TRIANGULO EQUILATERO");
			if(A == B || B == C)
				System.out.println("TRIANGULO ISOCELES");
			}
		leia.close();
	}
}
