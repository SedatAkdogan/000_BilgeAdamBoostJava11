package com.bilgeadam.week05.lecture003;

public class Student {
	/*
	 *  Ogrencilerin İsimleri ve numaraları olacak
	 *  Her yeni ogrenci kaydedildiğinde ogrenci numarası 1 artacak
	 */
	
	String isim; // nesne degiskeni
	 static int numara; // sınıf degiskeni
	
	public void kayit() {
		numara+=1;
		System.out.println(isim + " adlı ogrenci " + numara + " no'su ile kaydolmustur.");
		
	}

}
