package exam.exercise2;

class Osallistuja {

	private String nimi, kansallisuus;
	private int syntymaVuosi;
	
	Osallistuja() {
		nimi = "";
		kansallisuus = "";
		syntymaVuosi = 0;
	}
	
	Osallistuja(String nimi, String kansallisuus, int syntymaVuosi) {
		this.nimi = nimi;
		this.kansallisuus = kansallisuus;
		this.syntymaVuosi = syntymaVuosi;
	}

	String getNimi() {
		return nimi;
	}

	void setNimi(String nimi) {
		this.nimi = nimi;
	}

	String getKansallisuus() {
		return kansallisuus;
	}

	void setKansallisuus(String kansallisuus) {
		this.kansallisuus = kansallisuus;
	}

	int getSyntymaVuosi() {
		return syntymaVuosi;
	}

	void setSyntymaVuosi(int syntymaVuosi) {
		this.syntymaVuosi = syntymaVuosi;
	}

	@Override
	public String toString() {
		return "Osallistuja [nimi=" + nimi + ", kansallisuus=" + kansallisuus + ", syntymaVuosi=" + syntymaVuosi + "]";
	}
	
}
