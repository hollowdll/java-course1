package chapter8.exercise3;

import java.util.Scanner;

public class PeliOhjelma {
	
	private Henkilo pelaaja;
	private Peli peli;
	
	public void teePelaaja(Scanner input) {
		pelaaja = new Henkilo();
		System.out.print("Anna nimesi: ");
		pelaaja.setNimi(input.nextLine());
	}
	
	public void pelaaPelia(Scanner input) {
		if (pelaaja == null) {
			System.out.println("Peli voi alkaa vasta, kun on asetettu pelaaja");
			
		} else {
			peli = new Peli();
			peli.setPelaaja(pelaaja);
			int arvaus;
			
			System.out.print("Anna arvaus: ");
			arvaus = input.nextInt();
			peli.setArvauksia(peli.getArvauksia() +1);
			
			if (arvaus == peli.getArvattava()) {
				peli.setValmis(true);
				System.out.println("Arvasit oikein");
				return;
			}
			
			while (!peli.getValmis()) {
				if (arvaus > peli.getArvattava()) {
					System.out.print("Arvaa pienempää: ");
				} else {
					System.out.print("Arvaa suurempaa: ");
				}
				
				arvaus = input.nextInt();
				peli.setArvauksia(peli.getArvauksia() +1);
				
				if (arvaus == peli.getArvattava()) {
					peli.setValmis(true);
					System.out.println("Arvasit oikein");
					return;
				}
			}
		}
	}
	
	public void naytaPeli() {
		if (peli == null) {
			System.out.println("Peliä ei ole pelattu");
			
		} else if (pelaaja != null) {
			System.out.println(peli.getPelaaja().getNimi() + " arvasi " + peli.getArvauksia()
								+ " kertaa numeroa " + peli.getArvattava());
		}
	}

	public static void main(String[] args) {
		int valinta = -1;
		
		PeliOhjelma ohjelma = new PeliOhjelma();
		Scanner input = new Scanner(System.in);
		
		while (valinta != 0) {
			System.out.println("\n1. Tee pelaaja\n2. Pelaa\n3. Näytä peli\n0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();
			input.nextLine();
			
			if (valinta == 0) {
				break;
				
			} else if (valinta == 1) {
				ohjelma.teePelaaja(input);
				
			} else if (valinta == 2) {
				ohjelma.pelaaPelia(input);
				
			} else if (valinta == 3) {
				ohjelma.naytaPeli();
			}
			
		}
		
		input.close();
	}

}
