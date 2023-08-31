package com.bilgeadam.week06.lecture003.calisaninterface;

// extends Personel --> is-a iliskisi barındırır
// implements IInsanKaynaklari --> has-a iliskisi barindirir.
// yani extend sırf o oldugu için onda olan özellikler gibi
// implements ise sonradan kazanılmış yetkinlik gibi düsünülebilir.

public class InsanKaynaklari extends Personel implements IIinsanKaynaklari{

	public InsanKaynaklari(String isim, String soyIsim) {
		super(isim, soyIsim);
		// TODO Auto-generated constructor stub
	}

	public InsanKaynaklari(String isim, String soyIsim, double maas) {
		super(isim, soyIsim, maas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zamYap(Personel personel, double zamOrani) {
		double zamliUcret = personel.getMaas() + (personel.getMaas()*zamOrani/100);
		
		if(personel.getClass().getSimpleName().equals("Muhendis")) {
			zamliUcret +=250;
		}
		
//		if(personel.getIsUnvani().contains("Muhendis")) {
//			
//		}
		personel.setMaas(zamliUcret);
		personel.setIsUnvani(getMaas());
		
	}

	@Override
	public void unvanBelirle() {
		System.out.println("Unvan belirlendi.");
		
	}

}
