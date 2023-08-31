package com.bilgeadam.week04.lecture002;

import java.util.Random;
import java.util.Scanner;

public class Tkm_Uygulama {

	public static void main(String[] args) {
		TasKagitMakas tkm = new TasKagitMakas();
		String[] array = tkm.tasKagitMakas;

		// Random random = new Random();
		// int sayi = random.nextInt(1,4);
		// System.out.println(sayi);
		uygulama(array);

	}

	// tas-kağıt
	// tas - makas
	// kagıt - makas

	public static void uygulama(String[] array) {
		Scanner scanner = new Scanner(System.in);
		String kontrol = "";
		int userSkor = 0;
		int pcSkor = 0;
		do {
			String pcSecim = rastgeleSecim(array);
			String userSecim = userSecim();

			if (userSecim.equalsIgnoreCase(pcSecim)) {
				System.out.println("BERABERE");
				System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);

			} else {

				switch (userSecim) {

				case "taş":
					if (pcSecim.equalsIgnoreCase("kağıt")) {
						System.out.println("KAYBETTİNİZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);

					}
					break;
				case "kağıt":
					if (pcSecim.equalsIgnoreCase("makas")) {
						System.out.println("KAYBETTİNİZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);

					}
					break;

				case "makas":
					if (pcSecim.equalsIgnoreCase("taş")) {
						System.out.println("KAYBETTİNİZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);

					}
					break;
				default:
					System.err.println("Lutfen gecerli bir secim yapınız");
					break;

				}
			}

			System.out.print("Tekrar oynamak için 'E' harfini giriniz.\t:\t");
			kontrol = scanner.nextLine();
		} while (kontrol.equalsIgnoreCase("E"));

		System.err.println("Uygulama Sonlandı");
	}

	private static String userSecim() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Taş - Kağıt - Makas degerlerinden birini seciniz : ");
		String secim = scanner.nextLine();

		return secim;
	}

	private static String rastgeleSecim(String[] array) {
		Random random = new Random();
		int sayi = random.nextInt(array.length);

		return array[sayi];
	}

}
