package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		/*
		 * Kullanıcı 1 ile 7 arası 1 sayı girsin 1 ile 7 dahil
		 * Bu sayıya denk gelen haftanın gününü yazdıralım
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 7 arasında bir sayi giriniz");
		int sayi = scanner.nextInt();
		
		switch(sayi) {
		case 1: if(sayi==1);
		System.out.println("Girdiginiz sayi:Pazartesi günüdür");break;
		case 2: if(sayi==2);
		System.out.println("Girdiginiz sayi:Salı günüdür");break;
		case 3: if(sayi==3);
		System.out.println("Girdiginiz sayi:Carsamba günüdür");break;
		case 4: if(sayi==1);
		System.out.println("Girdiginiz sayi:Persembe günüdür");break;
		case 5: if(sayi==5);
		System.out.println("Girdiginiz sayi:Cuma günüdür");break;
		case 6: if(sayi==1);
		System.out.println("Girdiginiz sayi:Cumartesi günüdür");break;
		case 7: if(sayi==1);
		System.out.println("Girdiginiz sayi:Pazar günüdür");break;
		default:
			System.err.println("Girdiginiz sayi 1 ile 7 arasında olmalıdır");
		} 
			
		scanner.close();

		
		
		
		

	}

}
