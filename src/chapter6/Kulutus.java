package chapter6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kulutus {
	
	// Decimal format
	private static DecimalFormat decimals = new DecimalFormat("0.00");
	
	static int kysyKilometrit(Scanner input) {
		System.out.print("Anna ajetut kilometrit: ");
		int kilometrit = input.nextInt();
		return kilometrit;
	}
	
	static double kysyTankkaus(Scanner input) {
		System.out.print("Anna tankattu määrä: ");
		double tankattu = input.nextDouble();
		return tankattu;
	}
	
	static double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus = tankattu / kilometrit * 100;
		return kulutus;
	}
	
	static void naytaKulutus(double kulutus) {
		System.out.println("Kulutus/100km on " + decimals.format(kulutus) + " litraa");
	}

	public static void main(String[] args) {
		// Open input scanner
		Scanner input = new Scanner(System.in);
		
		// Call methods
		int kilometrit = kysyKilometrit(input);
		double tankattu = kysyTankkaus(input);
		input.close();
		double kulutus = laskeKulutus(kilometrit, tankattu);
		
		// Show result
		naytaKulutus(kulutus);
	}

}
