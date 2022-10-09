package exam.exercise2;

import java.util.Scanner;

class OsallistujaOhjelma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Osallistuja osallistuja = new Osallistuja();
		
		// Kysy tiedot
		System.out.print("Anna osallistujan nimi: ");
		osallistuja.setNimi(input.nextLine());
		
		System.out.print("Anna kansallisuus: ");
		osallistuja.setKansallisuus(input.nextLine());
		
		System.out.print("Anna syntymävuosi: ");
		osallistuja.setSyntymaVuosi(input.nextInt());
		
		input.close();
		
		// Näytä tiedot
		System.out.println("Nimi: " + osallistuja.getNimi()
							+ "\nKansallisuus: " + osallistuja.getKansallisuus()
							+ "\nSyntymävuosi: " + osallistuja.getSyntymaVuosi());
	}

}
