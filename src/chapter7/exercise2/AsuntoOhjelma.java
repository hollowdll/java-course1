package chapter7.exercise2;

import java.util.Scanner;
import java.text.DecimalFormat;

class AsuntoOhjelma {

	public static void main(String[] args) {
		Asunto asunto = new Asunto();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna asunnon tyyppi: ");
		asunto.setTyyppi(input.nextLine());
		
		System.out.print("Anna osoite: ");
		asunto.setOsoite(input.nextLine());
		
		System.out.print("Anna pinta-ala: ");
		asunto.setPintaAla(input.nextDouble());
		
		System.out.print("Anna hinta: ");
		asunto.setHinta(input.nextDouble());
		
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		asunto.setKuvaus(input.nextLine());
		
		input.close();
		
		DecimalFormat decimals = new DecimalFormat("0.00");
		
		System.out.println("\nTyyppi: " + asunto.getTyyppi()
							+ "\nOsoite: " + asunto.getOsoite()
							+ "\nPinta-ala: " + decimals.format(asunto.getPintaAla())
							+ "\nHinta: " + decimals.format(asunto.getHinta()) + " euroa"
							+ "\nKuvaus: " + asunto.getKuvaus());
	}

}
