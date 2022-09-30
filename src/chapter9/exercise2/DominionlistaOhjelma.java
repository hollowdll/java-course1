package chapter9.exercise2;

import java.util.Scanner;
import java.util.ArrayList;

public class DominionlistaOhjelma {
	
	private ArrayList<Dominion> pelaajat = new ArrayList<Dominion>();
	
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
	
	public void laskeKokonaisPisteet() {
		
	}
	
	public void lisaaPelaajallePisteet(Dominion dominion, String pisteTyyppi) {
		
		if (dominion != null) {
			if (pisteTyyppi == "[Kk]") {
				// Kirous
				pisteet = -1;
				dominion.setKirous(dominion.getKirous() + pisteet);
				
			} else if (pisteTyyppi == "[Tt]") {
				// Tila
				pisteet = 2;
				dominion.setTila(dominion.getTila() + pisteet);
				
			} else if (pisteTyyppi == "[Pp]") {
				// Pitäjä
				pisteet = 3;
				dominion.setPitaja(dominion.getPitaja() + pisteet);
				
			} else if (pisteTyyppi == "[Ll]") {
				// Lääni
				pisteet = 6;
				dominion.setLaani(dominion.getLaani() + pisteet);
			}
		}
		
	}
	
	public void kysyPisteet(Scanner input) {
		
		String pisteidenSaajaNimi, pisteTyyppi;
		Dominion pisteidenSaaja = null;
		int pisteet;
		
		System.out.print("Kuka sai pisteitä: ");
		pisteidenSaajaNimi = input.nextLine();
		
		System.out.print("K=kirous, T=tila, P=pitaja, L=lääni: ");
		pisteTyyppi = input.next();
		
		for (Dominion e : pelaajat) {
			if (e.getNimi().equals(pisteidenSaajaNimi)) {
				pisteidenSaaja = e;
				break;
			}
		}
		
		if (pisteidenSaaja != null) {
			lisaaPelaajallePisteet(pisteidenSaaja, pisteTyyppi);
		}
		
		for (Dominion e : pelaajat) {
			//System.out.println(e.getNimi() + " " + );
		}
		
	}
	
	public void naytaVoittaja() {
		
		
		System.out.println("Voittaja oli " );
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DominionlistaOhjelma ohjelma = new DominionlistaOhjelma();
		
		ohjelma.kysyPelaajat(input);
		
		// while ()
		
		
		input.close();
		
	}

}
