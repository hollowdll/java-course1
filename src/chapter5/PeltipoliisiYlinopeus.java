package chapter5;

public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		// Constants
		final int MIN_NOPEUS = 84;
		
		// Array
		String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};
		
		// Loop through array
		for (int i = 0; i < peltipoliisi.length; i++) {
			// Split strings into separate values
			String[] peltipoliisiTieto = peltipoliisi[i].split(";");
			
			// Convert speed string into integer
			int nopeus = Integer.parseInt(peltipoliisiTieto[1]);
			
			// If speed is more than min value
			if (nopeus >= MIN_NOPEUS) {
				System.out.println(peltipoliisiTieto[0] + " " + peltipoliisiTieto[1]);
			}
		}
	}

}
