package com.bilgeadam.week03.lecture004;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		// Bir metot yazalım. Bu metot içerisine 2 tane sayı alsın. Çarpımlarını bize
		// geri dönsün.
		/**
		 * //main metodumda bir sayı değeri olacak sayi=15, bir de sonuc değeri olacak
		 * sonuc=0; aşağıda oluşturduğum metotlardan dönen değerleri sonuc =
		 * sayi/"metot" işleminde kullanmak istiyorum.
		 */
		carpim();
		carpim(5, 3);
	}

	public static int carpim() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen 1.sayiyi giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.print("Lutfen 2.sayiyi giriniz: ");
		int sayi2 = scanner.nextInt();
		int carpim = sayi1 * sayi2;
		System.out.println(" sonuc : " + carpim);
		return carpim;
	}

	public static int carpim(int num1, int num2) {
		int carpim = num1 * num2;
		System.out.println(" sonuc : " + carpim);
		return carpim;
	}

}
