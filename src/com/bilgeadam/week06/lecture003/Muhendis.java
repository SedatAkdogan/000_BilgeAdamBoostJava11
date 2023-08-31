package com.bilgeadam.week06.lecture003;

public class Muhendis extends Personel {

	public Muhendis(String isim, String soyIsim) {
		super(isim, soyIsim);
		setIsUnvani("Muhendis");
		
	}
	public Muhendis(String isim, String soyIsim,double maas) {
		super(isim, soyIsim,maas);
		setIsUnvani(maas);
		
	}
	@Override
	public void setIsUnvani(double maas) {
		if(maas >= 17000) {
			setIsUnvani("Uzman Muhendis");
		}else if(maas>=12000) {
			setIsUnvani("Kıdemli Muhendis");
		} else if(maas>=10000) {
			setIsUnvani("Muhendis");
		} else {
			setIsUnvani("Stajyer");
		}
	}
	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani) + 250);
		setIsUnvani(getMaas());
		return getMaas();
	}
	
	

}
