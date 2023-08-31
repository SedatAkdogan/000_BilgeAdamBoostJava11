package com.bilgeadam.week04.lecture002;

import java.util.Scanner;

public class Question46 {
	static Scanner scanner = new Scanner(System.in);
	
//Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

//2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

//eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri metoda geçelim.

//main'de dışarıdan kaç sayı alacağımızı belirliyoruz, 
// o sayılara göre koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan birisini çağıracağız.

	public static void main(String[] args) {
		
		System.out.println("Lutfen sayi adedi giriniz");
		int sayiAdedi = scanner.nextInt();
		
		switch(sayiAdedi) {
		case 2 : System.out.println(" TOPLAM = " + topla()); break;
		case 3 : 
			System.out.println("Lutfen 1. sayiyi giriniz");
			int num1 = scanner.nextInt();
			System.out.println("Lutfen 2. sayiyi giriniz");
			int num2 = scanner.nextInt();
			System.out.println("Lutfen 3. sayiyi giriniz");
			int num3 = scanner.nextInt();
			
			System.out.println("TOPLAM =" + topla(num1, num2, num3));
			break;
			default : System.out.println("Çıkıs"); break;
		}
		
	}
	
	private static int topla() {
		System.out.println("Lutfen 1. sayiyi giriniz ");
		int num1 = scanner.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz ");
		int num2 = scanner.nextInt();
		return num1 + num2;
		
	}
	private static int topla(int num1, int num2, int num3) {
		return num1 + num2 + num3 ;
	}

}
