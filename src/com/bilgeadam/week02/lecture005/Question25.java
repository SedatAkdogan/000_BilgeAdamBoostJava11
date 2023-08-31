package com.bilgeadam.week02.lecture005;

public class Question25 {

	public static void main(String[] args) {
		String value = " Merhaba Dünya ";
		String value2 = "Merhaba Dünya";
		String value3 = "Merhaba Dünya";
		
		System.out.println(value.charAt(2));
		System.out.println(value);
		System.out.println(value.trim());// sağındaki ve solundaki boslukları temizler
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));
		System.out.println(value.lastIndexOf("a"));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0, 5));
		System.out.println(value.equals(value2));
		System.out.println(value == " Merhaba Dünya ");
		System.out.println(value.trim() == value2);// == referans degerinebakar int primitive degisken onda true doner fakat stringte dönmez
		System.out.println("********************");
		System.out.println(value.trim().equals(value2));// equals içerdeki degere bakar.
		System.out.println(value2 == value3);
		
		
		
		
		
	}

}
