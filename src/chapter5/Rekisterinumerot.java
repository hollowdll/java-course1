package chapter5;

import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		// Variables
		int lkm = 0;
		String rekisterinumero;
		
		// Constants
		final int MAX_SIZE = 20;
		
		// Array
		String[] rekisterinumerot = new String[MAX_SIZE];
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask for values
		for (int i = 0; i < MAX_SIZE; i++) {
			// Ask and read input
			System.out.print("Anna rekisterinumero: ");
			rekisterinumero = input.next();
			
			// If input is supposed to end this loop
			if (rekisterinumero.equals("-")) {
				break;
			} else {
				lkm++;
				rekisterinumero = rekisterinumero.trim().toUpperCase();
				
				// Add value to array
				rekisterinumerot[i] = rekisterinumero;
			}
		}
		
		// Close input scanner
		input.close();
		
		// Show values
		for (int i = 0; i < lkm; i++) {
			System.out.println(rekisterinumerot[i]);
		}
	}

}
