package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/*
		 * Girilen sayının 5 in kuvveeti olup olmadıgını bulan program
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		boolean kontrol = true;
		
		if(sayi ==1) {
			System.out.println("Girdiginiz sayi 5 in kuvvetidir");
			kontrol =false;
		} else if(sayi <0){
			System.out.println("Lutfen pozisitif bir sayi giriniz");
			kontrol = false;
		}
		while(kontrol) {
			if(sayi %5 == 0) {
				sayi /= 5;
				if(sayi==1) {
					System.out.println("Sayi 5 in kuvvetidir");
					kontrol = false;
					
				} 
				
			}else {
				System.out.println("Sayi 5 in kuvveti degildir");
				kontrol = false;
			}
		}

		

		
		
		
		
		
		
		
		
		
		
	}

}
