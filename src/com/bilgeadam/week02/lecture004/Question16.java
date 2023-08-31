package com.bilgeadam.week02.lecture004;

public class Question16 {

	public static void main(String[] args) {
		/*
		 * 1 den 100 e kadar olan çift sayıların toplamının
		 * tek sayıların toplamına oranı
		 */
		
		int cift_toplam =0;
		int tek_toplam =0;
		for(int i =1 ; i<=100 ; i++) {
			if(i %2 ==0) {
				cift_toplam +=i;
			} else {
				tek_toplam +=i;
					
			}
			
			
				
		}
		double oran = cift_toplam / (double)tek_toplam;
		System.out.println("sonuc:" + oran);
		
		
		
		
		
		
		
		
		
		
	}

}
