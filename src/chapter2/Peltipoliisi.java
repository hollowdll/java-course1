package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {

	public static void main(String[] args) {
		// Variables
		int nopeus, ylinopeus;
		double nettokuukausitulot, paivasakko;
		
		// Constants
		final int NOPEUSRAJOITUS = 80;
		
		// Decimal format
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna nopeutesi: ");
		nopeus = input.nextInt();
		
		// Calculate possible speeding
		ylinopeus = nopeus - NOPEUSRAJOITUS;
		
		// Speeding consequences
		if (ylinopeus > 0 && ylinopeus <= 20) {
			// Liikennevirhemaksu
			System.out.println("Liikennevirhemaksu");
		} else if (ylinopeus > 20) {
			// Päiväsakko
			System.out.println("Päiväsakko");
			
			// Ask for salary
			System.out.print("Anna nettokuukausitulosi: ");
			nettokuukausitulot = input.nextDouble();
			
			// Calculate the fee
			paivasakko = (nettokuukausitulot - 255) / 60;
			
			// Make sure it's at least 6 euro
			if (paivasakko < 6) {
				paivasakko = 6;
			}
			
			// Print the fee
			System.out.println("Päiväsakon määrä on " + resultFormat.format(paivasakko) + " euroa");
			
		} else {
			// Ei sakkoja
			System.out.println("Ei sakkoja");
		}
		
		// Close input Scanner
		input.close();
	}

}
