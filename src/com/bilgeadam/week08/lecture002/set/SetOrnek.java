package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {
	/*
	 * Film kategorileri
	 * Bir tane String setimiz olsun.Daha sonra disaridan bir kategori istedigimiz metot olsun.
	 * Bu kategorileri setimize ekleyelim. Eger daha once eklemissek bize bu kategori daha once eklenmis gibi
	 * bir cıktı versin eklenmediyse de basarıyla eklendi gibi bir cıktı versin
	 * Setimiz yazdiralim.
	 */

	
	public static void main(String[] args) {
		
	//	Set<Integer> integerSet = new HashSet<>();
//		integerSet.add(10);
//		integerSet.add(20);
//		integerSet.add(10);
//		integerSet.add(20);
//		integerSet.forEach(System.out::println); // cıktı sadece 20 ve 10 olacak cünkü set tekrar eden degerleri almaz.
		
		Set<String> movieCatogories = new HashSet<>();
	
		kategoriEkle("Aksiyon", movieCatogories);
		kategoriEkle("Romantik", movieCatogories);
		kategoriEkle("Dram", movieCatogories);
		kategoriEkle("Aksiyon", movieCatogories);
		
		for(String kategori : movieCatogories) {
			System.out.println(kategori);
		}
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		movieCatogories = new HashSet<String>();  // newledim dikkat et yoksa hepsi icin daha once eklenmisti uyarisi verirdi.
		kategoriEkle2("Aksiyon", movieCatogories);
		kategoriEkle2("Romantik", movieCatogories);
		kategoriEkle2("Dram", movieCatogories);
		kategoriEkle2("Aksiyon", movieCatogories);
		for(String kategori : movieCatogories) {
			System.out.println(kategori);
		}
		/*
		 * Eger metotları static olusturmazsak sınıfın nesnesini üretip setOrnek.contains vsvs yapacaktık.
		 */

	}
	
	private static void kategoriEkle(String kategori , Set<String> set) {
		if(set.contains(kategori)) {
			System.out.println(kategori + " kategorisi daha once eklenmistir.");
		}else {
			System.out.println(kategori + " basarili bir sekilde eklenmistir.");
			set.add(kategori);
		}
	}
	
	public static void kategoriEkle2(String kategori,Set<String> set) {
		if(set.add(kategori)) {
			System.out.println(kategori + " basarili bir sekilde eklenmistir.");
		} else {
			System.out.println(kategori + " kategorisi daha once eklenmistir.");
		}
	}
	
	
	
	
	

}
