package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {

	public static void main(String[] args) {
		// Variables
		double veroprosentti, vero, tyoelakemaksu, tyottomyysvakuutus, kateenJaa;
		int bruttopalkka, ika;
		
		// Decimal format in 2 decimals
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna palkka: ");
		bruttopalkka = input.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroprosentti = input.nextDouble();
		
		System.out.print("Anna ikä: ");
		ika = input.nextInt();
		
		// Close input Scanner since it is no longer needed
		input.close();
		
		// Do calculations
		vero = bruttopalkka * veroprosentti / 100;
		tyottomyysvakuutus = bruttopalkka * 0.015;
		
		// Tyoelakemaksu depends on age
		if (ika >= 53 && ika <= 62) {
			tyoelakemaksu = bruttopalkka * (8.65 / 100);
		} else {
			tyoelakemaksu = bruttopalkka * (7.15 / 100);
		}
		
		// The real salary
		kateenJaa = bruttopalkka - vero - tyottomyysvakuutus - tyoelakemaksu;
		
		// Print the results
		System.out.println("Bruttopalkka " + bruttopalkka);
		System.out.println("Veron osuus " + resultFormat.format(vero));
		System.out.println("Työeläkevakuutusmaksun osuus " + resultFormat.format(tyoelakemaksu));
		System.out.println("Työttömyysvakuutuksen osuus " + resultFormat.format(tyottomyysvakuutus));
		System.out.println("Käteen jää " + resultFormat.format(kateenJaa));
	}

}
