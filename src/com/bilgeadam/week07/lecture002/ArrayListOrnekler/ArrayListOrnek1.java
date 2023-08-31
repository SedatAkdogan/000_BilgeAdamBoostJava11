package com.bilgeadam.week07.lecture002.ArrayListOrnekler;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek1 {

	public static void main(String[] args) {
		/*
		 * String bir arrayList
		 * Ankara
		 * Antalya
		 * Bolu
		 * Artvin
		 * Ankara
		 * Antalya
		 * Erzurum
		 * Karaman
		 * Ankara
		 * 
		 * "an" ile baslayan listeleri listeden cıkaralim.
		 * 
		 */
		
		List<String>sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bolu");
		sehirler.add("Artvin");
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Erzurum");
		sehirler.add("Karaman");
		sehirler.add("Ankara");
		
		/*
		 * Bu çözüm index kaydırması yaptıgı icin i-- kullanıyoruz.
		 */
		
		  for (int i = 0; i < sehirler.size(); i++) {
	          
	            if (sehirler.get(i).toLowerCase().startsWith("an")) {
	                sehirler.remove(i);
	                i--; // Bir öğe çıkarıldığı için indis düşürülmeli
	            }
	        }

//	        for (String sehir : sehirler) {         bu yazdıklarımın 3 ü de sehir isimlerini yazdırır.
//	            System.out.println(sehir);
//	        }
	      //  sehirler.forEach(System.out::println);
	        sehirler.forEach(sehir->{
	        	System.out.println(sehir);
	        });
	        
	        
		

		 System.out.println("----------2.COZUM------------");
		
		 for (int i = sehirler.size() - 1; i >= 0; i--) {
	            if (sehirler.get(i).toLowerCase().startsWith("an")) {
	                sehirler.remove(i);
	            }
	        }
		 

	        for (String sehir : sehirler) {
	            System.out.println(sehir);
	        }
	        
	      
	       

	}

}
