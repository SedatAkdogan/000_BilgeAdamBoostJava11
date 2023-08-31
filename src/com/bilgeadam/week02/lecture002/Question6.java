package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		/*
		 * Dairenin alanını ve çevresini bulalım yarı çap dısardan input pi=3.14
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Yaricap giriniz");

		double yaricap = sc.nextDouble();
		double alan = 3.14d * yaricap * yaricap;
		double cevre = 2 * 3.14d * yaricap;
		System.out.println("Alan:" + alan + "\nÇevresi" + cevre);

		sc.close();

	}

}
