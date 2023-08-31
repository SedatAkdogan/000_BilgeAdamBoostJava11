package com.bilgeadam.week07.lecture001.abstractonornek2;

public abstract class GeometrikSekil {
	
	private String renk;
	private final double PI =3.14;
	
	
	
	

	public GeometrikSekil() {
		super();
	}



	public GeometrikSekil(String renk) {
		super();
		this.renk = renk;
	}



	public void ciz() {
		System.out.println("Cizilen sekil : " + renk + " renkli " + getClass().getSimpleName());
		
	}
	
	
	
	public String getRenk() {
		return renk;
	}



	public void setRenk(String renk) {
		this.renk = renk;
	}



	public double getPI() {
		return PI;
	}



	public abstract double alanHesapla();
	public abstract double cevreHesapla();
	
	
	
	

}
