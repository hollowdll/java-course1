package chapter7.exercise3;

import java.time.LocalDate;

class Remontti {

	private int vuosi;
	private String kuvaus;
	
	Remontti() {
		LocalDate today = LocalDate.now();
		vuosi = today.getYear();
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
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
}
