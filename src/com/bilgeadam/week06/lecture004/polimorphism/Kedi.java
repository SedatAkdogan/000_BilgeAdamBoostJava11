package com.bilgeadam.week06.lecture004.polimorphism;

public class Kedi extends Hayvan implements IMiyav {

	@Override
	public void miyavla() {
		System.out.println("miyavvvvvvv");
		
	}

	@Override
	public void temizle() {
		System.out.println("Kedi temizlendi");
		
	}

	
}
