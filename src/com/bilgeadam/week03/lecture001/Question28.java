package com.bilgeadam.week03.lecture001;

public class Question28 {

	public static void main(String[] args) {
		
		/*
		 * =Java,React,Spring
		 * bir for döngüsü içinde Java,React,Spring
		 */
		
		String deger = "Java,React,Spring";
		System.out.println("Java");
		System.out.println("React");
		System.out.println("Spring");
		System.out.println(deger.replace(",", "\n"));
		// bu bir çözümdür ama for döngüsü ile çözücez
		System.out.println("******************* diğer cözüm***************");
		int index =0;
		for(int i =0 ; i<deger.length() ; i++) {
			if(deger.charAt(i) == ',') {
				System.out.println(deger.substring(index, i));
				index = i+1;
			}
		}
		System.out.println(deger.substring(index));
		System.out.println("***************** bu bir çözümdür*****************");
		
		for(int i =0 ; i< deger.length(); i++) {
			if(deger.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(deger.charAt(i));
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
