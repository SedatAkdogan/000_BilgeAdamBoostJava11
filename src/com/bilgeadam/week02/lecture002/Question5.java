package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// int integerSayi = scanner.nextInt();
		// double doubleSayi = scanner.nextDouble();

//		System.out.print("lütfen adınızı giriniz");
//		String isim = scanner.nextLine();
//		System.out.println("merhaba:" + isim + 15);

		System.out.println("Lütfen bir sayı giriniz");
		double doubleSayi = scanner.nextDouble(); // !!! BURDA GİZLİ BİR \n var
		// scanner.nextline(); !!! buraya bunu koyarsak aşağıdaki
		// string okuma sorunu çöülecek.

		/*
		 * !!!! Scanner ile sayısal bir değer okuduktan sonra String bir değer okumak
		 * istiyorsak mutlaka 1 tane boş scanner.nextLine(); kullanmamız gerekiyor.!!!!
		 * 
		 */

		double ikinciSayi = 5;
		System.out.println(doubleSayi + ikinciSayi);
		System.out.println("lütfen adınızı giriniz");
		String isim = scanner.nextLine();

	}

}
