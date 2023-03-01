package matrizes;

import java.util.Scanner;

public class MatrizColuna {

	public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
	        int coluna = leia.nextInt();
	        double calculo = 0;
	        char opera = leia.next().toUpperCase().charAt(0);
	        double[][] matriz = new double[12][12];
	        for (int i = 0; i < matriz.length; i++) {
	        	for (int j = 0; j < matriz[i].length; j++) {
	        		matriz[i][j] = leia.nextDouble();
	        	}
	        }
	        
	    	for(int i = 0; i < matriz.length; i++) {
	    		calculo += matriz[i][coluna];
	    	}
	
	        if (opera == 'M')	
	        	calculo /= matriz.length;   
	    	System.out.println(String.format("%.1f", calculo));

	}

}
