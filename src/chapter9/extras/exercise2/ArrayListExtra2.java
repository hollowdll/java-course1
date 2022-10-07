package chapter9.extras.exercise2;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

class ArrayListExtra2 {
	
	private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
	private Scanner input = new Scanner(System.in);
	
	int kysyValinta() {
		int valinta;
		System.out.println("\n1. Lisää henkilöt\n2. Listaa henkilöt\n3. Listaa henkilöt iällä\n0. Lopetus");
		System.out.print("Anna valintasi (0-3): ");
		valinta = input.nextInt();
		input.nextLine();
		
		return valinta;
	}
	
	void lisaaHenkilo() {
		Henkilo henkilo = new Henkilo();
		
		System.out.print("\nAnna nimi: ");
		henkilo.setNimi(input.nextLine());
		
		System.out.print("Anna osoite: ");
		henkilo.setOsoite(input.nextLine());
		
		System.out.print("Anna syntymävuosi: ");
		henkilo.setVuosi(input.nextInt());
		input.nextLine();
		
		henkilot.add(henkilo);
	}
	
	void listaaHenkilot() {
		for (Henkilo e : henkilot) {
			System.out.println("\nNimi: " + e.getNimi() + "\nOsoite: " + e.getOsoite() + "\nSyntymävuosi: " + e.getVuosi());
		}
	}
	
	void listaaHenkilotIalla() {
		System.out.print("\nAnna ikäraja (minimi ikä): ");
		int ikaRaja = input.nextInt();
		input.nextLine();
		
		for (Henkilo e : henkilot) {
			// Tarkista henkilön ikä
			if (LocalDate.now().getYear() - e.getVuosi() >= ikaRaja) {
				System.out.println("\nNimi: " + e.getNimi() + "\nOsoite: " + e.getOsoite() + "\nSyntymävuosi: " + e.getVuosi());
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayListExtra2 ohjelma = new ArrayListExtra2();
		int valinta = -1;
		
		while (valinta != 0) {
			valinta = ohjelma.kysyValinta();
			
			switch (valinta) {
			case 0:
				break;
		
			case 1:
				ohjelma.lisaaHenkilo();
				break;
				
			case 2:
				ohjelma.listaaHenkilot();
				break;
				
			case 3:
				ohjelma.listaaHenkilotIalla();
				break;
			
			default:
				System.out.println("Virheellinen syöte!");
				
			}
		}
		
	}

}
