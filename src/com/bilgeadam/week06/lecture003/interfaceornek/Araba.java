package com.bilgeadam.week06.lecture003.interfaceornek;

public class Araba extends Tasit {

	@Override
	public void ilerle() {
		System.out.println("Araba ilerliyorr.");
		super.ilerle();
	}

	@Override
	public void dur() {
		System.out.println("Araba durdu..s");
		super.dur();
	}

}
