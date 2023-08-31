package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir kelime girdisi olsun
		 * bu stringin her bir char'ını bulunduğu index ile birlikte yazdıralım
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		
		for(int i =0 ; i< kelime.length() ;i++) {
			System.out.println(i + " " + kelime.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
