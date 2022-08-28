package chapter1;

import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		// Variables
		double vieraidenMaara, pullojenMaara;
		
		// Constants
		final double LASILLISTA_PULLOSTA = 7;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		vieraidenMaara = input.nextInt();
		
		// Calculate and round pullojenMaara up to closest integer (not down)
		pullojenMaara = Math.ceil(vieraidenMaara / LASILLISTA_PULLOSTA);
		
		// Print the result
		System.out.println("Pulloja tarvitaan " + (int) pullojenMaara + " kappaletta");
		
		// Close input Scanner
		input.close();
	}

}
