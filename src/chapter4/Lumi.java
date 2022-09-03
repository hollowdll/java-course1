package chapter4;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		// Variables
		int nimetLkm = 0, nimiLumiLkm = 0;
		String nimi;
		
		// Constants
		final String nimiLumi = "lumi";
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna nimi: ");
		nimi = input.next();
		
		// Loop
		while (!nimi.equals("LOPPU")) {
			nimetLkm++;
			
			// If name matches nimiLumi
			if (nimi.toLowerCase().equals(nimiLumi)) {
				nimiLumiLkm++;
			}
			
			// Ask again
			System.out.print("Anna nimi: ");
			nimi = input.next();
		}
		
		// Close input Scanner
		input.close();
		
		// Print results
		System.out.println("Nimiä oli " + nimetLkm + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + nimiLumiLkm + " kertaa.");
	}

}
