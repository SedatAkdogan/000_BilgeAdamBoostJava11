package com.bilgeadam.week02.lecture002;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * İki tane string değişken oluşştur isim ve soy isim olsun ekrana yazdıralım
		 * 
		 * a ve b karakterlerinin değerini yazdıralım sonra toplamını yazdıralım
		 *
		 */
		String isim = "Sedat";
		String soyİsim = "Akdogan";
		System.out.println("isim" + isim);
		System.out.println("soyisim" + soyİsim);
		System.out.print(isim);
		System.out.print(soyİsim);
		System.out.println("isim" + isim + "\nsoyisim" + soyİsim);

		// \n satır kırılımı !!!
		int i = 5;
		int j = 7;
		int toplam = i + j;

		System.out.println("TOPLAM" + toplam);
		System.out.println("toplam \n" + toplam);

		// ********************************************//

		System.out.println("****TAB GİRDİSİ***");
		System.out.println("isim:\t" + isim + "soyİsim:\t" + soyİsim);

		// ********************************/////

		char a = 'a';
		char b = 'b';

		System.out.println("ASCIII a:" + (int) a + "\n b:" + (int) b);
		System.out.println(a + b);
		System.out.println('a' + 'b');

	}

}
