package com.bilgeadam.week05.lecture005.inheritance;

public class MotorluTasit {

	private String marka;
	private String colour;
	private int km;

	public void calistir() {
		System.out.println("Tasit calistirildi.");
	}

	public void durdur() {
		System.out.println("Tasit calismayi durdurdu.");
	}

	public void hizlan() {
		System.out.println("Tasit hizlaniyor.");
	}

	public MotorluTasit() {
		super();
	}

	public MotorluTasit(String marka, String renk, int km) {
		super();
		this.marka = marka;
		this.colour = renk;
		this.km = km;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getcolour() {
		return colour;
	}

	public void setcolour(String renk) {
		this.colour = renk;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "MotorluTasit [marka=" + marka + ", colour=" + colour + ", km=" + km + "]";
	}

}
