package numBoleto;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NumBoleto {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		long m = (long) Math.pow(10, 13);
		long ran1 = m + rand.nextLong(9 * m);
		long ran2 = m + rand.nextLong(9 * m);
		  
		
		Date vencimento = new Date();
		
		String bC = "07-10-1997";
		long difeDatas = 0;
       
 
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        try {
			Date bancoCentral = sdf.parse(bC);
			
			long difeDatasInMillies = Math.abs(vencimento.getTime() - bancoCentral.getTime());
		    difeDatas = TimeUnit.DAYS.convert(difeDatasInMillies, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        difeDatas++;  
        
        System.out.println(difeDatas);
                

		int random_int = (int)Math.floor(Math.random() * (9 - 0 + 1) + 0);
		
		
		int precoInt = 15075;
		
		//Gerar uma String de 12 "dígitos" colocando um '0' à esquerda (no DDD)   
		DecimalFormat foneDecimalFmt = new DecimalFormat("0000000000");
		String boletoString = "1239" + ran1 + ran2 + random_int + difeDatas + foneDecimalFmt.format(precoInt);
		

		java.text.MessageFormat boletoMsgFmt = new java.text.MessageFormat("{0}.{1} {2}.{3} {4}.{5} {6} {7}");
		
		System.out.println(boletoString);
		    //Agrupando no formato de código do boleto
		String[] numBoletoArr = {boletoString.substring(0, 5),
		          boletoString.substring(5,10),
		          boletoString.substring(10,15),
		          boletoString.substring(15,21),
		          boletoString.substring(21,26),
		          boletoString.substring(26,32),
		          boletoString.substring(32,33),
		          boletoString.substring(33)};

		System.out.println(boletoMsgFmt.format(numBoletoArr));
	}

}
