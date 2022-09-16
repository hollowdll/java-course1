package chapter6;

import java.util.Scanner;

public class Kellonaika {
	
	static String kysyKellonaika() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String kellonaika = input.next();
		input.close();
		
		return kellonaika;
	}
	
	static boolean tarkastaKellonaika(String kellonaika) {
		if (kellonaika.matches("\\d{2}:\\d{2}")) {
			int tunnit = Integer.parseInt(kellonaika.substring(0, 2));
			if (tunnit > 23) {
				return false;
			}
			int minuutit = Integer.parseInt(kellonaika.substring(3, 5));
			if (minuutit > 59) {
				return false;
			}
			
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Variables
		String kellonaika;
		boolean tarkastus;
		
		// Get value from method
		kellonaika = kysyKellonaika();
		tarkastus = tarkastaKellonaika(kellonaika);
		
		// Show result
		if (tarkastus) {
			System.out.println("Kellonaika on oikein");
		} else {
			System.out.println("Kellonaika on väärin");
		}
	}

}
