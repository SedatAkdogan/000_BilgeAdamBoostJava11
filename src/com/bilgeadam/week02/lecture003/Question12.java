package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/**
		 * girilen sayının basamakları toplamını ekrana yazdıralım
		 */

		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;
		int sayac = 0;

		System.out.println("Lutfen bir sayi girinz");
		sayi = scanner.nextInt();
		do {
			toplam += sayi % 10;
			sayi = sayi / 10;
			sayac++;

		} while (sayi != 0);
		System.out.println("Gırdıgınız sayinin basamaklari toplami..." + toplam);
		System.out.println("Basamak sayisi" + sayac);

	}

}
