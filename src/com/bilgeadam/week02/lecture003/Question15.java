package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {

		/**
		 * Klavyeden 0 girilinceye kadar sayı okumaya devam edicez. 0 girildiğinde
		 * sayıların toplamı ve ortalamasını yazdır.
		 */

		Scanner scanner = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		double ort = 0;
		int sayac = 1;
		System.out.println("Lutfen sayı giriniz");
		sayi = scanner.nextInt();

		while (sayi != 0) {
			toplam += sayi;
			ort = toplam / (double) sayac;
			sayac++;
			System.out.println("Lutfen bir sayi giriniz");
			sayi = scanner.nextInt();
			sayac++;

		}
		System.out.println("Toplam: " + toplam + "\nOrtalama : " + ort);
		scanner.close();

	}

}
