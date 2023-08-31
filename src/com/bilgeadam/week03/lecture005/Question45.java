package com.bilgeadam.week03.lecture005;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// Türkçe karakterleri İngilizce karakterlere çevirme

		/**
		 * 
		 * Bir metot yazalım. metot arraylerimizin ikisini de alsın.
		 * 
		 * daha sonra metodun içinde bir string değer alalım.
		 * 
		 * sonra Türkçe karakterleri İngilizce karakterlere dönüştürüp, dönüştürülmüş
		 * hali geri dönelim.
		 * 
		 * döndüğümüz String değerini main metotta yazdıralım.
		 * 
		 */

		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		System.out.println(changeString(ingilizceKarakter, turkceKarakter));
	}

	public static String changeString(String[] eng, String[] tr) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		for (int i = 0; i < tr.length; i++) {
			kelime = kelime.replace(tr[i], eng[i]);

		}

		return kelime;
	}

}
