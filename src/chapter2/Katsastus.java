package chapter2;

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		// Variables
		int tarkastusValinta, paastotValinta, polttoaineValinta, hinta;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		tarkastusValinta = input.nextInt();
		
		// Check which option was chosen
		if (tarkastusValinta == 2) {
			// Jälkitarkastus
			hinta = 30;
		} else if (tarkastusValinta == 1) {
			// Katsastus
			hinta = 50;
			
			// Read user input
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			paastotValinta = input.nextInt();
			
			// Check if emissions are included
			switch (paastotValinta) {
			case 0:
				break;
			case 1:
				// Check fuel type
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				polttoaineValinta = input.nextInt();
				
				// Close input Scanner since it is no longer needed
				input.close();
				
				switch (polttoaineValinta) {
				case 0:
					// Bensa
					hinta += 22;
					break;
				case 1:
					// Diesel
					hinta += 31;
				}
			}
		} else {
			hinta = 0;
		}
		
		// Print the result
		System.out.println("Hinta on " + hinta);
	}

}
