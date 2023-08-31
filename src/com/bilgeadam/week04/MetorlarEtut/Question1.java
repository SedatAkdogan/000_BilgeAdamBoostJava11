package com.bilgeadam.week04.MetorlarEtut;

public class Question1 {
	/*
	 * Ali --> {15,20,8,50,30} Veli--> {5,15} Ayşe--> {100,50,10,15,20,30,50} hiç
	 * bir metot kullanmadan bu fiyatların toplamını
	 * 
	 */

	public static void main(String[] args) {

//		int total = 0;
//
//		for (int i = 0; i < ali.length; i++) {
//			total += ali[i];
//		}
//		System.out.println(total);
//		total = 0;
//		//////////////////
//		for (int i = 0; i < veli.length; i++) {
//			total += veli[i];
//		}
//		System.out.println(total);
//		total = 0;
//		//////////////////////
//		for (int i = 0; i < ayse.length; i++) {
//			total += ayse[i];
//		}
//		System.out.println(total);

		int[] ali = { 15, 20, 8, 50, 30 };
		int[] veli = { 5, 15 };
		int[] ayse = { 100, 50, 10, 15, 20, 30, 50 };

		int aliAdisyon = adisyon(ali);
		adisyon(veli);
		adisyon(ayse);

		double taxRate = 0.18;

		double aliNetAdisyon = (aliAdisyon * taxRate) + aliAdisyon;
		System.out.println(aliNetAdisyon);

		System.out.println(vergiMiktariHesapla(aliAdisyon));
		System.out.println(ikiSayiTopla(aliAdisyon, vergiMiktariHesapla(aliAdisyon)));
		System.out.println("-----------------------------------------------------------");

		// yukaridakilerin hiçbirine gerek olmadan daha basit daha dinamik asagıda

		System.out.println(ikiSayiTopla(adisyon(ali), vergiMiktariHesapla(adisyon(ali))));
		System.out.println(ikiSayiTopla(adisyon(veli), vergiMiktariHesapla(adisyon(veli))));
		System.out.println(ikiSayiTopla(adisyon(ayse), vergiMiktariHesapla(adisyon(ayse))));

	}

	public static int adisyon(int[] fis) {
		int total = 0;
		for (int i = 0; i < fis.length; i++) {
			total += fis[i];
		}
		// System.out.println(total);
		return total;

	}

	public static double vergiMiktariHesapla(int fiyat) {
		double taxRate = 0.18;
		return taxRate * fiyat;
	}

	public static double ikiSayiTopla(int fiyat, double vergiliKısım) {
		return fiyat + vergiliKısım;
	}

}
