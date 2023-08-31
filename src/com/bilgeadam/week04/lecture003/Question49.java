package com.bilgeadam.week04.lecture003;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir tek sayi giriniz");
		int sayi = scanner.nextInt();
		System.out.print("Lutfen satir sayisi giriniz");
		int satir = scanner.nextInt();
		System.out.print("Lutfen sütun sayisi giriniz");
		int sutun = scanner.nextInt();
		
		printArray(sayi, satir, sutun);
		
		

	}
	
	public static void printArray (int max , int satir , int sutun ) {
		
		int min =1;
		int orta = (max + min)/2;
		
		int[][] array = new int [satir][sutun];
		
		for(int i =0 ; i< array.length ; i++) { 
			
			for(int j = 0 ; j< array[i].length; j++) { // i. indexin lenghti simetrik olmayan durumlar için gereklidir 
				if(i == j) { 
					array[i][j] = orta;
				} else if(i<j) {
					array[i][j] = max;

				} else {
					array[i][j] = min;
				}
				System.out.print(array[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		// 1,0 >> 2,0 - 2,1 >> 3,0 - 3,1 -3,2 -->> buralarda i j den daha büyük
		// 0,1 - 0,2- 0,3 >> 1,2 - 1,3 >> 2,3 -->> buralarda da i j den küçük
		
		
		
		
		
		
		
		
		
	}

}
