package com.bilgeadam.Sınav1;

import java.util.Scanner;

public class Islemler {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static void operasyon() {
		menu();
	}

	public static void menu() {
		boolean control = true;
		while (control) {
			System.out.println("******************************************************");
			System.out.println("******ÖĞRENCİ BİLGİ SİSTEMİ******");
			System.out.println("******************************************************");
			System.out.println("1 - Sınıf arkadaslarını tanımla");
			System.out.println("2 - Hobilerini gir");
			System.out.println("3- Maas beklentilerini gir");
			System.out.println("4 - Sınıf Listesi");
			System.out.println("0 - Çıkış");

			switch (secim()) {

			case 1:
				for (int i = 0; i < ogrenciTanimla().length; i++) {
					System.out.println("Ogrencinin adi....: " + ogrenciTanimla()[i]);
				}

				break;
			case 2:
				for (int i = 0; i < ogrenciTanimla().length; i++)
					System.out.println(ogrenciTanimla()[i] + "'in hobileri"
							+ hobileriKaydet(hobiKontrol(ogrenciSecim(ogrenciTanimla()[i]))));
				break;
			case 3:
				maasBeklentileriniYaz(ogrenciTanimla());

				break;
			case 4:
				break;
			case 0:
				System.err.println("Çıkıs Yaptınız");
				control = false;
				break;
			default:
				System.out.println("Lütfen gecerli bir secim yapınız.");
				break;

			}

		}

	}

	public static int secim() {

		System.out.println("Lutfen secim yapiniz");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;
	}

	public static String[] ogrenciTanimla() {

		OgrenciOzelListe liste = new OgrenciOzelListe();
		liste.add("Muhammet");
		liste.add("Deniz");
		liste.add("Bahar");
		liste.add("Kerem");
		liste.add("Ceren");
		String[] ogrenciler = new String[liste.boyut];
		ogrenciler = liste.ogrenciDizisi;

		return ogrenciler;

	}

	public static void maasBeklentileriniYaz(String[] ogrenciler) {
		System.out.println("Lutfen maas beklentilerini girin.");

		MaasOzelListe maasliste = new MaasOzelListe();
		maasliste.add(scanner.nextDouble());
		maasliste.add(scanner.nextDouble());
		maasliste.add(scanner.nextDouble());
		maasliste.add(scanner.nextDouble());
		maasliste.add(scanner.nextDouble());
		double[] maaslar = new double[maasliste.boyut];
		maaslar = maasliste.maasDizisi;
		for (int i = 0; i < maaslar.length; i++) {

			System.out.println(ogrenciTanimla()[i] + "'in maas beklentisi... = " + maaslar[i]);
		}

	}

	public static boolean[] hobiKontrol(String ogrenciSecimi) {

		boolean yürüyüs = false;
		boolean kitapOkuma = false;
		boolean spor = false;
		boolean kodYazma = false;
		boolean[] hobiler = { yürüyüs, kitapOkuma, spor, kodYazma };
		System.out.println("Yürümekten hoslanır mısın  ?");
		String EH = scanner.nextLine();
		if (EH.equalsIgnoreCase("E")) {
			yürüyüs = true;

		}
		System.out.println("Kitap okumaktan hoslanır mısın  ?");
		EH = scanner.nextLine();
		if (EH.equalsIgnoreCase("E")) {
			kitapOkuma = true;

		}
		System.out.println("Spor rutinlerin var mı  ?");
		EH = scanner.nextLine();
		if (EH.equalsIgnoreCase("E")) {
			spor = true;
		}
		System.out.println("Kod yazmaktan hoslanır mısın ?");
		EH = scanner.nextLine();
		if (EH.equalsIgnoreCase("E")) {
			kodYazma = true;
		}

		return hobiler;

	}

	public static String ogrenciSecim(String ogrenci) {

		System.out.println("Lutfen ogrenci secimi yapiniz");
		String secim = scanner.nextLine();

		return secim;
	}

	public static void sinifListesi() {
		String[][] sinif_listesi = new String[ogrenciTanimla().length][4];
		sinif_listesi[0][0] = "1";
		sinif_listesi[1][0] = "2";
		sinif_listesi[2][0] = "3";
		sinif_listesi[3][0] = "4";
		sinif_listesi[4][0] = "5";

		for (int i = 0; i < sinif_listesi.length; i++) {
			sinif_listesi[i][1] = ogrenciTanimla()[i];
		}

		System.out.println();

	}

	public static String[] hobileriKaydet(boolean[] hobiler) {
		String[] hobiler1 = new String[hobiler.length];
		for (int i = 0; i < hobiler.length; i++) {
			hobiler1[i] = String.valueOf(hobiler[i]);
		}
		return hobiler1;
	}

} // class sonu
