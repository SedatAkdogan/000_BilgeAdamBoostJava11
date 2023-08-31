package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan girilen bi sayının faktöriyelini hesaplayalım
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		int sayi = sc.nextInt();
		int faktoriyel = 1;

		for (int i = sayi; i > 0; i--) {
			faktoriyel = faktoriyel * i;

		}
		System.out.println(faktoriyel);

	}

}
