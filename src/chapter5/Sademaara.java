package chapter5;

import java.text.DecimalFormat;

public class Sademaara {

	public static void main(String[] args) {
		// Variables
		double sademaaraYhteensa = 0;
		
		// Sademaarat array
		double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
		
		// Decimal format
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		// Loop through array
		for (double sademaara : sademaarat) {
			// Add value to total value
			sademaaraYhteensa += sademaara;
		}
		
		// Show result
		System.out.println("Vuoden sademäärä on " + decimalFormat.format(sademaaraYhteensa) + " mm");
	}

}
