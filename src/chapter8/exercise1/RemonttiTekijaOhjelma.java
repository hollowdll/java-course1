package chapter8.exercise1;

import java.util.Scanner;

public class RemonttiTekijaOhjelma {

	public static void main(String[] args) {
		Remontti remontti = new Remontti();
		Henkilo henkilo = new Henkilo();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna vuosi: ");
		boolean asetaVuosi = remontti.setVuosi(input.nextInt());
		
		if (!asetaVuosi) {
			input.close();
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
			return;
		}
		
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		remontti.setKuvaus(input.nextLine());
		
		System.out.print("Anna tekijän nimi: ");
		henkilo.setNimi(input.nextLine());
		remontti.setTekija(henkilo);
		
		System.out.print("Anna tekijän osoite: ");
		henkilo.setOsoite(input.nextLine());
		
		System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
		
		if (remontti.getTekija() != null) {
			System.out.println("Remontin teki " + remontti.getTekija().getNimi());
		}
		
		input.close();
	}

}
