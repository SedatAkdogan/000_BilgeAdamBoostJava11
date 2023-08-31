package com.bilgeadam.week02.lecture002;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Bir ürünün fiyatında %18 KDV ve % 15 KAR oldugunu biliyoruz Bir ürün fiyatım
		 * olsun Bu ürün fiyatından ham fiyatı bulan kodu yazınız.
		 * 
		 * 
		 */

		float rawPrice = 0;
		float price = 100;
		float priceWithoutVat;

		priceWithoutVat = price / 1.18f;
		System.out.println("KDV'siz fiyat" + priceWithoutVat);
		rawPrice = priceWithoutVat / 1.15f;
		System.out.println("Ham Fiyat" + rawPrice);

	}

}
