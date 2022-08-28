package chapter1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {

	public static void main(String[] args) {
		// Variables
		double leveys, pituus, korkeus, litrallaNelioita, maalinTarveLitroina;
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		leveys = input.nextDouble();
		pituus = input.nextDouble();
		korkeus = input.nextDouble();
		
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		litrallaNelioita = input.nextDouble();
		
		// Do calculations
		maalinTarveLitroina = (2 * leveys + 2 * pituus) * korkeus / litrallaNelioita;
		
		// Format value to 2 decimals
		DecimalFormat resultFormat = new DecimalFormat("0.00");
		String maalinTarveLitroinaLopullinen = resultFormat.format(maalinTarveLitroina);
		
		// Print the result
		System.out.println("Maalin tarve on " + maalinTarveLitroinaLopullinen + " litraa");
		
		// Close input Scanner
		input.close();
	}

}
