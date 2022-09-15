package chapter6;

import java.util.Scanner;

public class Tunnus {
	
	private static String teeTunnus(String etu, String suku) {
		try {
			String tunnus = suku.substring(0,3) + etu.substring(0,3);
			tunnus = tunnus.toLowerCase();
			
			return tunnus;
			
		} catch(Exception error) {
			return "";
		}
	}

	public static void main(String[] args) {
		// Variables
		String etunimi, sukunimi;
		
		// Open input scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read user input
		System.out.print("Anna sukunimi: ");
		sukunimi = input.nextLine();
		
		System.out.print("Anna etunimi: ");
		etunimi = input.nextLine();
		
		// Close input scanner
		input.close();
		
		// Get value from method and show result
		String tunnus = teeTunnus(etunimi, sukunimi);
		
		if (!tunnus.equals("")) {
			System.out.println("Tunnus on " + tunnus);
		} else {
			System.out.println("Virheellinen syöte!");
		}
	}

}
