package chapter9.exercise3;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AsuntolistaRemonttiOhjelma {
	
	public int kysyValinta(Scanner input) {
		int valinta;
		
		System.out.println("1. Lisää asunto\n2. Näytä asunnot\n0. Lopetus");
		System.out.print("Anna valintasi (0-2): ");
		valinta = input.nextInt();
		input.nextLine();
		
		return valinta;
	}
	
	public void lisaaAsunto(Scanner input) {
		Asunto asunto = new Asunto();
		
		System.out.print("Anna asunnon tyyppi: ");
		asunto.setTyyppi(input.nextLine());
		
		
		
	}
	
	public void naytaAsunnot() {
		
	}

	public static void main(String[] args) {
		
		AsuntolistaRemonttiOhjelma ohjelma = new AsuntolistaRemonttiOhjelma();
		Scanner input = new Scanner(System.in);
		int valinta = -1;
		
		while (valinta != 0) {
			valinta = ohjelma.kysyValinta(input);
			
			if (valinta == 1) {
				ohjelma.lisaaAsunto(input);
				
			} else if (valinta == 2) {
				ohjelma.naytaAsunnot();
				
			} else {
				break;
			}
		}
		
		input.close();
		
	}

}
