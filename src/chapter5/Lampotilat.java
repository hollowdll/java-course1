package chapter5;

import java.util.Scanner;
import java.util.Arrays;

public class Lampotilat {

	public static void main(String[] args) {
		// Variables
		int lkm = 0;
		int lampotila;
		
		// Constants
		final int MAX_SIZE = 100;
		
		// Array
		int[] lampotilat = new int[MAX_SIZE];
		
		// Open input Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask and read input
		System.out.print("Anna lämpötila: ");
		lampotila = input.nextInt();
		
		// Add values to the array
		while (lampotila != -999 && lkm < MAX_SIZE) {
			lampotilat[lkm] = lampotila;
			lkm++;
			
			// If array is not full
			if (lkm < MAX_SIZE) {
				// Ask and read input
				System.out.print("Anna lämpötila: ");
				lampotila = input.nextInt();
			}
		}
		
		// Close input scanner
		input.close();
		
		// Sort the array
		Arrays.sort(lampotilat, 0, lkm);
		
		// Make a string of array values
		String lampotilatResult = "";
		
		for (int i = 0; i < lkm; i++) {
			lampotilatResult += lampotilat[i] + " ";
		}
		
		// Show result
		System.out.println("Annoit lämpötilat: " + lampotilatResult);
	}

}
