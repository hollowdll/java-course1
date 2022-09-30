package chapter9.exercise2;

class Dominion {

	private String nimi;
	private int kirous, tila, pitaja, laani, pisteet;
	
	Dominion() {
		nimi = "";
		kirous = 0;
		tila = 0;
		pitaja = 0;
		laani = 0;
		pisteet = 0;
	}

	Dominion(String nimi, int kirous, int tila, int pitaja, int laani) {
		this.nimi = nimi;
		this.kirous = kirous;
		this.tila = tila;
		this.pitaja = pitaja;
		this.laani = laani;
		pisteet = 0;
	}

	String getNimi() {
		return nimi;
	}

	void setNimi(String nimi) {
		this.nimi = nimi;
	}

	int getKirous() {
		return kirous;
	}

	void setKirous(int kirous) {
		this.kirous = kirous;
	}

	int getTila() {
		return tila;
	}

	void setTila(int tila) {
		this.tila = tila;
	}

	int getPitaja() {
		return pitaja;
	}

	void setPitaja(int pitaja) {
		this.pitaja = pitaja;
	}

	int getLaani() {
		return laani;
	}

	void setLaani(int laani) {
		this.laani = laani;
	}

	int getPisteet() {
		return pisteet;
	}

	void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}

	@Override
	public String toString() {
		return "Dominion [nimi=" + nimi + ", kirous=" + kirous + ", tila=" + tila + ", pitaja=" + pitaja + ", laani="
				+ laani + ", pisteet=" + pisteet + "]";
	}
	
}
