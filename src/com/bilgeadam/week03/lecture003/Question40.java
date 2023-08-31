package com.bilgeadam.week03.lecture003;

import java.util.Arrays;

public class Question40 {

	public static void main(String[] args) {
		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı ise
		 * ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise bilgeadam yazdıralım. int start=2; int
		 * end=22; {2,3,4,5,6,7,8,9,10,11,12,13,14,15} ->> {2,"bilge",4,"adam",6,7,8,"bilge",...14,"bilgeadam"}
		 * 
		 * 
		 */
		int start =2;
		int end =22 ;
		
		String[] array = new String[end- start +1];
		 for(int i =0 ; i< array.length ;i++) {
			 
			int sayi = i+ start;
			
			if(sayi % 15 == 0) {
				array[i] = "BilgeAdam";
			}else if (sayi % 5 == 0) {
				array[i] = "Adam";
				
			}else if(sayi % 3 ==0) {
				array[i] = "Bilge";
			} else {
				array[i] = "" + sayi; // sistemin bunun String oldugunu anlaması gerek ondan "" koyduk
				
			}
			 
			 
		 }
		
		for(int i = 0 ; i< array.length ; i++) {
			if(i == array.length -1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + " ,");
			}
			
		}
		
		
		System.out.println("\n****************************************");
		
		
	//	System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
