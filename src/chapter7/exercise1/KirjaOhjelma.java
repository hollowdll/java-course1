package chapter7.exercise1;

import java.util.Scanner;
import java.text.DecimalFormat;

class KirjaOhjelma {

	public static void main(String[] args) {
		// Create object
		Kirja kirja = new Kirja();
		
		// Open input scanner
		Scanner input = new Scanner(System.in);
		
		// Ask for values and set them
		System.out.print("Anna nimi: ");
		kirja.setNimi(input.nextLine());
		
		System.out.print("Anna isbn: ");
		kirja.setIsbn(input.nextLine());
		
		System.out.print("Anna hinta: ");
		kirja.setHinta(input.nextDouble());
		
		System.out.print("Anna julkaisuvuosi: ");
		kirja.setJulkaisuVuosi(input.nextInt());
		
		// Close input scanner
		input.close();
		
		// Decimal format
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		// Show object attributes
		System.out.println("\nNimi: " + kirja.getNimi() + "\nIsbn: " + kirja.getIsbn() + 
							"\nHinta: " + decimals.format(kirja.getHinta()) + "\nJulkaisuvuosi: " + kirja.getJulkaisuVuosi());
	}

}
