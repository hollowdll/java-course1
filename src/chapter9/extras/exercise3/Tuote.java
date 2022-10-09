package chapter9.extras.exercise3;

import java.util.ArrayList;

class Tuote {

	private int numero;
	private String nimi;
	private double hinta;
	private ArrayList<Arvostelu> arvostelut;
	
	Tuote() {
		numero = 0;
		nimi = "";
		hinta = 0.0;
		arvostelut = new ArrayList<Arvostelu>();
	}

	Tuote(int numero, String nimi, double hinta) {
		this.numero = numero;
		this.nimi = nimi;
		this.hinta = hinta;
		arvostelut = new ArrayList<Arvostelu>();
	}

	int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		this.numero = numero;
	}

	String getNimi() {
		return nimi;
	}

	void setNimi(String nimi) {
		this.nimi = nimi;
	}

	double getHinta() {
		return hinta;
	}

	void setHinta(double hinta) {
		this.hinta = hinta;
	}

	ArrayList<Arvostelu> getArvostelut() {
		return arvostelut;
	}

	void setArvostelut(ArrayList<Arvostelu> arvostelut) {
		this.arvostelut = arvostelut;
	}

	@Override
	public String toString() {
		return "Tuote [numero=" + numero + ", nimi=" + nimi + ", hinta=" + hinta + ", arvostelut=" + arvostelut + "]";
	}
	
}
