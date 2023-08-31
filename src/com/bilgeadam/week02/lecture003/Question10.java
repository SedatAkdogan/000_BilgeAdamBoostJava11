package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		/*
		 * Kullanıcının dışarıdan girdiği sayıya kadar olan sayıların 1 fazlasının
		 * toplamını ekranda yazdıran toplamını ekrana yazdıran program
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi; i++) {
			toplam += (i + 1);

		}
		System.out.println(toplam);

	}

}
