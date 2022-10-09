package exam;

import java.util.Scanner;

class PerheOhjelma {
	
	private Scanner input = new Scanner(System.in);
	private Henkilo isa, aiti, lapsi;
	
	void kysyIsa() {
		isa = new Henkilo();
		
		System.out.print("Anna isän nimi: ");
		isa.setNimi(input.nextLine());
		
		System.out.print("Anna isän osoite: ");
		isa.setOsoite(input.nextLine());
	}
	
	void kysyAiti() {
		aiti = new Henkilo();
		
		System.out.print("Anna äidin nimi: ");
		aiti.setNimi(input.nextLine());
		
		System.out.print("Anna äidin osoite: ");
		aiti.setOsoite(input.nextLine());
	}
	
	void kysyLapsi() {
		lapsi = new Henkilo();
		
		System.out.print("Anna lapsen nimi: ");
		lapsi.setNimi(input.nextLine());
		
		System.out.print("Anna lapsen osoite: ");
		lapsi.setOsoite(input.nextLine());
		
		if (isa != null) {
			lapsi.setIsa(isa);
		}
		
		if (aiti != null) {
			lapsi.setAiti(aiti);
		}
	}
	
	void naytaTiedot() {
		if (lapsi != null && isa != null && aiti != null) {
			// Näytä vanhemmat
			System.out.println("Lapsen isä on " + lapsi.getIsa().getNimi() + " ja äiti on " + lapsi.getAiti().getNimi());
			
			// Näytä asuintilanne
			String lapsiOsoite = lapsi.getOsoite();
			String isaOsoite = lapsi.getIsa().getOsoite();
			String aitiOsoite = lapsi.getAiti().getOsoite();
			
			if (lapsiOsoite.equals(isaOsoite) && lapsiOsoite.equals(aitiOsoite)) {
				System.out.println("Perhe asuu samassa osoitteessa");
				
			} else if (lapsiOsoite.equals(isaOsoite)) {
				System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
				
			} else if (lapsiOsoite.equals(aitiOsoite)) {
				System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
			}
		}
	}

	public static void main(String[] args) {
		
		PerheOhjelma ohjelma = new PerheOhjelma();
		
		ohjelma.kysyIsa();
		ohjelma.kysyAiti();
		ohjelma.kysyLapsi();
		ohjelma.naytaTiedot();
		
	}

}
