package chapter4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {

	public static void main(String[] args) {
		// Variables
		int tuoteNumero;
		double tuoteHinta;
		String tuoteNimi;
		String tuoteKuvaus;
		
		// Decimal format
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna tuotenumero: ");
		tuoteNumero = input.nextInt();
		
		System.out.print("Anna tuotteen nimi: ");
		tuoteNimi = input.next();
		
		System.out.print("Anna tuotteen hinta: ");
		tuoteHinta = input.nextDouble();
		
		System.out.print("Anna tuotteen kuvaus: ");
		tuoteKuvaus = input.next();
		
		// Close input Scanner
		input.close();
		
		// Modify strings into the right format
		String tuoteNimiResult = tuoteNimi.trim().toUpperCase();
		String tuoteKuvausResult = tuoteKuvaus.trim();
		
		// Print results
		System.out.println("Numero: " + tuoteNumero);
		System.out.println("Nimi: " + tuoteNimiResult);
		System.out.println("Hinta: " + resultFormat.format(tuoteHinta));
		
		// Check if string is not empty
		if (tuoteKuvausResult != "") {
			System.out.println("Kuvaus: " + tuoteKuvausResult);
		}
	}

}
