package com.bilgeadam.week06.lecture003.kalitim;

public class Test {
	/**
	 * 
	 * 
	 * 
	 * -- Mühendislerimiz olacak
	 * 
	 * isim soyiisim iş unvani maaşı enz az iki constructr istiyorum (isim soy isim)
	 * (isim soyisim maaş)
	 * 
	 * maaşş zammı metodu olacak
	 * 
	 * maaş default en az 10000, 10000 12000 arası unvan muhendis eger maaşı
	 * 12000-17000 arasında ise kıdemlı muhendis 17000den yuksek ise uzman muhendis
	 * eğer maaaşı 10000 kucuk ise stajyer ve
	 * 
	 * zam oranına ek olarak 250tl bonus alacaklar
	 * 
	 * 
	 *
	 * -- ofis çalışanları olacak
	 * 
	 * isim soyiisim iş unvani maaşı
	 * 
	 * en düşük çalışan maaşı 8000 8000 1200 arası çalışan 12000 den sonraı kidemli
	 * calıasan 8000den az ise stajyer
	 * 
	 * 
	 *
	 */
	public static void main(String[] args) {
		
		OfisCalisani ofisCalisani = new OfisCalisani("Alperen", "Ikinci");
		System.out.println(ofisCalisani.getIsim() + " " + ofisCalisani.getSoyIsim());
		System.out.println(ofisCalisani.getMaas()); // default 8000
		//ofisCalisani.setIsUnvani(ofisCalisani.getMaas());
		ofisCalisani.zamYap(0);
		System.out.println(ofisCalisani.getIsUnvani());
		ofisCalisani.zamYap(50);
		System.out.println(ofisCalisani.getIsUnvani());
		
		System.out.println("----------------------------------------------------------");
		Personel ofisCalisani2 = new OfisCalisani("Sedat","Akdoğan",7000);
		System.out.println(ofisCalisani2.getIsUnvani());
		ofisCalisani2.zamYap(15);
		System.out.println(ofisCalisani2.getMaas());
		System.out.println(ofisCalisani2.getIsUnvani());
		
		System.out.println("--------------------------------------------------------");
		
		Muhendis muhendis = new Muhendis("Furkan","Balbaşıo");
		System.out.println(muhendis.getIsim() + " " + muhendis.getSoyIsim());
		muhendis.setMaas(10000);
		muhendis.setIsUnvani(muhendis.getMaas());
		System.out.println(muhendis.getMaas());
		System.out.println(muhendis.getIsUnvani());
		
		muhendis.zamYap(25);
		System.out.println(muhendis.getMaas());
		System.out.println(muhendis.getIsUnvani());
		
		
		Personel muhendis2 = new Muhendis("Ugurcan","Celik",10000);
		System.out.println(muhendis2.getIsUnvani());
		muhendis2.zamYap(60);
		System.out.println(muhendis2.getMaas());
		System.out.println(muhendis2.getIsUnvani());
		
		
		
		
	}
	
	
	

}
