package data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aniversario {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(1996, 2, 26);
		LocalDate end = LocalDate.now();
		long years = ChronoUnit.YEARS.between(start, end);
		System.out.println(years);

	}

}
