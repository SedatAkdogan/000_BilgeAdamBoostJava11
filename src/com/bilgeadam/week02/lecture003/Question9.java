package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan girilen 1-10 arasındaki sayının çarpım tablosunu veren programı
		 * yazınız.
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz");
		int sayi = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + i + "=" + carpim);

		}

//		if (sayi>=1 && sayi<=10) {
//			System.out.println(sayi + "'nin çarpım tablosu");
//			 for(int i =1; i<=0;i++) {
//				 int carpim = sayi *i;
//				 System.out.println(sayi + "x" + i + "=" + carpim);
//				 
//			 }
//			 else {
//				 System.out.println("Hatalı giris yaptınız");
//				 		+ "
//			 }

//		}

	}

}
