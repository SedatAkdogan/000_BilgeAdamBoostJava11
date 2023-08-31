package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.bilgeadam.week07.lecture001.enumornek.Utility;

public class HarfFrekansiBulma {
	
	/*
	 * Utility sinifini kullanarak disaridan String bir deger alalim.
	 * Bu kelimeyi bir map icerisine isleyeceğiz. (Sirali bir sekilde)
	 * 
	 * String kelime = "merhaba";
	 * 
	 * m=1;
	 * e=1;
	 * r=1;
	 * h=1;
	 * a=2;
	 * b=1;
	 * 
	 * Ciktimiz bu sekilde olmali.
	 */

	public static void main(String[] args) {
		
		 
	     String kelime = Utility.stringDegerAlma("Lutfen bir kelime giriniz : ");
	    
	     
	     Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	     
	     for(char c : kelime.toCharArray()) {
	    	 if(map.containsKey(c)) {
	    		 map.replace(c, map.get(c)+ 1);
	    	 } else {
	    		 map.put(c, 1);
	    	 }
	     }
	    

			// Entry =>> Girdi, <Character, Integer> key value pair'i. map.entrySet();
	     
	     System.out.println("Harf Sayısı Analizi:");
	        for (Entry<Character, Integer> karakter : map.entrySet()) {
	            System.out.println(karakter.getKey() + " = " + karakter.getValue());
	        }
	        
	        System.out.println("*******************Lamda ile yaz************************************");
	        
	        map.forEach((k,v) ->{
	        	System.out.println(k + " = " + v);
	        });
	        
	        
	        
	        
		
	}
//	public static Map<Character, Integer> harfAnalizi(String kelime) {
//        Map<Character, Integer> harfSayilari = new LinkedHashMap<Character, Integer>();
//
//        for (char harf : kelime.toCharArray()) {
//            harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
//        }
//
//        return harfSayilari;
//
//}
}
