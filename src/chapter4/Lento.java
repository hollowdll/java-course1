package chapter4;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		// Variables
		String lentoNumero;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna lennon numero: ");
		lentoNumero = input.next();
		
		// Close input Scanner
		input.close();
		
		// Check if flight is Finnair
		if (lentoNumero.length() >= 3 && lentoNumero.substring(0,2).equals("AY")) {
			String lentoTyyppi = lentoNumero.substring(2,3);
			
			// Check the type of flight
			if (lentoTyyppi.equals("1")) {
				System.out.println("Kaukolento");
			} else if (lentoTyyppi.matches("[2-6]")) {
				System.out.println("Kotimaan lento");
			} else if (lentoTyyppi.equals("7")) {
				System.out.println("Venäjän lento");
			}
		} else {
			System.out.println("Ei ole Finnairin lento");
		}
	}

}
