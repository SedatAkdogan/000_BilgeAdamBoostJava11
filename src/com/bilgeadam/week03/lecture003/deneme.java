package com.bilgeadam.week03.lecture003;

public class deneme {

	public static void main(String[] args) {
		int[] num = {1,13,13,13,5,1};
	//	boolean kontrol = true;
		int toplam = 0 ;
		
		for(int i = 0 ; i< num.length ; i++) {
			if(num[i] == 13 && num[i+1] == 13) {
			//	kontrol = false;
				
			} else if(num[i] == 13 && num[i+1] != 13) {
				toplam += num[i+1];
			//	kontrol = true;
				
				
			}
		} 
		//if(kontrol) {
			System.out.println(toplam);
		
		
		
		
		
		
		
		

	}

}
