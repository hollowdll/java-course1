package chapter3;

import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		// Variables
		int paino, painoYhteensa = 0;
		
		// Constants
		final int MAX_PAINO = 240;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Paljonko painat: ");
		paino = input.nextInt();
		
		// Loop
		while (painoYhteensa < MAX_PAINO && paino != 0) {
			painoYhteensa += paino;
			
			// Check if max value is not reached
			if (painoYhteensa < MAX_PAINO) {
				System.out.println("Tule kyytiin.");
			} else {
				System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
				break;
			}
			
			// Read user input
			System.out.print("Paljonko painat: ");
			paino = input.nextInt();
		}
		
		// Close input Scanner
		input.close();
	}

}
