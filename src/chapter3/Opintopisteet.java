package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		// Variables
		int lukukaudet;
		double opintopisteetTavoite, opintopisteetYhteensa = 0, opintopisteetTarveTutkintoon;
		
		// Constants
		final int OPINTOPISTEET_TAVOITE_LUKUKAUDESSA = 30, TUTKINNON_OPINTOPISTEET = 210;
		
		// Decimal format
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna lukukausien määrä: ");
		lukukaudet = input.nextInt();
		
		// Loop through all semesters
		for (int lukukausi = 1; lukukausi <= lukukaudet; lukukausi++) {
			System.out.print("Anna " + lukukausi + ". lukukauden opintopisteesi: ");
			
			// Sum given values
			opintopisteetYhteensa += input.nextInt();
		}
		
		// Close input Scanner
		input.close();
		
		// Calculate and print details
		opintopisteetTavoite = lukukaudet * OPINTOPISTEET_TAVOITE_LUKUKAUDESSA;
		System.out.println("Sinulla pitäisi olla tähän mennessä " + resultFormat.format(opintopisteetTavoite) + " opintopistettä.");
		
		System.out.println("Sinulla on " + resultFormat.format(opintopisteetYhteensa) + " opintopistettä.");
		
		// Notification of goal status
		if (opintopisteetYhteensa < opintopisteetTavoite) {
			System.out.println("Olet jäljessä tavoitteesta.");
		} else if (opintopisteetYhteensa == opintopisteetTavoite) {
			System.out.println("Olet tavoitteessa.");
		} else {
			System.out.println("Olet edellä tavoitteesta.");
		}
		
		// Required points to graduate
		opintopisteetTarveTutkintoon = TUTKINNON_OPINTOPISTEET - opintopisteetYhteensa;
		System.out.println("Tutkinnosta puuttuu vielä " + resultFormat.format(opintopisteetTarveTutkintoon) + " opintopistettä.");
	}
	
}
