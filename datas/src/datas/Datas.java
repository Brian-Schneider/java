package datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Datas {

	public static void main(String[] args) {

			
			
			try {
				int dia = 12;
				int mes = 10;
				int ano = 2010;
				String pattern = "dd/MM/yyyy";
				
				SimpleDateFormat dataFormatada = new SimpleDateFormat(pattern);	
				LocalDate dob = LocalDate.of(ano, mes, dia);
				


	            // prints the age
	            System.out.println("Você tem " + calculateAge(dob) + " anos de idade");
	    }catch (DateTimeParseException e) {
	        System.out.println("Informe a data de acordo com o exemplo {DD/MM/AAAA}!");
	    }

	}

	    public static int calculateAge(LocalDate dob) {

	        LocalDate curDate = LocalDate.now();
	        if ((dob != null) && (curDate != null)) {
	            return Period.between(dob, curDate).getYears();
	        } else {
	            return 0;
	        }
	    }
			
			
			

	}


