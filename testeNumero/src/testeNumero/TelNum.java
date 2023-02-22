package testeNumero;

import java.text.DecimalFormat;

public class TelNum {

	public static void main(String[] args) {
		
		long numFone = 11912345678l;
		//Gerar uma String de 12 "dígitos" colocando um '0' à esquerda (no DDD)   
		DecimalFormat foneDecimalFmt = new DecimalFormat("000000000000");
		String foneString = foneDecimalFmt.format(numFone);

		java.text.MessageFormat foneMsgFmt = new java.text.MessageFormat("({0}){1}-{2}");
		    //Agrupando no formato 3-5-4
		String[] numFoneArr = {foneString.substring(0, 3),
		          foneString.substring(3,8),
		          foneString.substring(8)};

		System.out.println(foneMsgFmt.format(numFoneArr));

	}

}
