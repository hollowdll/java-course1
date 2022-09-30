package chapter9.exercise2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class DominionlistaOhjelma {
	
	private ArrayList<Dominion> pelaajat = new ArrayList<Dominion>();
	private int laanit = 0;
	
	public void kysyPelaajat(Scanner input) {
		
		int pelaajaMaara;
		
		System.out.print("Montako pelaajia on: ");
		pelaajaMaara = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < pelaajaMaara; i++) {
			Dominion dominion = new Dominion();
			
			System.out.print("Anna pelaajan nimi: ");
			dominion.setNimi(input.nextLine());
			
			pelaajat.add(dominion);
		}
		
	}
	
	public void laskeKokonaisPisteet(Dominion dominion) {
		
		if (dominion != null) {
			int pisteet = dominion.getKirous() + dominion.getTila() + dominion.getPitaja() + dominion.getLaani();
			dominion.setPisteet(pisteet);
		}
		
	}
	
	public void lisaaPelaajallePisteet(Dominion dominion, String pisteTyyppi) {
		
		if (dominion != null) {
			int pisteet;
			
			if (pisteTyyppi.matches("[Kk]")) {
				// Kirous
				pisteet = -1;
				dominion.setKirous(dominion.getKirous() + pisteet);
				
			} else if (pisteTyyppi.matches("[Tt]")) {
				// Tila
				pisteet = 2;
				dominion.setTila(dominion.getTila() + pisteet);
				
			} else if (pisteTyyppi.matches("[Pp]")) {
				// Pitäjä
				pisteet = 3;
				dominion.setPitaja(dominion.getPitaja() + pisteet);
				
			} else if (pisteTyyppi.matches("[Ll]")) {
				// Lääni
				pisteet = 6;
				dominion.setLaani(dominion.getLaani() + pisteet);
				laanit++;
			}
		}
		
	}
	
	public void kysyPisteet(Scanner input) {
		
		String pisteidenSaajaNimi, pisteTyyppi;
		Dominion pisteidenSaaja = null;
		
		System.out.print("\nKuka sai pisteitä: ");
		pisteidenSaajaNimi = input.nextLine();
		
		System.out.print("K=kirous, T=tila, P=pitäjä, L=lääni: ");
		pisteTyyppi = input.nextLine();
		
		// Pisteiden saaja
		for (Dominion e : pelaajat) {
			if (e.getNimi().equals(pisteidenSaajaNimi)) {
				pisteidenSaaja = e;
				break;
			}
		}
		
		if (pisteidenSaaja != null) {
			lisaaPelaajallePisteet(pisteidenSaaja, pisteTyyppi);
			laskeKokonaisPisteet(pisteidenSaaja);
		}
		
		// Näytä pelaajien kokonaispisteet
		for (Dominion e : pelaajat) {
			System.out.println(e.getNimi() + " " + e.getPisteet() + " pistettä");
		}
		
	}
	
	public void naytaVoittaja() {
		
		if (pelaajat.size() > 0) {
			Dominion voittaja = null;
			int[] pelaajienPisteet = new int[pelaajat.size()];
			int suurimmatPisteet = 0;
			
			// Hae pelaajien pisteet
			for (int i = 0; i < pelaajienPisteet.length; i++) {
				pelaajienPisteet[i] = pelaajat.get(i).getPisteet();
			}
			
			// Suurimmat pisteet
			Arrays.sort(pelaajienPisteet);
			suurimmatPisteet = pelaajienPisteet[pelaajienPisteet.length - 1];
			
			for (Dominion e : pelaajat) {
				if (e.getPisteet() == suurimmatPisteet) {
					voittaja = e;
				}
			}
			
			if (voittaja != null) {
				System.out.println("\nVoittaja oli " + voittaja.getNimi() + " pisteillä " + voittaja.getPisteet());
			}
			
		} else {
			System.out.println("\nLisää pelaaja");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DominionlistaOhjelma ohjelma = new DominionlistaOhjelma();
		
		ohjelma.kysyPelaajat(input);
		
		while (ohjelma.laanit < 8) {
			ohjelma.kysyPisteet(input);
			
			if (ohjelma.laanit == 8) {
				ohjelma.naytaVoittaja();
				break;
			}
		}
		
		input.close();
		
	}

}
