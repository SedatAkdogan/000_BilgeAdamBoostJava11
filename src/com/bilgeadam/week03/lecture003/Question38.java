package com.bilgeadam.week03.lecture003;

public class Question38 {

	public static void main(String[] args) {
		/*
		 * dizide 13 sayısı gelene kadar devam edelim 13 sayısı 
		 * bulundaktan sonra ondan bir sonraki sayı 13 degilse
		 * o sayıyı toplama ekleyelim
		 *  int nums[] = { 1, 13, 13, 13, 5, 1 };
		 */
		
		int[] num = {1,13,13,13,5,13};
		
		int toplam = 0 ;
		
		for(int i = 0 ; i< num.length -1 ; i++) {
			if(num[i] == 13 && num[i+1] != 13) {
				toplam += num[i+1];
			} 
		} 
			System.out.println(toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
