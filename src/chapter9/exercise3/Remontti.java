package chapter9.exercise3;

import java.time.LocalDate;

class Remontti {

	private int vuosi;
	private String kuvaus;
	private Henkilo tekija;
	
	Remontti() {
		LocalDate today = LocalDate.now();
		vuosi = today.getYear();
		kuvaus = "";
		tekija = null;
	}

	int getVuosi() {
		return vuosi;
	}

	boolean setVuosi(int vuosi) {
		if (vuosi <= this.vuosi) {
			this.vuosi = vuosi;
			return true;
		} else {
			return false;
		}
	}

	String getKuvaus() {
		return kuvaus;
	}

	void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	Henkilo getTekija() {
		return tekija;
	}
	
	void setTekija(Henkilo tekija) {
		this.tekija = tekija;
	}
	
	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + ", tekija=" + tekija + "]";
	}
	
}
