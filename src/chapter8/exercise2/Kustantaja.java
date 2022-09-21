package chapter8.exercise2;

class Kustantaja {
	
	private String nimi, osoite, puhelin;
	
	Kustantaja() {
		nimi = "";
		osoite = "";
		puhelin = "";
	}

	Kustantaja(String nimi, String osoite, String puhelin) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.puhelin = puhelin;
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

	String getPuhelin() {
		return puhelin;
	}

	void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	@Override
	public String toString() {
		return "Kustantaja [nimi=" + nimi + ", osoite=" + osoite + ", puhelin=" + puhelin + "]";
	}
}
