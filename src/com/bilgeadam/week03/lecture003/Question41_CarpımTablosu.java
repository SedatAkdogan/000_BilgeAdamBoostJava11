package com.bilgeadam.week03.lecture003;

public class Question41_CarpımTablosu {

	public static void main(String[] args) {
		/*
		 * 
		 * Çarpım tablosunu yazdıralım.
		 * 
		 * 1 x 1 = 1
		 * 1 x 2 = 2 
		 * ... 10'a kadar olan(10 dahil) bütün çarpımları istiyorum.
		 * iki boyutlu dizilerle
		 */
		int boyut =10;
		
		String[][] carpimTablosu = new String[boyut][boyut];
		 for(int i =0 ; i< carpimTablosu.length ; i++) {
			for(int j=0 ; j< carpimTablosu.length ; j++) {
				carpimTablosu[i][j] = (i+1) + "x" + (j+1) + " =" + ((i+1) * (j+1));
				
				
			}
			
		 }
		 for(int i = 0; i<carpimTablosu.length ; i++) {
			 for(int j = 0 ; j<carpimTablosu.length;j++) {
				 System.out.println(carpimTablosu[i][j]);
				 
			 }
			 System.out.println();
			 
		 }
		

	}

}
