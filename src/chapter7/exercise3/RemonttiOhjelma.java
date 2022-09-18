package chapter7.exercise3;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Remontti remontti = new Remontti();
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
		input.close();
		
		System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
	}

}
