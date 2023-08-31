package com.bilgeadam.week05.lecture005.inheritance;

public class Araba extends MotorluTasit {

	private int kapiSayisi;

	public void vitesDegisgtir() {
		System.out.println("Arabanın vitesi degistirildi. ");
	}

	public void farlariAc() {
		System.out.println("Arabanin farlari acildi. ");
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}

	public Araba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Araba(int kapiSayisi) {
		super();
		this.kapiSayisi = kapiSayisi;
	}

	public Araba(String marka, String renk, int km) {
		super(marka, renk, km); // this kapi sayisini getirir super getirmez.

	}

	public Araba(String marka, String renk, int km, int kapiSayisi) {
		super(marka, renk, km);
		this.kapiSayisi = kapiSayisi;
	}

	@Override
	public String toString() {
		return "Araba [kapiSayisi=" + kapiSayisi + "," + super.toString() + "]";
	}

	@Override
	public void calistir() {
		System.out.println("Araba calistirildi");

	}

	@Override
	public void durdur() {
		System.out.println("Araba durduruldu");
	}

	@Override
	public void hizlan() {
		System.out.println("Araba hızlanıyo");
	}

}
