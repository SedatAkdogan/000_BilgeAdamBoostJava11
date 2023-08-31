package com.bilgeadam.week05.lecture003;

public class StaticOrnek {
	int number =0; // nesne degiskeni
	static int  number2 =0;
	public static void main(String[] args) {
		StaticOrnek staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		staticOrnek = new StaticOrnek();
		System.out.println(staticOrnek.number);
		staticOrnek.numaraVer();
		StaticOrnek staticOrnek2 = new StaticOrnek();
		System.out.println(staticOrnek2.number + " " + staticOrnek2.number2);
		

	}
	public void numaraVer() {
		number +=1;
		number2 +=1;
		System.out.println("number : " + number);
		System.out.println("number2 : " + number2);
	}

	
}
