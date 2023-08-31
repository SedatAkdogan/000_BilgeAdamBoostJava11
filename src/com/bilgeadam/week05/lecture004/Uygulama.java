package com.bilgeadam.week05.lecture004;

import java.util.Scanner;

public class Uygulama {
	/*
	 * Menu ; *****Kullanici Kayit Sistemi***** 1- Kayıt ol 2 -Giris yap
	 * 3-Kullanicilari göster 4- Cıkıs
	 * 
	 * Adımlar 1- Menuyu olusturalım 2-Menuden secm yap 3-Yapılan secime göre
	 * aksiyon alabilecegim bir tema olustur
	 * 
	 * Case 1: kayitOl() methodunun içini yaz.2 methoda daha ihtiyac olacak.
	 * kullaniciEkle() Database sinifinda liste boyutunu artir(); --> liste.length
	 * -2 kadar veri barındırdıgı zaman listenin boyutunu 5 artırsın
	 * 
	 */
	static Scanner scanner = new Scanner(System.in);

	public void uygulama() {
		int secim;
		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariGoster();
				break;
			case 4:
				System.err.println("Cikis yaptiniz..");
				break;
			default:
				System.err.println("Lutfen gecerli bir secim yapiniz..");

			}

		} while (secim != 4);
	}

	private void kullanicilariGoster() {
		Kullanici[] kullanicilar = Database.kullaniciListesi;

		for (int i = 0; i < Database.uzunluk; i++) {
			System.out.println(kullanicilar[i].id + " " + kullanicilar[i].isim + " " + kullanicilar[i].email);
		}

	}

	private void girisYap() {
		int sayac = 3;
		while (sayac != 0) {
			System.out.print("Lutfen emailinizi giriniz : ");
			String email = scanner.nextLine();
			System.out.print("Lutfen sifrenizi giriniz : ");
			String sifre = scanner.nextLine();
			if (!Database.kullaniciVarmi(email, sifre)) {
				System.err.println("E mail ya da sifre hatali. ");
				System.out.println(sayac + " deneme hakkiniz kaldi.");
				sayac--;
			} else {
				break;
			}
		}
	}

	private void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.print("Lutfen adinizi giriniz : ");
		kullanici.isim = scanner.nextLine();
		System.out.print("Lutfen mailinizi giriniz : ");
		kullanici.email = scanner.nextLine();
		System.out.print("Lutfen sifrenizi giriniz : ");
		kullanici.sifre = scanner.nextLine();
		kullanici.id = Database.uzunluk + 1;
		System.out.println(kullanici.isim + kullanici.email + kullanici.sifre + kullanici.id);
		Database.kullaniciEkle(kullanici);

	}

	private void menu() {
		System.out.println("******************************************************");
		System.out.println("******Kullanici Kayit Sistemi******");
		System.out.println("******************************************************");
		System.out.println();
		System.out.println("1 -Kayit ol");
		System.out.println("2 - Giris yap");
		System.out.println("3- Kullanicilari Goster");
		System.out.println("4 -Cikis");

	}

	private int secimYap() {
		System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;
	}

}
