package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre

		 

	    // burc hesabı yapan program

	 

	    // Koç Burcu : 21 Mart - 20 Nisan

	 

	    // Boğa Burcu : 21 Nisan - 21 Mayıs

	 

	    // İkizler Burcu : 22 Mayıs - 22 Haziran

	 

	    // Yengeç Burcu : 23 Haziran - 22 Temmuz

	 

	    // Aslan Burcu : 23 Temmuz - 22 Ağustos

	 

	    // Başak Burcu : 23 Ağustos - 22 Eylül

	 

	    // Terazi Burcu : 23 Eylül - 22 Ekim

	 

	    // Akrep Burcu : 23 Ekim - 21 Kasım

	 

	    // Yay Burcu : 22 Kasım - 21 Aralık

	 

	    // Oğlak Burcu : 22 Aralık - 21 Ocak

	 

	    // Kova Burcu : 22 Ocak - 19 Şubat

	 

	    // Balık Burcu : 20 Şubat - 20 Mart
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen ay degeri girin");
		int ay = scanner.nextInt();
		System.out.print("Lutfen gün degeri giriniz");
		int gun= scanner.nextInt();
		
		switch(ay) {
		
		case 1 :
			if(gun>=1 && gun<=21) {
				System.out.println("Burcunuz oglak");
			} else if(gun>31 || gun<31) {
				System.err.println("Ocak ayı 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.println("Burcunuz kova");
			} break;
		case 2 :
			if(gun>=1 && gun<=19) {
				System.out.println("Burcunuz kova");
			} else if(gun>29|| gun<31) {
				System.err.print("Subat ayı 29 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz balık");
			}break;
		case 3 :
			if(gun>=1 && gun<=20) {
				System.out.println("Burcunuz balık");
			} else if(gun>31 || gun<31) {
				System.err.print("Mart ayı 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz koç");
			}break;
		case 4 :
			if(gun>=1 && gun<=20) {
				System.out.println("Burcunuz koç");
			} else if(gun>31 || gun<31) {
				System.err.print("Nisan ayı 30 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz Boğa");
			}break;
			
		case 5 :
			if(gun>=1 && gun<=21) {
				System.out.println("Burcunuz boğa");
			} else if(gun>31 || gun<31) {
				System.err.print("Mayıs ayı 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz ikizler");
			}break;
		case 6 :
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz ikizler");
			} else if(gun>31 || gun<31) {
				System.err.print("haziran ayı 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz yengeç");
			}break;
		case 7 :
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz yengeç");
			} else if(gun>31 || gun<31) {
				System.err.print("Temmuz 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("BurcunuzAslan");
			}break;
		case 8 :
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz Aslan");
			} else if(gun>31 || gun<31) {
				System.err.print("Ağustos 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("BurcunuzBaşak");
			}break;
		case 9 :
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz başak");
			} else if(gun>31 || gun<31) {
				System.err.print("Eylül 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz Terazi");
			}break;
		case 10:
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz Terazi");
			} else if(gun>31 || gun<31) {
				System.err.print("Ekim 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz Akrep");
			}break;
		case 11:
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz Akrep");
			} else if(gun>31 || gun<31) {
				System.err.print("Kasım 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz Yay");
			}break;
		case 12:
			if(gun>=1 && gun<=22) {
				System.out.println("Burcunuz Yay");
			} else if(gun>31 || gun<31) {
				System.err.print("Aralık 31 gündür.Girdiginiz deger yanlıs");
			} else {
				System.out.print("Burcunuz Oğlak");
			}break;
		
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
