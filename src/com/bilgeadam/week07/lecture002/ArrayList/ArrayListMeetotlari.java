package com.bilgeadam.week07.lecture002.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMeetotlari {

	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<String>();
	//	ArrayList<String> sehirler2 = new ArrayList<String>();
		
		// listeye eleman ekleme
		sehirler.add("Ankara");
		sehirler.add("Adana");
		sehirler.add("Antalya");
		sehirler.add("Izmir");
		sehirler.add("Canakkale");
		sehirler.add("Balıkesir");
		sehirler.add("Hatay");
		sehirler.add("Eskisehir");
		sehirler.add("Ankara");
		
		// listeyi gezme
		for(String sehir: sehirler) {
			System.out.println(sehir);
		}
		System.out.println();
		
		// listeden eleman cikarma
		// sehirler.remove(0); indexe gore eleman cıkarma
		sehirler.remove("Adana"); // nesneye gore cıkarma list String oldugundan icine yazabiliyosun.
		for(String sehir: sehirler) {
			System.out.println(sehir);
		}
		System.out.println();
		
		// Listenin belirli bir indexine eleman ekleme
		sehirler.add(5, "Adana");
		for(String sehir: sehirler) {
			System.out.println(sehir);
		}
		System.out.println();
		
		// bütün listeyi temizleme
		// sehirler.clear();
		
		// listenin elemanlarına erisim.
		sehirler.get(3);

		System.out.println("Sectiginiz sehir : " + sehirler.get(3));
		System.out.println();
		
		// bir elemanı degistirme,setleme
		sehirler.set(6, "Iskenderun");
		for(String sehir: sehirler) {
			System.out.println(sehir);
		}
		System.out.println();
		
		// listenin boyutuna erisme
		System.out.println(sehirler.size());
		System.out.println();
		
		// liste icinde kontrol ve arama yapma
		
		sehirler.contains("Ankara");
		System.out.println(sehirler.contains("Ankara"));
		System.out.println();
		sehirler.indexOf("Adana");
		System.out.println(sehirler.indexOf("Adana"));// eger girilen eleman listede yoksa -1 döner.
		System.out.println();
		System.out.println(sehirler.indexOf("Ankara"));
		System.out.println(sehirler.lastIndexOf("Ankara")); // Ankarayı 2 kez ekledik last index ankaranın bulundugu son indexi getirdi.
		System.out.println();
		
		// SubList
		sehirler.subList(3, 7);
		System.out.println(sehirler.subList(3, 7)); // 3 dahil 7 dahil degil [3,7)
		System.out.println();
		
		// Donusturmeler
		
		String [] arraySehirler = sehirler.toArray(new String[sehirler.size()]);
		List<String>sehirler2 = new ArrayList<String>();
		sehirler2.add("Trabzon");
		sehirler2.add("Rize");
		sehirler2.add("Artvin");
		
		sehirler.addAll(sehirler2); // Bir listeye baska bir liste ekleme.
		System.out.println();
		for(String sehir: sehirler) {
			System.out.println(sehir);
		}
		
		
		

	}

}
