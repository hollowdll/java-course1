package chapter9.extras.exercise1;

class Henkilo {
	
	private String nimi;
	private String osoite;
	private int vuosi;
	
	Henkilo() {
		nimi = "";
		osoite = "";
		vuosi = 0;
	}
	
	Henkilo(String nimi, String osoite, int vuosi) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.vuosi = vuosi;
	}

	String getNimi() {
		return nimi;
	}

	void setNimi(String nimi) {
		this.nimi = nimi;
	}

	String getOsoite() {
		return osoite;
	}

	void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	
	int getVuosi() {
		return vuosi;
	}
	
	void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", vuosi=" + vuosi + "]";
	}

}
