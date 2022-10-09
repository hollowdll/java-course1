package exam;

import java.util.Scanner;
import java.text.DecimalFormat;

class Osallistumismaksu {
	
	private Scanner input = new Scanner(System.in);
	private double maksu;
	
	void kysyValinta() {
		String valinta;
		
		System.out.print("Osallistuja (OS) / Katsoja (KA): ");
		valinta = input.nextLine();
		
		if (valinta.equals("KA")) {
			int ika;
			
			System.out.print("Ikä: ");
			ika = input.nextInt();
			input.nextLine();
			
			if (ika >= 0 && ika <= 17) {
				maksu = 8.0;
				
			} else if (ika >= 18) {
				maksu = 12.5;
			}
			
		} else if (valinta.equals("OS")) {
			kysyKisaTyyppi();
		}
		
	}
	
	void kysyKisaTyyppi() {
		String valinta;
		
		System.out.print("Nuoret (NU) / Aikuiset (AI): ");
		valinta = input.nextLine();
		
		if (valinta.equals("NU")) {
			maksu = 10.0;
			
		} else if (valinta.equals("AI")) {
			maksu = 20.0;
		}
		
	}
	
	void naytaMaksu() {
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		System.out.println("Maksu on " + decimals.format(maksu) + " euroa");
	}

	public static void main(String[] args) {
		
		Osallistumismaksu ohjelma = new Osallistumismaksu();
		
		ohjelma.kysyValinta();
		ohjelma.naytaMaksu();
		
	}

}
