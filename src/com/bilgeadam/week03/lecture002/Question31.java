package com.bilgeadam.week03.lecture002;

public class Question31 {

	public static void main(String[] args) {
		/*
		 * Arraylerin boyutu sabit
		 * outOfBouds array boyutunun dısına cıkmıssın demek
		 * NullPointerException
		 */
		
		String[] stringArray = new String[4];
		System.out.println(stringArray.length + stringArray[0]);
		String[] stringArray2 = {"Kelime" , "Kelime2" } ;
		System.out.println(stringArray2.length);
		// String stringArray3[] = new String[3];
		boolean[] booleanArray = new boolean[3]; // true,false,false ---- 1<10
		booleanArray[booleanArray.length-1] = 1>10;
		System.out.println(booleanArray[booleanArray.length-1]);
		boolean[] booleanArray2 = {'a' == 'a' ,true,false};
		System.out.println(booleanArray2[0]);
		System.out.println(booleanArray2.length);
		// System.out.println(booleanArray2[3]);// java.lang.arrayoutofbounds
		
		int[] intArray = new int[3] ;
		intArray[1] =3;
		System.out.println(intArray[0]); // atamazsan 0 döner
		intArray[0] = 0 ; // burdaki 0 ile bir satır onceki 0 aynı degil
		System.out.println(intArray[0]);
		
		Integer[] integerWrapperArray = new Integer[2];
		// wrapper classlar ile primitive türler arasındaki iliski ve farklar arastır
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
