package com.bilgeadam.week03.lecture002;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		/*
		 * Dısarıdan girilen ülke ismi bizim arrayimizde bulunuyor mu 
		 * kontrol edelim
		 * Türkiye,Japonya,Moğolistan,Amerika,Rusya,Çin
		 */
		
		String [] ulkeler = {"Türkiye","Japonya","Moğolistan","Amerika","Rusya","Çin"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir ülke giriniz : ");
		String ulke = scanner.nextLine();
		
		for(int i = 0; i<ulkeler.length;i++) {
			if(ulkeler[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiginiz ülke dizimizde bulunmaktadır");
				break;
				
			} else if(i==ulkeler.length-1) {
				System.err.println("Girdiginiz ülke dizimizde bulunmamaktadır");
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
