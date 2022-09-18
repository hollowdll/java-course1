package chapter7.exercise1;

class Kirja {
	
	private String nimi, isbn;
	private double hinta;
	private int julkaisuVuosi;
	
	public Kirja() {
		nimi = "";
		isbn = "";
		hinta = 0.0;
		julkaisuVuosi = 0;
	}
	
	public Kirja(String nimi, String isbn, double hinta, int julkaisuVuosi) {
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.julkaisuVuosi = julkaisuVuosi;
	}

	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", julkaisuVuosi=" + julkaisuVuosi + "]";
	}
	
	// Setters and getters //
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public int getJulkaisuVuosi() {
		return julkaisuVuosi;
	}

	public void setJulkaisuVuosi(int julkaisuVuosi) {
		this.julkaisuVuosi = julkaisuVuosi;
	}
}
