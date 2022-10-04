package chapter9.exercise3;

import java.time.LocalDate;

class Remontti {

	private int vuosi;
	private String kuvaus;
	
	Remontti() {
		LocalDate today = LocalDate.now();
		vuosi = today.getYear();
		kuvaus = "";
	}
	
	Remontti(int vuosi, String kuvaus) {
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
	}

	int getVuosi() {
		return vuosi;
	}

	void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	String getKuvaus() {
		return kuvaus;
	}

	void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}
	
}
