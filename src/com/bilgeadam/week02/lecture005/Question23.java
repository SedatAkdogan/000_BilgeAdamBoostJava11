package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		/*
		 * Girilen sayının mükemmel sayı olup olmadıgını bulan program
		 * Mükkemel sayı : kendisi haric tam bölenlerinin toplamı
		 * kendisine eşit olans sayı
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam =0;
		 for(int i=1 ; i<=sayi/2; i++) {
			 if(sayi % i==0) {
				 toplam +=i;
			 }
			 
		 } if(toplam == sayi) {
			 System.out.println("girdiginiz sayi mukkemmel sayidir");
		 }else {
			 System.out.println("Girdiginiz sayi mükemmel sayi degildir");
			 
		 }
		 scanner.close();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
