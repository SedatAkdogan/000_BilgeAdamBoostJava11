package com.bilgeadam.week04.lecture002;

public class Question48 {
	// Dizideki elemanlar arasındaki farkın en kücük oldugu deger nedir?

	public static void main(String[] args) {
		
		int[] array = {1,5,-4,3};
		
		Math.abs(-4); // absolute value --> mutlak deger
		System.out.println(Math.abs(-4));
		 int fark;
		 int min = Integer.MAX_VALUE; 
		 for(int i =0; i< array.length -1; i++) {
			 for(int j =i+1 ; j<array.length;j++) {
				 fark = Math.abs(array[i] - array[j]);
				if(fark<min) {
					min = fark;
				}
				 
			 }
			 
		 }
		 
		 
		 System.out.println(min);
		 

		 
		 
		 
		 
		 
	}
	
	
	
		
	

}
