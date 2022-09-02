package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		// Variables
		double kotitalousvahennysMaara, tyokorvausYhteensa = 0, tyokorvaus;
		
		// Constants
		final double KOTITALOUSVAHENNYS_PROSENTTI = 0.40;
		final int KOTITALOUSVAHENNYS_MAX = 2250;
		final int OMAVASTUU = 100;
		
		// Decimal format
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		tyokorvaus = input.nextDouble();
		
		// Loop until 0 is given
		while (tyokorvaus != 0) {
			// Increment
			tyokorvausYhteensa += tyokorvaus;
			
			// Read input again
			System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
			tyokorvaus = input.nextDouble();
		}
		
		// Close input Scanner
		input.close();
		
		// Calculate kotitalousvahennysMaara
		kotitalousvahennysMaara = tyokorvausYhteensa * KOTITALOUSVAHENNYS_PROSENTTI - OMAVASTUU;
		
		// Make sure value is not above max value
		if (kotitalousvahennysMaara > KOTITALOUSVAHENNYS_MAX) {
			kotitalousvahennysMaara = KOTITALOUSVAHENNYS_MAX;
		} else if (kotitalousvahennysMaara < 0) {
			// Make sure value is not negative
			kotitalousvahennysMaara = 0;
		}
		
		// Print the result
		System.out.println("Kotitalousvähennyksen määrä on " + resultFormat.format(kotitalousvahennysMaara) + " euroa");
	}

}
