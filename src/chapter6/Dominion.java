package chapter6;

import java.util.Scanner;

public class Dominion {
	
	static int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		// Calculate values
		int yhteisPisteet = (kirous * -1) + (tila * 2) + (pitaja * 3) + (laani * 6);
		
		return yhteisPisteet;
	}

	public static void main(String[] args) {
		// Variables
		int kirous, tila, pitaja, laani;
		
		// Open input scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read input
		System.out.print("Anna kirouskorttien määrä: ");
		kirous = input.nextInt();
		
		System.out.print("Anna tilakorttien määrä: ");
		tila = input.nextInt();
		
		System.out.print("Anna pitäjäkorttien määrä: ");
		pitaja = input.nextInt();
		
		System.out.print("Anna läänikorttien määrä: ");
		laani = input.nextInt();
		
		// Close input scanner
		input.close();
		
		// Calculate values
		int yhteisPisteet = laskePisteet(kirous, tila, pitaja, laani);
		
		// Show result
		System.out.println("Pisteiden yhteismäärä on " + yhteisPisteet);
	}

}
