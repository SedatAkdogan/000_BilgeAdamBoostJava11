package com.bilgeadam.week03.lecture003;

public class Question37 {

	public static void main(String[] args) {
		/*
		 * 
		 * int [] sayilar={1,4,5,6,1,1,4,8};
		 * 
		 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
		 * adetinden büyükse true değilse false
		 * 
		 */
		int [] sayilar={1,4,5,6,1,1,4,8};
		int adet1=0;
		int adet4=0;
		
		for(int i = 0 ; i<sayilar.length ; i++) {
			if(sayilar[i] == 1 ) {
				adet1 ++;
			}else if(sayilar[i] == 4) {
				adet4++;
			}
		} 
		System.out.println("1 sayisinin adedi\t " + adet1 + "\n4 sayisinin adedi\t " + adet4 + "\n" +(adet1 > adet4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
