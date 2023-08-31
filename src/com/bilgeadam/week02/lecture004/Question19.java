package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		/*
		 * dısarıdan girilen bir sayının asal olup olmadıgını bulan
		 * ve buna göre cıktı veren program
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int sayi1 = scanner.nextInt();
		long startTime = System.nanoTime();
		

		if (sayi1 == 2) {
			System.out.println("Asal sayıdır");
		} else if (sayi1 < 2 || sayi1 % 2 == 0) {
			System.out.println("Asal Sayı Değildir");
		} else {
			boolean asal = true;
			for (int i = 3; i <= sayi1 - 1; i += 2) {
				if (sayi1 % i == 0) {
					asal = false;
					break;
				}
			}

			if (asal) {
				System.out.println("Asaldır");
			} else {
				System.out.println("Asal Sayı Değildir");
			}

		}
		long endTime = System.nanoTime();
		long timeFlapsed = endTime- startTime;
		System.out.println("Execution time in nanoseconds....." + timeFlapsed );
		System.out.println("Execution time in miliseconds......" + timeFlapsed / 1000000);
		
		
		scanner.close();
		
		
		
		
		

	}

}
