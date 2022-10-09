package chapter9.extras.exercise3;

class Arvostelu {

	private int arvosana;
	private String teksti;
	
	Arvostelu() {
		arvosana = 0;
		teksti = "";
	}
	
	Arvostelu(int arvosana, String teksti) {
		this.arvosana = arvosana;
		this.teksti = teksti;
	}

	int getArvosana() {
		return arvosana;
	}

	void setArvosana(int arvosana) {
		this.arvosana = arvosana;
	}

	String getTeksti() {
		return teksti;
	}

	void setTeksti(String teksti) {
		this.teksti = teksti;
	}

	@Override
	public String toString() {
		return "Arvostelu [arvosana=" + arvosana + ", teksti=" + teksti + "]";
	}
	
}
