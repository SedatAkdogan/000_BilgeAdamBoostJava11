package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunuOdev {

	public static void main(String[] args) {
	
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen yil giriniz : ");
		String yil = scanner.nextLine();
		System.out.print("Lutfen ay giriniz : ");
		String ay = scanner.nextLine();
		System.out.print("Lutfen gun giriniz : ");
		String gun = scanner.nextLine();
		int sayisalAy = Integer.parseInt(ay);
		String tarih;
		if (sayisalAy < 10) {
			tarih = yil + "-" + "0" + ay + "-" + gun;
		} else {
			tarih = yil + "-" + ay + "-" + gun;
		}
		LocalDate dogumGunu = LocalDate.parse(tarih);
		System.out.println("Doğum tarihiniz: " + dogumGunu);

		long day = dogumGunu.until(now, ChronoUnit.DAYS);
		System.out.println("Doğum gününüzden şimdiye kadar " + day + " gün geçmiş.");
		long week = dogumGunu.until(now, ChronoUnit.WEEKS);
		System.out.println("Doğum gününüzden şimdiye kadar " + week + " hafta geçmiş.");
		long month = dogumGunu.until(now, ChronoUnit.MONTHS);
		System.out.println("Doğum gününüzden şimdiye kadar " + month + " ay geçmiş.");
		long year = dogumGunu.until(now, ChronoUnit.YEARS);
		System.out.println("Doğum gününüzden şimdiye kadar " + year + " yıl geçmiş.");

		long yilfarki = dogumGunu.until(now, ChronoUnit.YEARS);
		LocalDate gelecekDogumGunu = dogumGunu.plusYears(1 + yilfarki);
		System.out.println("Gelecek doğum günü tarihiniz: " + gelecekDogumGunu);
		long gunfarki = now.until(gelecekDogumGunu, ChronoUnit.DAYS);
		System.out.println("Gelecek doğum gününüze " + gunfarki + " gün kaldı.");
	}

}
