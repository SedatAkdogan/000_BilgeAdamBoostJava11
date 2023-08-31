package com.bilgeadam.week03.lecture005;

import java.util.Scanner;

public class Question44_burda {

	public static void main(String[] args) {
		// SORU1 : Bir metot yazalım. Bu metot içerisine 2 tane sayı alsın. Çarpımlarını
		// bize
		// geri dönsün.
		/**
		 * // SORU 2 : main metodumda bir sayı değeri olacak sayi=15, bir de sonuc
		 * değeri olacak sonuc=0; aşağıda oluşturduğum metotlardan dönen değerleri sonuc
		 * = sayi/"metot" işleminde kullanmak istiyorum.
		 * 
		 * SORU 3 : yeni bir carpim metodu oluşturalım, iki adet sayıyı dışarıdan alan
		 * bir metot oluşturalım. Bu metot 2 sayıyı geri dönsün. //Sonra yeni
		 * oluşturduğumuz çarpım metodunda iki adet sayı alan metodumuzu kullanarak aynı
		 * işlemleri gerçekleştirelim. iki adet sayı alan metodumuzu kullanarak aynı
		 * işlemleri gerçekleştirelim.
		 * 
		 * 
		 */
		carpim();
		carpim(5, 3);
		System.out.println("********************* Diger sorunun cevabı baslıyorrrrr******************");
		int num = 15;
		double sonuc = 0;
		if (carpim() != 0) {
			sonuc = (double) num / (double) carpim();
			System.out.println("Sonuc : " + sonuc);
		} else {
			System.out.println("Bolen sayi 0 olamaz");

		}
		boolean control = true;
		while (control) {
			sonuc = num / (double) carpim(5, 3);
			System.out.println(sonuc);
			sonuc = num / (double) carpim(0, 3);
			System.out.println("Bolen sayi 0 olamaz");
			control = false;
			sonuc = num / (double) carpim(5, 0);
			System.out.println("Bolen sayi 0 olamaz");
			control = false;

		}

	}

	public static int[] ikiSayiAl() {
		Scanner scanner = new Scanner(System.in);
		int[] numberArray = new int[2];
		System.out.println("1.sayiyi gir");
		numberArray[0] = scanner.nextInt();
		System.out.println("Lutfen 2. sayiyi gir");
		numberArray[1] = scanner.nextInt();
		return numberArray;

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
