package com.bilgeadam.week05.lecture003;

public class Database {
	/**
	 * fieldlar(isim,email,sifre,id)
	 * 
	 * database isimli bir sınıfolusturalım.
	 * Bu database sınıfında bir kullanıcı listesi olsun
	 * Burada bir metot yazalım ve 3 adet kullanıcı ekleyelim
	 */
	
	static Kullanici[] kullaniciListesi = new Kullanici[5];
	static int uzunluk =0;
	
	
	public static void kullanicilariOlustur(){
		Kullanici kullanici = new Kullanici();
		kullanici.isim ="Alperen";
		kullanici.email ="alperen@gmail.com";
		kullanici.sifre = "123";
		kullanici.id = uzunluk +1;
		kullaniciListesi[0] =kullanici;
		uzunluk++;
		
		Kullanici kullanici2 = new Kullanici();
		kullanici2.isim ="Sedat";
		kullanici2.email ="sedat@gmail.com";
		kullanici2.sifre = "123";
		kullanici2.id = uzunluk +1;
		kullaniciListesi[1] = kullanici2;
		uzunluk++;
		
		Kullanici kullanici3 = new Kullanici();
		kullanici3.isim ="Ugur";
		kullanici3.email ="ugur@gmail.com";
		kullanici3.sifre = "123";
		kullanici3.id = uzunluk +1;
		kullaniciListesi[2] = kullanici3;
		uzunluk++;
	}
	

}


