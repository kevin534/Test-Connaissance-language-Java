package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime adesso = LocalDateTime.now();
		System.out.println("Oggi è " + adesso);
		
		System.out.println("--------------------------------------");
		
		LocalDate primoMaggio2017 = LocalDate.of(2014, Month.MAY, 1);
		
		System.out.println("primoMaggio2017 contiene " + primoMaggio2017);
		
		System.out.println("--------------------------------------");
		
		LocalDate cinquantesimoGirno = LocalDate.ofYearDay(2019, 50);
		
		System.out.println("Il 50° giorno del 2019 è corrispondente al " + cinquantesimoGirno );
				
		System.out.println("--------------------------------------");
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
				System.out.println("Oggi è " + formatter.format(adesso));
				
				System.out.println("--------------------------------------");
				
				Period periodo = Period.between(primoMaggio2017, adesso.toLocalDate());
				
				System.out.println(periodo.getDays() + "Mesi");
	}

}
