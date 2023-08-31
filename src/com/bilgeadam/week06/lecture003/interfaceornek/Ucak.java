package com.bilgeadam.week06.lecture003.interfaceornek;

public class Ucak extends Tasit implements IUcabilir {
	
	
	@Override
	public void ilerle() {
		super.ilerle();
		System.out.println("Ucak pistte ilerliyor.");
	}

	@Override
	public void uc() {
		System.out.println("Ucak ucuyorrr...");
		
	}

	
	

}
