package com.bilgeadam.week07.lecture001.abstractonornek2;

public class Daire extends GeometrikSekil {

	private double yaricap;
	
	
	
	

	public Daire() {
		super();
	}

	public Daire(String renk, double yaricap) {
		super(renk);
		this.yaricap = yaricap;
	}

	@Override
	public double alanHesapla() {
		
		return getPI() * yaricap*yaricap;
	}

	@Override
	public double cevreHesapla() {
		
		return 2*getPI()*yaricap;
	}

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	
	
	
}
