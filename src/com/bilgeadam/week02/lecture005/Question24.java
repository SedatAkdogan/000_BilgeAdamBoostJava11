package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 dan 100 e kadar 5 adet sayı alınacak
		 * Bu 5 adet sayıdan en büyük ve en kücük olanları yazdıran
		 */
		Scanner scanner = new Scanner(System.in);
		
		 int i = 1;
		 int num;
		 int max = Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		 
		 while(i<=5){
			 System.out.println("Lutfen bir sayi giriniz");
			 num =scanner.nextInt();
			 if(num >=0 && num<=100) {
				 if(num>max) {
					 max=num;
					 
				 }
				 if(num<min) {
					 min=num;
					 
				 }
				 i++;
				 
				 
			 }else {
				 System.err.println("Lutfen gecerli bir sayi giriniz");
			 }
		 }
		 System.out.println("Max = " + max);
		 System.out.println("Min = " + min);
		
		
		
		
		
		
		
		
		

	}

}
