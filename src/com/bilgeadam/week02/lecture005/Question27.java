package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir değer alacağız, 
		 * bu aldığımız değerin içerisinde kaç tane "a" harfi 
		 * olduğunu bize döndürecek bir program.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir metin giriniz");
		String metin = scanner.nextLine();
		int aSayisi = 0;
		for(int i =0 ; i<metin.length() ; i++) {
			if(metin.charAt(i) == 'a' || metin.charAt(i) == 'A') {
				aSayisi++;
			}
				
		}
		System.out.println("Girilen metinde " + aSayisi + "tane 'a' ya da 'A' bulunmaktadır");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
