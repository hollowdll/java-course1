package chapter1;

import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		// Variables
		int juostuMatkaMetreina, kokonaisetKierrokset;
		
		// Constants
		final int KOKONAINEN_KIERROS_METREINA = 400;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna juostu matka: ");
		juostuMatkaMetreina = input.nextInt();
		
		// Do calculations
		kokonaisetKierrokset = juostuMatkaMetreina / KOKONAINEN_KIERROS_METREINA;
		
		// Print the result
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + kokonaisetKierrokset);
		
		// Close input Scanner
		input.close();
	}

}
