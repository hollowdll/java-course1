package chapter2;

import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		// Variables
		int tunnit;
		String tervehdys;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna tunnit: ");
		tunnit = input.nextInt();
		
		// Close input Scanner since it is no longer needed
		input.close();
		
		// Assign the right greeting based on given value
		if (tunnit >= 7 && tunnit < 10) {
			tervehdys = "Hyvää huomenta!";
		} else if (tunnit >= 10 && tunnit < 17) {
			tervehdys = "Hyvää päivää!";
		} else if (tunnit >= 17 && tunnit < 22) {
			tervehdys = "Hyvää iltaa!";
		}
		
		// If time is between 22 and 24 or 0 and 7
		else if (tunnit >= 22 && tunnit < 24 || tunnit >= 0 && tunnit < 7) {
			tervehdys = "Hyvää yötä!";
		} else {
			// Invalid time
			tervehdys = "Virhe: Ei kelvollista aikaa";
		}
		
		// Print the result
		System.out.println(tervehdys);
	}

}
