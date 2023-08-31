package com.bilgeadam.week04.lecture001;

import java.util.Scanner;

public class Uygulama {
	static Scanner scanner = new Scanner(System.in);
	
	public static void uygulama() {
		boolean kontrol = true;
		while (kontrol) {
			menu();
			
			switch(islemSec()) {
			case 1 : System.out.println("İşlemin sonucu =  " +toplama() + "\n");
				break;
			case 2 : System.err.println("Islemin sonucu = " + cikarma() + "\n"); 
			
			break;
			case 3 : System.err.println("ıslemin sonucu = " + carpma() + "\n");
			break ;
			case 4 : System.err.println("Islemin sonucu = " + bolme() + "\n");
				break;
			
			case 0 : System.err.println("Çıkıs yapıldı");
			kontrol = false;
			
				break;
				
				default:
					System.err.println("Lutfen gecerli bir secim yapiniz");
					break ;
					
			
			}
			
			
			
		}
		
	}
	
	
	
	public static void menu() {
		System.out.println("****** HESAP MAKİNESİ*****");
		System.out.println();
		System.out.println("1 - Toplama");
		System.out.println("2 - Cikarma");
		System.out.println("3 - Carpma");
		System.out.println("4 - Bolme");
		System.out.println("5 - EbobEkok");
		System.out.println("0 - CIKIS");
		
		
		
		
		
	}
	
	public static int islemSec() {
		System.out.print("Lutfen islem seciniz");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim ;
	}
	
	public static int toplama() {
		System.out.println("\n****TOPLAMA İSLEMİ");
		String sayi1 ="";
		int toplam = 0;
		
		while(!sayi1.equals("=")) {
			System.out.println("Lutfen bir sayı giriniz");
		sayi1 = scanner.nextLine();
		if(SayiKontrol.isNumeric(sayi1)) {
			toplam += Integer.parseInt(sayi1);
		}
		else if(sayi1.equals("=")) {
			return toplam;
		
		}
		else {
			System.err.println("Lutfen gecerli bir sayi giriniz");
		}
		
		}
		
		
		return toplam;
		
	}
	public static int cikarma() {
		
		System.out.println("\n****CIKARMA İSLEMİ");
		String sayi1 ="";
		int islemSonucu = 0;
		int count =0;
		
		while(!sayi1.equals("=")) {
			System.out.println("Lutfen bir sayı giriniz");
		sayi1 = scanner.nextLine();
		if(sayi1.equals("=") && count == 0) {
		islemSonucu = Integer.parseInt(sayi1);
		count++;
		}
		
		else if(!sayi1.equals("=")) {
			return islemSonucu ;
		
		}
		else {
			islemSonucu -= Integer.parseInt(sayi1);
		}
		
		}
		
		
		return islemSonucu;
		
	}


	public static int carpma() {
		System.out.println("\n****CARPMA İSLEMİ");
		String sayi1 ="";
		int sonuc = 1;
		
		while(!sayi1.equals("=")) {
			System.out.println("Lutfen bir sayı giriniz");
		sayi1 = scanner.nextLine();
		if(sayi1.equals("=")) {
			return sonuc;
		
		}
		else {
			sonuc *= Integer.parseInt(sayi1);
		}
		
		}
		return sonuc;

	}
	public static double bolme () {

		System.out.println("\n****CIKARMA İSLEMİ");
		String sayi1 ="";
		double islemSonucu = 0;
		int count =0;
		
		while(!sayi1.equals("=")) {
			System.out.println("Lutfen bir sayı giriniz");
		sayi1 = scanner.nextLine();
		if(!sayi1.equals("=") && count == 0) {
		islemSonucu = Double.parseDouble(sayi1);
		count++;
		}
		
		else if(!sayi1.equals("=")) {
			return islemSonucu ;
		
		}
		else {
			islemSonucu -= Double.parseDouble(sayi1);
		}
		
		}
		
		
		return islemSonucu;
		
		
		}
	public static String ebobEkok(int sayi1 ,int sayi2) {
		
		return "" + 0 ;
		}
}
	
