package com.bilgeadam.week02.lecture003;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * 1 den başlayarak gelen bütün sayıları toplayalım Toplam 50 yi geçene kadar
		 * çalışsın en son toplamı yazdıralım ve döngünün kaç kere calıstıgınız
		 * yazdıralım.
		 */
		int toplam = 0;
		int i = 1;
		int sayac = 0;
		while (toplam <= 50) {

			toplam += i;
			sayac = i;
			i++;

		}
		System.out.println("Toplam....." + toplam + "döngü...." + sayac);

	}

}
