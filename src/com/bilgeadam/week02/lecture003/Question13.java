package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * Dışardan taban değeri ve üs isimli 2 değişken alınacak (2 üzeri 5 gibi)
		 * tabanın kuvvetini hesaplamak istiyorum Kullanıcıya ismi sorulacak.Aldığım
		 * isim değişkeniyle beraber sonucu yazalım.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen taban degeri giriniz");
		int taban = scanner.nextInt();
		System.out.println("Lutfen us değeri giriniz");
		int us = scanner.nextInt();
		scanner.nextLine();

		int i = 1;
		int sonuc = 1;

		while (i <= us) {
			sonuc *= taban;
			i++;

		}
		System.out.println("Lutfen isminizi girin");
		String isim = scanner.nextLine();
		System.out.println(isim + "Girdiğin taban: " + taban + " Girdigin us : " + us + "sonuc" + sonuc);

	}

}
