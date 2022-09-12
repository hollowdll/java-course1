package chapter6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lahjavero {
	
	static double laskeVero(double arvo) {
		double vero = 0;
		
		// Calculate value
		if (arvo >= 5000 && arvo < 25000) {
			vero = 100 + ((arvo - 5000) * 0.08);
			
		} else if (arvo >= 25000 && arvo < 55000) {
			vero = 1700 + ((arvo - 25000) * 0.1);
			
		} else if (arvo >= 55000 && arvo < 200000) {
			vero = 4700 + ((arvo - 55000) * 0.12);
			
		} else if (arvo >= 200000 && arvo < 1000000) {
			vero = 22100 + ((arvo - 200000) * 0.15);
			
		} else if (arvo >= 1000000) {
			vero = 142100 + ((arvo - 1000000) * 0.17);
		}
		
		return vero;
	}

	public static void main(String[] args) {
		// Variables
		double lahjaSuuruus;
		
		// Decimal format
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		// Open input scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read input
		System.out.print("Anna lahjan suuruus: ");
		lahjaSuuruus = input.nextDouble();
		
		// Close input scanner
		input.close();
		
		// Calculate value
		double vero = laskeVero(lahjaSuuruus);
		
		// Show result
		System.out.println("Lahjavero on " + decimals.format(vero) + " euroa");
	}

}
