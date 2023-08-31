package com.bilgeadam.week08.lecture005;

public class Urun extends UrunManager {

	/*
	 * urun sınıfı =>> isim,fiyat ve int son kullanma tarihi 2023,2024 gibi degerler olabilir;
	 * 
	 * UrunManager isimli bir sinif olusturalim.Bu sinifta urunYarat isimli bir metot olsun.
	 * Bu metot uzerinden test sınıfında bir urun olusturalim.
	 * 
	 * 
	 * 
	 */
	
	private String isim;
	private double fiyat;
	private int skt;
	

	
	public Urun(String isim, double fiyat, int skt) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.skt = skt;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getSkt() {
		return skt;
	}
	public void setSkt(int skt) {
		this.skt = skt;
	}
	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", skt=" + skt + "]";
	}
	
	
	
	
	
	
}
