package chapter1;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		int kansanedustajatMaara;
		int puoluetuki;
		final int PUOLUETUKI_PER_EDUSTAJA = 178175;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna kansanedustajien lukumäärä: ");
		kansanedustajatMaara = input.nextInt();
		
		// Calculate
		puoluetuki = kansanedustajatMaara * PUOLUETUKI_PER_EDUSTAJA;
		
		// Print the result
		System.out.println("Puoluetuen määrä on " + puoluetuki + " euroa");
		
		// Close input Scanner
		input.close();
	}

}
