package com.bilgeadam.week06.lecture003;

public class OfisCalisani extends Personel {

	public OfisCalisani(String isim, String soyIsim) {
		super(isim, soyIsim);
		setMaas(8000);
	}

	public OfisCalisani(String isim, String soyIsim, double maas) {
		super(isim, soyIsim, maas);
		setIsUnvani(maas);
		
	}
	@Override
	public void setIsUnvani(double maas) {
		if(maas >= 12000) {
			setIsUnvani("Kıdemli Ofis Calisani");
		}else if(maas>=8000) {
			setIsUnvani("Ofis Calisani");
		}  else {
			setIsUnvani("Stajyer");
		}
	}

	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani));
		setIsUnvani(getMaas());
		return getMaas();
	}
	
	
	
	
	

}
