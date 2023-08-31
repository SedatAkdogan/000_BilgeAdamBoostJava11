package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		/*
		 * Dışarıdan 2 tane sayısal değer alıcam. 2 sayının toplamı çift ise true
		 * değilse false yazdırıcam ortalamasını da al
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen ilk sayiyi giriniz:");
		int sayi1 = sc.nextInt();
		System.out.print("ikincisayi giriniz:");
		int sayi2 = sc.nextInt();

		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;
		System.out.println(ortalama);

	}

}
