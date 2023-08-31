package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {

	/*
	 * 
	 * Disaridan bir String deger alacagiz.
	 * 
	 * Bu String degerdeki her bir harfi kontrol edecegiz. Tekrar edenleri bir sete,
	 * tekrar etmeyenleri ise baska bir sete atacagiz.
	 * 
	 * Sonra bu iki seti de yazdiracagiz.
	 * 
	 * araba
	 * 
	 * tekrar edenler; a Tekrar etmeyenler; r b
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir String deger giriniz: ");
		String kelime = scanner.nextLine();
		scanner.close();
		
		Set<Character> tekrarEdenKarakterler = new HashSet<>();
        Set<Character> tekrarEtmeyenKarakterler = new HashSet<>();
        
//        for(char c : kelime.toCharArray()) {
//        	if(!tekrarEtmeyenKarakterler.contains(c)) {
//        		if(tekrarEdenKarakterler.contains(c)) {
//        			tekrarEdenKarakterler.remove(c);
//        			tekrarEtmeyenKarakterler.add(c);
//        		} else {
//        			tekrarEdenKarakterler.add(c);
//        		}
//        	}
//        }
        
        
    	// araba
		// a harfi alindi tekrarEtmeyenlere gitti.
		// raba
		// r harfi alindi tekrarEtmeyenlere gitti.
		// aba
		// a harfi tekrarEtmeyenlerden cikarildi, tekrarEdenlere eklendi.
		// ba
		// b harfi alindi tekrarEtmeyenlere gitti.
		// a

        
        for(int i =0; i<kelime.length();i++) {
        	char c = kelime.charAt(i);
        	if(!tekrarEdenKarakterler.contains(c) && !tekrarEtmeyenKarakterler.add(c)) {
        		tekrarEtmeyenKarakterler.remove(c);
        		tekrarEdenKarakterler.add(c);
        	}
        }
        
        System.out.println("Tekrar eden harfler listesi...: ");
        for (char c : tekrarEdenKarakterler) {
            System.out.println(c);
        }
        System.out.println("Tekrar etmeyen harfler listesi...: ");
        for (char c : tekrarEtmeyenKarakterler) {
            System.out.println(c);
        }

	}

}
