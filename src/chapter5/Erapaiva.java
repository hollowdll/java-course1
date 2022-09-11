package chapter5;

import java.util.Scanner;
import java.time.LocalDate;

public class Erapaiva {

	public static void main(String[] args) {
		// Variables
		LocalDate laskuPaivamaara;
		
		// Constants
		final int ERAPAIVA = 14;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read input
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		
		try {
			// Parse given date
			laskuPaivamaara = LocalDate.parse(input.next());
			
			// Show result
			System.out.println("Eräpäivä on " + laskuPaivamaara.plusDays(ERAPAIVA));
			
		} catch(Exception e) {
			System.out.println("Laskun päivämäärä on virheellinen");
		}
		
		// Close input scanner
		input.close();
	}

}
