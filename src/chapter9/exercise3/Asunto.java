package chapter9.exercise3;

import java.util.ArrayList;

class Asunto {
	
	private String tyyppi, osoite, kuvaus;
	private double pintaAla, hinta;
	private ArrayList<Remontti> remontit;
	
	Asunto() {
		tyyppi = "";
		osoite = "";
		kuvaus = "";
		pintaAla = 0.0;
		hinta = 0.0;
		remontit = new ArrayList<Remontti>();
	}

	Asunto(String tyyppi, String osoite, String kuvaus, double pintaAla, double hinta, ArrayList<Remontti> remontit) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.kuvaus = kuvaus;
		this.pintaAla = pintaAla;
		this.hinta = hinta;
		this.remontit = remontit;
	}

	String getTyyppi() {
		return tyyppi;
	}

	void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	String getOsoite() {
		return osoite;
	}

	void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	String getKuvaus() {
		return kuvaus;
	}

	void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	double getPintaAla() {
		return pintaAla;
	}

	void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
	}

	double getHinta() {
		return hinta;
	}

	void setHinta(double hinta) {
		this.hinta = hinta;
	}

	ArrayList<Remontti> getRemontit() {
		return remontit;
	}

	void setRemontit(ArrayList<Remontti> remontit) {
		this.remontit = remontit;
	}

	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", kuvaus=" + kuvaus + ", pintaAla=" + pintaAla
				+ ", hinta=" + hinta + ", remontit=" + remontit + "]";
	}

}
