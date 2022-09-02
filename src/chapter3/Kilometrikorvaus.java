package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		// Variables
		int kilometritYhteensa = 0, ajetutKilometrit;
		double korvaus;
		
		// Constants
		double KORVAUS_PER_KILOMETRI = 0.46;
		
		// Decimal format
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		ajetutKilometrit = input.nextInt();
		
		// Keep asking for kilometers until 0 is given
		while (ajetutKilometrit != 0) {
			// Add given kilometers to total kilometers
			kilometritYhteensa += ajetutKilometrit;
			
			// Read kilometers again
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			ajetutKilometrit = input.nextInt();
		}
		
		// Close input Scanner
		input.close();
		
		// Kilometers in total
		System.out.println("Yhteensä " + kilometritYhteensa + " kilometriä");
		
		// Calculate fee
		korvaus = KORVAUS_PER_KILOMETRI * kilometritYhteensa;
		
		// Print the fee
		System.out.println("Korvaus on " + resultFormat.format(korvaus) + " euroa");
	}

}
