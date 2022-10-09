package chapter9.extras.exercise3;

import java.util.Scanner;

class ArrayListExtra3 {
	
	private Scanner input = new Scanner(System.in);
	private Tuote tuote;
	
	void kysyTiedot() {
		int numero;
		String nimi;
		double hinta;
		
		System.out.print("Anna numero: ");
		numero = input.nextInt();
		input.nextLine();
		
		System.out.print("Anna nimi: ");
		nimi = input.nextLine();
		
		System.out.print("Anna hinta: ");
		hinta = input.nextDouble();
		
		tuote = new Tuote(numero, nimi, hinta);
	}
	
	void kysyArvostelut() {
		if (tuote != null) {
			int arvosana = 0;
			String teksti = "";
			
			while (arvosana != -1) {
				System.out.print("\nAnna arvosana (-1 lopettaa): ");
				arvosana = input.nextInt();
				input.nextLine();
				
				if (arvosana == -1) return;
				
				System.out.print("Anna arvosteluteksti: ");
				teksti = input.nextLine();
				
				// luo arvostelu
				Arvostelu arvostelu = new Arvostelu(arvosana, teksti);
				tuote.getArvostelut().add(arvostelu);
			}
			
		} else {
			System.out.println("Virhe! Kysy ensin tuotteen tiedot!");
		}
	}
	
	void naytaTuote() {
		if (tuote != null) {
			// Näytä tuotteen tiedot
			System.out.println("\nNumero: " + tuote.getNumero()
								+ "\nNimi: " + tuote.getNimi()
								+ "\nHinta: " + tuote.getHinta()
								+ "\nArvostelut:");
			
			// Naytä arvostelut
			for (Arvostelu e : tuote.getArvostelut()) {
				System.out.println(e.getArvosana() + " " + e.getTeksti());
			}
			
		} else {
			System.out.println("Virhe! Kysy ensin tuotteen tiedot!");
		}
	}

	public static void main(String[] args) {
		
		ArrayListExtra3 ohjelma = new ArrayListExtra3();
		
		ohjelma.kysyTiedot();
		ohjelma.kysyArvostelut();
		ohjelma.naytaTuote();
	}

}
