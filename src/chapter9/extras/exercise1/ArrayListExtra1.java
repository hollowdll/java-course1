package chapter9.extras.exercise1;

import java.util.ArrayList;

class ArrayListExtra1 {
	
	private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
	
	void lisaaHenkilot() {
		henkilot.add(new Henkilo("Matti", "Vantaa", 1993));
		henkilot.add(new Henkilo("Liisa", "Espoo", 1976));
		henkilot.add(new Henkilo("Maija", "Helsinki", 2001));
		
		System.out.println("Kolme henkilöä lisättiin");
	}
	
	void poistaEnsimmainenHenkilo() {
		if (henkilot.size() >= 1) {
			henkilot.remove(0);
			
			System.out.println("Ensimmäinen henkilö poistettiin");
		}
	}
	
	void muutaSyntymaVuotta() {
		if (henkilot.size() >= 1) {
			Henkilo viimeinenHenkilo = henkilot.get(henkilot.size() - 1);
			
			if (viimeinenHenkilo != null) {
				viimeinenHenkilo.setVuosi(69);
				
				System.out.println("Syntymävuosi muutettiin");
			}
		}
	}
	
	void naytaHenkilot() {
		for (Henkilo e : henkilot) {
			System.out.println("\nNimi: " + e.getNimi() + "\nOsoite: " + e.getOsoite() + "\nSyntymävuosi: " + e.getVuosi());
		}
	}

	public static void main(String[] args) {
		
		ArrayListExtra1 ohjelma = new ArrayListExtra1();
		ohjelma.lisaaHenkilot();
		ohjelma.poistaEnsimmainenHenkilo();
		ohjelma.muutaSyntymaVuotta();
		ohjelma.naytaHenkilot();
		
	}

}
