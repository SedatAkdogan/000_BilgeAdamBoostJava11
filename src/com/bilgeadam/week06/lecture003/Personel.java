package com.bilgeadam.week06.lecture003;

public class Personel {
	
	private String isim;
	private String soyIsim;
	private String isUnvani;
	private double maas;
	
	public Personel(String isim,String soyIsim) {
		this.isim = isim;
		this.soyIsim = soyIsim;	
	}
	
	public Personel(String isim, String soyIsim,double maas) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.maas = maas;
		
	}
	
public double zamYap(double zamOrani) {
		
		this.maas += (this.maas*zamOrani /100);
		return this.maas;
		
	}
	

	
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public String getIsUnvani() {
		return isUnvani;
	}

	public void setIsUnvani(String isUnvani) {
		this.isUnvani = isUnvani;
	}
	
	public void setIsUnvani(double maas) {
		this.isUnvani = isUnvani;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	

}
