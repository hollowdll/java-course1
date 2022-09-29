package chapter9.exercise1;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class AsuntolistaOhjelma {
	
	private ArrayList<Asunto> asunnot = new ArrayList<Asunto>();
	
	public void lisaaAsunto(Scanner input) {
		Asunto asunto = new Asunto();
		
		System.out.print("Anna asunnon tyyppi: ");
		asunto.setTyyppi(input.nextLine());
		
		System.out.print("Anna osoite: ");
		asunto.setOsoite(input.nextLine());
		
		System.out.print("Anna pinta-ala: ");
		asunto.setPintaAla(input.nextDouble());
		
		System.out.print("Anna hinta: ");
		asunto.setHinta(input.nextDouble());
		input.nextLine();
		
		System.out.print("Anna kuvaus: ");
		asunto.setKuvaus(input.nextLine());
		
		asunnot.add(asunto);
	}
	
	public void naytaAsunnot() {
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		for (Asunto e : asunnot) {
			System.out.println("\nTyyppi: " + e.getTyyppi()
								+ "\nOsoite: " + e.getOsoite()
								+ "\nPinta-ala: " + decimals.format(e.getPintaAla())
								+ "\nHinta: " + decimals.format(e.getHinta()) + " euroa"
								+ "\nKuvaus: " + e.getKuvaus());
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AsuntolistaOhjelma ohjelma = new AsuntolistaOhjelma();
		int valinta = -1;
		
		while (valinta != 0) {
			System.out.println("\n1. Lisää asunto\n2. Näytä asunnot\n0. Lopetus");
			System.out.print("Anna valintasi (0-2): ");
			valinta = input.nextInt();
			input.nextLine();
			
			if (valinta == 1) {
				ohjelma.lisaaAsunto(input);
				
			} else if (valinta == 2) {
				ohjelma.naytaAsunnot();
				
			} else {
				break;
			}
		}
		
		input.close();
		
	}

}
