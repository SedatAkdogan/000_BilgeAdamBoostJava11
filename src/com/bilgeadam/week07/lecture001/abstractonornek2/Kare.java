package com.bilgeadam.week07.lecture001.abstractonornek2;

public class Kare extends GeometrikSekil{

	private double kenarUzunlugu;
	
	
	
	

	public Kare() {
		super();
	}

	public Kare(String renk, double kenarUzunlugu) {
		super(renk);
		this.kenarUzunlugu = kenarUzunlugu;
	}

	@Override
	public double alanHesapla() {
		
		return kenarUzunlugu * kenarUzunlugu;
	}

	@Override
	public double cevreHesapla() {
		
		return kenarUzunlugu * 4;
	}

	public double getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(double kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	
	
}
