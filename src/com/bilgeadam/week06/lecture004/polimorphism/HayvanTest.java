package com.bilgeadam.week06.lecture004.polimorphism;

public class HayvanTest {

	public static void main(String[] args) {
		
		Hayvan kedi = new Kedi();
		Kopek kopek = new Kopek();
		
		IMiyav kedi1 = new Kedi();
		kedi1.miyavla();
		kedi.sesCikar();
		kedi1.temizle();
		Kedi kedi2 = new Kedi();
		kedi2.temizle();
		

	}

}
