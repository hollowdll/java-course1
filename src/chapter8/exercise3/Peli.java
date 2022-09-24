package chapter8.exercise3;

class Peli {
	
	private int arvattava, arvauksia;
	private boolean valmis;
	private Henkilo pelaaja;
	
	Peli() {
		arvattava = 73;
		arvauksia = 0;
		valmis = false;
		pelaaja = null;
	}
	
	Peli(int arvattava, int arvauksia, boolean valmis, Henkilo pelaaja) {
		this.arvattava = arvattava;
		this.arvauksia = arvauksia;
		this.valmis = valmis;
		this.pelaaja = pelaaja;
	}

	int getArvattava() {
		return arvattava;
	}

	void setArvattava(int arvattava) {
		this.arvattava = arvattava;
	}
	
	int getArvauksia() {
		return arvauksia;
	}
	
	void setArvauksia(int arvauksia) {
		this.arvauksia = arvauksia;
	}
	
	boolean getValmis() {
		return valmis;
	}
	
	void setValmis(boolean valmis) {
		this.valmis = valmis;
	}

	Henkilo getPelaaja() {
		return pelaaja;
	}

	void setPelaaja(Henkilo pelaaja) {
		this.pelaaja = pelaaja;
	}

	@Override
	public String toString() {
		return "Peli [arvattava=" + arvattava + ", arvauksia=" + arvauksia + ", valmis=" + valmis + ", pelaaja="
				+ pelaaja + "]";
	}
}
