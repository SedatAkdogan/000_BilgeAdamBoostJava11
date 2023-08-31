package com.bilgeadam.week07.lecture001.abstractonornek;

public class Motosiklet extends Tasit{

	@Override
	public void akrobatikHareketYap() {
		System.out.println("Motor ön kaldiriypr....");
		
	}

	public Motosiklet() {
		super();
		
	}

	public Motosiklet(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);
		
	}
	

	
	
}
