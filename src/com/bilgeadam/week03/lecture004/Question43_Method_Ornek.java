package com.bilgeadam.week03.lecture004;

public class Question43_Method_Ornek {
	//Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
	//başka bir diziye atsın ve o diziyi yazdırsın. 
	//int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };

	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
		
		
		tekSayilariAta(matris);
		
	}
	
	public static void tekSayilariAta(int[][] ikiBoyutluArray) {
		int[] array = new int [ikiBoyutluArray.length*ikiBoyutluArray[0].length];
		int sayac = 0;
		for(int i = 0 ; i< ikiBoyutluArray.length ; i++) {
			for(int j = 0 ; j< ikiBoyutluArray[i].length ; j++) {
				if(ikiBoyutluArray[i][j] % 2 != 0) {
					
					array[sayac] = ikiBoyutluArray[i][j];
					sayac++;
					
				}
			}
		}
		for(int i =0 ; i <array.length ; i++ ) {
			System.out.print(array[i] + " - ");
		}
	}
	
}
