package com.bilgeadam.week04.MetorlarEtut;

public class Question2 {
	/*
	 * int[] alperen = {5,10,25,10,500,1000} 
	 * int[] muhammet = {10,15,1000,300,1200}
	 * int[] ugurcan = {2000}
	 * 
	 * 2000 tl ve üzeri sepet tutarına ulasanlara %10 indirim 
	 * 2500 tl ve üzeri sepet tutarına ulasanlara %12.5 indirim
	 * 
	 * 
	 * sepetinde sepetinde 1000 tl ve üzeri ve 5 üründen fazla ürün olan
	 * kullanıcılara ekstra %5 indirim.(sepet fiyatı üzerinden)
	 * 
	 */

	public static void main(String[] args) {
		int[] alperen = {5,10,25,10,500,1000} ;
		int[] muhammet = {10,15,1000,300,1200};
		int[] ugurcan = {2000};
		
//		int[] alperenPriceAndQuantity = calculatePriceAndQuantity(alperen);
//		int[] muhammetPriceAndQuantity = calculatePriceAndQuantity(muhammet);
//		int[] ugurcanPriceAndQuantity = calculatePriceAndQuantity(ugurcan);
//		
//		System.out.println(alperenPriceAndQuantity[1]);
//		System.out.println(muhammetPriceAndQuantity[1]);
//		System.out.println(ugurcanPriceAndQuantity[1]);
		
		int [] person = alperen;
		System.out.println("Sepet tutarı = " + calculatePriceAndQuantity(person)[0]);
		System.out.println("Sepet fiyatı üzerinden indirim = " + discountOverCartPrice(calculatePriceAndQuantity(person)));
		System.out.println("Sepetteki ürün adedi ve sepet tutarı üzerinden indirim =  " + discountOverQuantites(calculatePriceAndQuantity(person)));
		
		System.out.println("Ödemenin gereken tutar = " +
				
				discountedCartPrice(calculatePriceAndQuantity(person)[0]
				,discountOverCartPrice(calculatePriceAndQuantity(person))
				,discountOverQuantites(calculatePriceAndQuantity(person))));
				
				
				
				
				
				
				
	
	
	}
	/**
	 * İçerisine int[] array(sepet) alarak toplam ücreti ve 
	 * sepetteki ürün sayısını bir int dizi halinde döner.
	 * @param cart --> int array (bu durumda sepet)
	 * @return --> int[] array--> ücret ve ürün sayısı
	 */
	
	public static  int [] calculatePriceAndQuantity(int[] cart) {
		int price = 0;
		int quantity =cart.length;
		int[] priceAndQuantity = new int[2];
		for(int i = 0 ; i<cart.length; i++) {
			price += cart[i];
			}
		priceAndQuantity[0] = price;
		priceAndQuantity[1] = quantity ;
		
		return priceAndQuantity;
	}
	/**
	 * İçerisine int[] array (bu projede toplam ücret ve ürün sayısı)
	 * arrayini alarak toplam fiyat üzerinden hesaplanan indirimi döner
	 * @param pricesAndQuantities --> int[] array (bu durumda toplam ücret ve 
	 * ürün sayısı arrayi) 
	 * @return --> double veri tipinde uygulanan indirim miktarı
	 */
	
	public static double discountOverCartPrice(int[] pricesAndQuantities) {

		double discountRatio;
		if(pricesAndQuantities[0] >=2000 && pricesAndQuantities[0] <2500) {
			discountRatio = 0.10;
			
		} else if(pricesAndQuantities[0] >= 2500) {
			discountRatio = 0.125;
			
		} else {
			discountRatio = 0;
		}
		return pricesAndQuantities[0] * discountRatio;
	}
	
	//  1000 tl ve üzeri ve sepetinde 5 üründen fazla olan kullanıcılara
	// ekstra %5 indirim.(sepet fiyatı üzerinden)
	
	public static double discountOverQuantites(int[] priceAndQuantities) {
		
		double discountRatio;
		if(priceAndQuantities[0] >=1000 && priceAndQuantities[1]>=5) {
			discountRatio = 0.05;
		} else {
			discountRatio = 0;
		}
		return discountRatio * priceAndQuantities[0];
		
	}
	
	
		public static double discountedCartPrice(int cartPrice, double discountOverPrice, double discountOverQuantity) {
			
			return cartPrice-discountOverPrice-discountOverQuantity;
		}
		
	
	
	
	

}
