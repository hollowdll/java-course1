package exam.exercise2;

import java.util.Scanner;
import java.util.ArrayList;

class OsallistujalistaSovellus {
	
	private Scanner input = new Scanner(System.in);
	private ArrayList<Osallistuja> osallistujat = new ArrayList<Osallistuja>();
	
	int kysyValinta() {
		int valinta;
		
		System.out.println("\n1 = Lisää osallistuja"
							+ "\n2 = Näytä kaikki osallistujat"
							+ "\n3 = Näytä kansallisuudella"
							+ "\n4 = Muuta osallistujan nimeä"
							+ "\n0 = Lopeta");
		System.out.print("Anna valintasi (0-5): ");
		valinta = input.nextInt();
		input.nextLine();
		
		return valinta;
	}
	
	void lisaaOsallistuja() {
		String nimi, kansallisuus;
		int syntymaVuosi;
		
		System.out.print("Anna osallistujan nimi: ");
		nimi = input.nextLine();
		
		System.out.print("Anna kansallisuus: ");
		kansallisuus = input.nextLine();
		
		System.out.print("Anna syntymävuosi: ");
		syntymaVuosi = input.nextInt();
		input.nextLine();
		
		// Luo osallistuja ja lisää se listaan
		Osallistuja osallistuja = new Osallistuja(nimi, kansallisuus, syntymaVuosi);
		osallistujat.add(osallistuja);
	}
	
	void naytaOsallistujat() {
		for (Osallistuja e : osallistujat) {
			System.out.println("\nNimi: " + e.getNimi()
								+ "\nKansallisuus: " + e.getKansallisuus()
								+ "\nSyntymävuosi: " + e.getSyntymaVuosi());
		}
	}
	
	void naytaOsallistujatKansallisuudella() {
		System.out.print("Anna kansallisuus: ");
		String kansallisuus = input.nextLine();
		
		for (Osallistuja e : osallistujat) {
			// Tarkista kansallisuus
			if (e.getKansallisuus().equals(kansallisuus)) {
				System.out.println("\nNimi: " + e.getNimi()
									+ "\nKansallisuus: " + e.getKansallisuus()
									+ "\nSyntymävuosi: " + e.getSyntymaVuosi());
			}
		}
	}
	
	void muutaOsallistujanNimea() {
		String muutettavaNimi, uusiNimi;
		boolean listassa = false;
		
		System.out.print("Anna muutettavan osallistujan nimi: ");
		muutettavaNimi = input.nextLine();
		
		for (Osallistuja e : osallistujat) {
			// Tarkista nimi
			if (e.getNimi().equals(muutettavaNimi)) {
				listassa = true;
				break;
			}
		}
		
		if (!listassa) return;
		
		System.out.print("Anna osallistujan uusi nimi: ");
		uusiNimi = input.nextLine();
		
		for (Osallistuja e : osallistujat) {
			if (e.getNimi().equals(muutettavaNimi)) {
				e.setNimi(uusiNimi);
			}
		}
	}

	public static void main(String[] args) {
		
		OsallistujalistaSovellus ohjelma = new OsallistujalistaSovellus();
		int valinta = -1;
		
		while (valinta != 0) {
			valinta = ohjelma.kysyValinta();
			
			switch (valinta) {
			case 0:
				return;
				
			case 1:
				ohjelma.lisaaOsallistuja();
				break;
				
			case 2:
				ohjelma.naytaOsallistujat();
				break;
				
			case 3:
				ohjelma.naytaOsallistujatKansallisuudella();
				break;
				
			case 4:
				ohjelma.muutaOsallistujanNimea();
				break;
				
			default:
				System.out.println("Virheellinen syöte!");
			}
		}
		
	}

}
