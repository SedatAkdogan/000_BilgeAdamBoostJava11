package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {

	/*
	 * Klavyeden rastgele 10 sayi alip cıktısını ver
	 */
	
	static Scanner scanner;
	static Set<Integer> sayilar = new HashSet<Integer>(); // karisik bir sekilde ilk buldugu degerden son degere kadar getiriyor
	
	static Set<Integer> ekledigimSiraIle = new LinkedHashSet<Integer>();// verileri girdigin siranin aynisiyla getirdi.
	
	static Set<Integer> kucuktenBuyuge = new TreeSet<Integer>(); // Girilen verileri kendisi siralayarak doner.
	
	static Set<Ogrenci> ogrenciSet = new TreeSet<Ogrenci>();
	
	public static void main(String[] args) {
//		sayiEkle();
//		yazdir(sayilar); // cıktı karisik dikkat et.
//		System.out.println("****************LınkedHashSet***************");
//		yazdir(ekledigimSiraIle); // verileri girdigin siranin aynisiyla getirdi.
//		System.out.println("****************TreeSet*************************");
//		yazdir(kucuktenBuyuge);
		
		ogrenciSet.add(new Ogrenci(100, "Cafer"));
		ogrenciSet.add(new Ogrenci(70, "Alperen"));
		ogrenciSet.add(new Ogrenci(3, "Sedat"));
		ogrenciSet.add(new Ogrenci(150, "Furkan"));
		ogrenciSet.add(new Ogrenci(13, "Zeynep"));
		ogrenciSet.add(new Ogrenci(53, "Banu"));
		ogrenciSet.add(new Ogrenci(40, "Nilsel"));
		
	//	ogrenciSet.forEach(System.out::println); treeSet neyi siralacagını bilmedigi icin hata verecek.
	// Ogrenci sınıfında implements Comporable<Ogrenci> yapacaksın.	
		
		ogrenciSet.forEach(System.out::println); // comporable eklemesi sonrasında compareTo methodunun icinde yazdıklarımız sayesinde
		// idlere gore sıfırladı.
	}

	public static void sayiEkle() {
		scanner = new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			System.out.print("Lutfen bir sayi giriniz : ");
			int sayi = scanner.nextInt();
			sayilar.add(sayi);
			ekledigimSiraIle.add(sayi);
			kucuktenBuyuge.add(sayi);
		}
	}
	
	public static void yazdir(Set<Integer> set) {
		set.forEach(System.out::println);
	}
	
}
