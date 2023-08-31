package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan sms ve e mail kodu isteyeceğiz.
		 * hem sms hem e mail hataliysa farkli bir cıktı
		 * sms dogru e mail yanlıssa farklı bir cıktı
		 * emal dogru sms yanlıssa farklı bir cıktı
		 * ikiside dogruysa"giris yapıtınız"
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sms_code =444;
		int email_code =555;
		System.out.println("Please enter the sms code");
		int sms= scanner.nextInt();
		System.out.println("Please enter the email code");
		int email= scanner.nextInt();
		
		
		if(sms_code ==sms && email_code!=email) {
			System.out.println("Girdiginiz e mail kodu yanlıs");
		} else if(sms_code !=sms && email_code==email) {
			System.out.println("Girdiginiz sms kodu yanlıs");
		} else if(sms_code !=sms && email_code!=email) {
			System.out.println("Hem sms hem e mail kodu yanıs");
		}else {
			System.out.println("Giris yaptınız");
		}
		
		
		
		
		
		

	}

}
