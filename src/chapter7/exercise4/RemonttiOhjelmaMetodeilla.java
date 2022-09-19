package chapter7.exercise4;

import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
	
	private static Remontti remontti;
	
	public static void teeRemontti(Scanner input) {
		remontti = new Remontti();
		muutaRemontti(input);
	}
	
	public static void naytaRemontti() {
		if (remontti != null) {
			System.out.println("Vuosi: " + remontti.getVuosi() + "\nKuvaus: " + remontti.getKuvaus());
		}
	}
	
	public static void muutaRemontti(Scanner input) {
		if (remontti != null) {
			System.out.print("Anna vuosi: ");
			boolean asetaVuosi = remontti.setVuosi(input.nextInt());
			
			if (!asetaVuosi) {
				System.out.println("Vuosi ei voi olla tulevaisuudessa");
				return;
			}
			
			System.out.print("Anna kuvaus: ");
			input.nextLine();
			remontti.setKuvaus(input.nextLine());
			
			System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
		}
	}

	public static void main(String[] args) {
		int valinta = -1;
		
		Scanner input = new Scanner(System.in);
		
		while (valinta != 0) {
			System.out.println("\n1. Tee remontti\n2. Näytä remonttitiedot\n3. Muuta remonttia\n0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();
			
			if (valinta == 0) {
				break;
			}
			else if (valinta == 1) {
				teeRemontti(input);
				
			} else if (valinta == 2) {
				naytaRemontti();
				
			} else if (valinta == 3) {
				muutaRemontti(input);
				
			} else {
				break;
			}
				
		}
		
		input.close();
	}

}
