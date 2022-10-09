package exam;

class Henkilo {

	private String nimi, osoite;
	private Henkilo aiti, isa;
	
	Henkilo() {
		nimi = "";
		osoite = "";
		aiti = null;
		isa = null;
	}

	Henkilo(String nimi, String osoite, Henkilo aiti, Henkilo isa) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.aiti = aiti;
		this.isa = isa;
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

	Henkilo getAiti() {
		return aiti;
	}

	void setAiti(Henkilo aiti) {
		this.aiti = aiti;
	}

	Henkilo getIsa() {
		return isa;
	}

	void setIsa(Henkilo isa) {
		this.isa = isa;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", aiti=" + aiti + ", isa=" + isa + "]";
	}
	
}
