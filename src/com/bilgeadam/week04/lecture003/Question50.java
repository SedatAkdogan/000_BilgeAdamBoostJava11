package com.bilgeadam.week04.lecture003;

public class Question50 {
	/*
	 * 
	 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	 * 
	 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini
	 * yazdıralım.
	 * 
	 */

	public static void main(String[] args) {
		int[] array = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };

		tekrarEdenSay(array);

	}

	public static void tekrarEdenSay(int[] array) {
		System.out.println("Tekrar eden sayılar ve tekrar sayıları:");

		boolean[] kontrol = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (kontrol[i] == true) {
				continue;
			}
			int count = 1; // 1 ler bitince tekrar 1 olması için burda tanımladık

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					kontrol[j] = true;
				}
			}
			System.out.println(array[i] + " sayisi " + count + " adet bulunmaktadır");
		}

	}

} // class sonu
