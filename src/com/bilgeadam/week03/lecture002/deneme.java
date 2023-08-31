package com.bilgeadam.week03.lecture002;

public class deneme {

	public static void main(String[] args) {
	  	int[] dizi = { 2, -256, 2, 1258, 2, 2 };
			boolean kontrol1 = false;

			for (int i = 0; i < dizi.length - 1; i++) {
				if (dizi[i] == 2 && dizi[i + 1] == 2) {
					kontrol1 = true;
					break;
				}
			}

			if (kontrol1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

	}

}
