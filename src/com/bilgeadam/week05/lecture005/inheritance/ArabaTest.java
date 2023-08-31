package com.bilgeadam.week05.lecture005.inheritance;

public class ArabaTest {

	public static void main(String[] args) {

		MotorluTasit tasit = new MotorluTasit();
		tasit.setcolour("Mavi");
		tasit.setKm(0);
		tasit.setMarka("Mercedes");

		// System.out.println(tasit.getcolour() + tasit.getKm() + tasit.getMarka());
		System.out.println(tasit.toString());

		MotorluTasit tasit2 = new MotorluTasit("Audi", "Siyah", 150);

		// System.out.println(tasit2.getcolour() + tasit2.getKm() + tasit2.getMarka());
		System.out.println(tasit2.toString());

		Araba araba = new Araba();
		araba.setcolour("Mavi");
		araba.setKm(0);
		araba.setMarka("Mercedes");
		araba.setKapiSayisi(4);
		System.out.println(araba.toString());

		Araba araba2 = new Araba("Audi", "Siyah", 150, 4);
		System.out.println(araba2.toString());

		araba2.calistir();
		araba2.hizlan();
		araba2.durdur();

		MotorluTasit araba3 = new Araba("Ferrari", "Kırmızı", 200, 4);
		System.out.println(araba3.toString());

	}

}
