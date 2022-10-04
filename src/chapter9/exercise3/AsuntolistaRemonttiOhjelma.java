package chapter9.exercise3;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AsuntolistaRemonttiOhjelma {
	
	private ArrayList<Asunto> asunnot = new ArrayList<Asunto>();
	
	public int kysyValinta(Scanner input) {
		int valinta;
		
		System.out.println("\n1. Lisää asunto\n2. Näytä asunnot\n0. Lopetus");
		System.out.print("Anna valintasi (0-2): ");
		valinta = input.nextInt();
		input.nextLine();
		
		return valinta;
	}
	
	public void lisaaAsunto(Scanner input) {
		Asunto asunto = new Asunto();
		int remonttiVuosi = -1;
		
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
		
		// Kysy remontit
		while (remonttiVuosi != 0) {
			System.out.print("Anna remonttivuosi (0 lopettaa): ");
			remonttiVuosi = input.nextInt();
			input.nextLine();
			
			if (remonttiVuosi <= 0) {
				break;
				
			} else {
				// Lisää remontti
				System.out.print("Anna remontin kuvaus: ");
				String remonttiKuvaus = input.nextLine();
				
				Remontti remontti = new Remontti(remonttiVuosi, remonttiKuvaus);
				asunto.lisaaRemontti(remontti);
			}
		}
		
		// Lisää asunto listaan
		asunnot.add(asunto);
		
	}
	
	public void naytaAsunnot() {
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		// Näytä asunnot
		for (Asunto e : asunnot) {
			System.out.println("\nTyyppi: " + e.getTyyppi()
								+ "\nOsoite: " + e.getOsoite()
								+ "\nPinta-ala: " + decimals.format(e.getPintaAla())
								+ "\nHinta: " + decimals.format(e.getHinta()) + " euroa"
								+ "\nKuvaus: " + e.getKuvaus()
								+ "\nRemontit:");
			
			// Näytä remontit
			for (Remontti remontti : e.getRemontit()) {
				System.out.println(remontti.getVuosi() + " " + remontti.getKuvaus());
			}
		}
	}

	public static void main(String[] args) {
		
		AsuntolistaRemonttiOhjelma ohjelma = new AsuntolistaRemonttiOhjelma();
		Scanner input = new Scanner(System.in);
		int valinta = -1;
		
		while (valinta != 0) {
			valinta = ohjelma.kysyValinta(input);
			
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
