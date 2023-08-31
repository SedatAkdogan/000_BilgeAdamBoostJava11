package com.bilgeadam.week05.lecture005.encapsullation;

public class Araba {

	private String marka;
	private String model;
	private int km;
	private int bijonSayisi;
	private String camSil;

	public void arabayiSur() {
		System.out.println("Araba kullaniliyor.");
	}

	public void ozellikleriYazdir() {
		System.out.println("marka : " + this.marka);
		System.out.println("model : " + this.model);
		System.out.println("km : " + this.km);
		System.out.println("bijon sayisi : " + this.bijonSayisi);
		System.out.println("camsil : " + this.camSil);
	}

	public Araba() {
		super();
	}

	public Araba(String marka, String model, int km, int bijonSaysi, String camSil) {
		super();
		this.marka = marka;
		this.model = model;
		this.km = km;
		this.bijonSayisi = bijonSaysi;
		this.camSil = camSil;
	}

	public Araba(int km, String camSil) {
		super();
		this.marka = "bmw";
		this.model = "x5";
		this.km = km;
		this.bijonSayisi = 5;
		this.camSil = camSil;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getBijonSayisi() {
		return bijonSayisi;
	}

	public void setBijonSayisi(int bijonSayisi) {
		this.bijonSayisi = bijonSayisi;
	}

	public String getCamSil() {
		return camSil;
	}

	public void setCamSil(String camSil) {
		this.camSil = camSil;
	}

}
