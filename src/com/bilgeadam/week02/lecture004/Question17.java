package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan sms ve e mail kodu isteyeceğiz.
		 * girilen e mail hatalı ise :girdiğin e mail hatalı yazsın
		 * girilen sms hatalı ise :girdiğin sms hatalı yazsın
		 * 
		 * 
		 */
		int sms =444 ;
		int email =555;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen sms kodunuzu giriniz");
		int sms_deneme = scanner.nextInt();
		System.out.println("Lutfen e mail kodunuzu giriniz");
		int email_deneme = scanner.nextInt();
		
		if(sms != sms_deneme) {
			System.out.println("Girdiginiz sms kodu hatalidir");
			
		}
		if(email!=email_deneme) {
			System.out.println("Giriginiz e mail kodu hatalidir");
			
		}if(email == email_deneme && sms== sms_deneme) {
			
			System.out.println("Giris yapildi");
		}
	
		
		
		
		
	}

}
