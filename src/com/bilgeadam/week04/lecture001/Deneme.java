package com.bilgeadam.week04.lecture001;

import java.util.Scanner;

public class Deneme {
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		toplama();

	}
	public static String toplama() {
		String sayi1 ="";
		int toplam = 0;
		boolean control = true;
		while(control) {
		sayi1 = scanner.nextLine();
		if(!sayi1.equals("=")) {
		int tamsayi1 = Integer.parseInt(sayi1);
		toplam += tamsayi1;
		}
		else control = false;
		
		}
		System.out.println(toplam);
		
		
		
		
		return "" + toplam ;
		
}
}
