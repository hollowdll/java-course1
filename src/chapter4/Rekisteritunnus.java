package chapter4;

import java.util.Scanner;

public class Rekisteritunnus {

	public static void main(String[] args) {
		// Variables
		String rekisterinumero;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna rekisterinumero: ");
		rekisterinumero = input.next();
		
		// Close input Scanner
		input.close();
		
		// If string format is correct
		if (rekisterinumero.matches("[A-ZÅÄÖa-zåäö]{2,3}-[1-9][0-9]{0,2}")) {
			System.out.println("Rekisterinumero on kelvollinen");
		} else {
			System.out.println("Rekisterinumero ei ole kelvollinen");
		}
	}

}
