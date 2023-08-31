package com.bilgeadam.week09.lecture002.sepet;

public enum EUrun {

	CIPS(20.0),KOLA(25.0),SEKER(30.0),YAG(35.0),UN(40.0),EKMEK(45D),CAY(50.0),YUMURTA(55.0),YOGURT(60.0),SUT(65D);
	
	private Double fiyat;
	
	
	

	private EUrun(Double fiyat) {  // Bu consturctoru olusturunca yukardaki cipslere parametre vermen gerekiyor.
		this.fiyat = fiyat;
	}

	public Double getFiyat() {
		return fiyat;
	}

	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
