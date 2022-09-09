package chapter5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sahkolasku {

	public static void main(String[] args) {
		// Variables
		double kilowattituntiHinta;
		
		// Constants
		final int KUUKAUDET = 6;
		
		// Array
		int[] sahkonkulutukset = new int[KUUKAUDET];
		
		// Decimal format
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read input
		System.out.print("Anna kilowatin hinta euroina: ");
		kilowattituntiHinta = input.nextDouble();
		
		// Loop through every month
		for (int i = 0; i < KUUKAUDET; i++) {
			System.out.print("Anna kuukauden " + (i+1) + " sähkölukema: ");
			
			// Add value to array
			sahkonkulutukset[i] = input.nextInt();
		}
		
		// Close input scanner
		input.close();
		
		// Show results for each month
		for (int i = 0; i < KUUKAUDET; i++) {
			// Calculate fee
			double sahkolasku = kilowattituntiHinta * sahkonkulutukset[i];
			
			// Show fee
			System.out.println((i+1) + ". kuukauden kulutus: " + sahkonkulutukset[i] + "kWh " + decimals.format(sahkolasku) + " euroa");
		}
	}

}
