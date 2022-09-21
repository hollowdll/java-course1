package chapter8.exercise2;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		String nimi = "Java-ohjelmointi";
		String isbn = "978-952-14-3556-0";
		double hinta = 65.50;
		int julkaisuvuosi = 2018;
		
		Scanner input = new Scanner(System.in);
		Kustantaja kustantaja = new Kustantaja();
		Kirja kirja = new Kirja(nimi, isbn, hinta, julkaisuvuosi, kustantaja);
		
		System.out.print("Kustantajan nimi: ");
		kustantaja.setNimi(input.nextLine());
		
		System.out.print("Kustantajan osoite: ");
		kustantaja.setOsoite(input.nextLine());
		
		System.out.print("Kustantajan puhelin: ");
		kustantaja.setPuhelin(input.nextLine());
		input.close();
		
		System.out.println("Kirjan " + kirja.getNimi() + " kustantaja on " + kirja.getKustantaja().getNimi());
	}

}
