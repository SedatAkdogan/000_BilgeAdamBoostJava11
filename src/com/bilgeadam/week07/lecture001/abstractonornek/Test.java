package com.bilgeadam.week07.lecture001.abstractonornek;

public class Test {
	
	/*
	 * Tasit superclass'im olacak.Bu sınıf abstract bir sınıf olacak.
	 * marka
	 * model
	 * maksHiz;
	 * vites;
	 * hilan();
	 * frenYap();
	 * vitesDegistir();
	 * ozellikleriGoster();
	 * akrobatikHareketYap();
	 * 
	 * Bu tasit sinifindan miras alan araba ve motosiklet isimli 2 sınıf olustur.
	 * 
	 */

	public static void main(String[] args) {
		Araba araba1 = new Araba();
		Araba araba2 = new Araba("BMW","5.20",0,"N");
		Motosiklet motosiklet1 = new Motosiklet();
		Motosiklet motosiklet2 = new Motosiklet("Ducati","848",50,"1");
		motosiklet1.setMarka("Ducati");
		motosiklet1.setModel("848");
		motosiklet1.setHiz(50);
		motosiklet1.setVites("1");
		
		araba2.vitesDegistir("1");
		araba2.hizlan();
		araba2.hizlan();
		araba2.frenYap();
		System.out.println();
		araba2.ozellikleriGoster();
		araba2.akrobatikHareketYap();
		System.out.println();
		motosiklet1.ozellikleriGoster();
		motosiklet1.vitesDegistir("2");
		motosiklet1.hizlan();
		motosiklet1.hizlan();
		motosiklet1.hizlan();
		motosiklet1.hizlan();
		
		System.out.println();
		motosiklet1.ozellikleriGoster();
		motosiklet1.akrobatikHareketYap();
		
		
		

	}

}
