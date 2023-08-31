package com.bilgeadam.week05.lecture003;

import java.util.Scanner;

import javax.swing.Box.Filler;

public class TestSehirDatabase {
	/*
	 * 1-Dısarıdan girilen harfle baslayan illeri yazdır.
	 * 2-"01-Adana" formatında,illeri plaka kodları ile yazdıran method
	 * 3- Girdiğimiz sehrin ismine göre plakasını dönen method
	 */

	public static void main(String[] args) {
		SehirDatabase sehirDB = new SehirDatabase();
		String[] iller = sehirDB.iller;
		//harfleBaslayanIller(iller);
		//plakaIleIlleriYazdır(iller);
		sehreGorePlakaBul(iller);
		System.out.println(sehreGorePlakaBul2(iller));
		
	}

	public static void harfleBaslayanIller(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir harf giriniz : ");
		String harf = scanner.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(iller[i]);
			}
		}

	}
	
	public static void plakaIleIlleriYazdır(String[]iller) {
	
		for(int i =0;i<iller.length;i++) {
			if(i<9) {
				System.out.println("0" + (i +1) + "-" + iller[i]);
			} else {
				System.out.println((i +1) + "-" + iller[i]);
			}	
		}
	}
	
	public static void sehreGorePlakaBul(String[] iller) {
		Scanner scanner = new Scanner(System.in);{
		System.out.println("Lutfen sehir giriniz : ");
		String sehir = scanner.nextLine();
		for(int i =0; i<iller.length;i++) {
			if(iller[i].equalsIgnoreCase(sehir)){
				if(i<9) {
					System.out.println("0" + (i +1));
				} else {
					System.out.println((i +1));
				}	
			}
		}
	}
	}
	public static String sehreGorePlakaBul2(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen sehir giriniz : ");
		String sehir = scanner.nextLine();
		for(int i =0; i<iller.length;i++) {
			if(iller[i].equalsIgnoreCase(sehir)){
				if(i<9) {
					return "0" + (i +1);
				} else {
					return "" + (i +1);
				}	
			}
		}
		return "Boyle bir sehir bulunmamaktadır";
	
	}
	

}// class sonu
