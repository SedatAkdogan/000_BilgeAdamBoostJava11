package com.bilgeadam.week08.lecture004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	/*
	 * 1 ile 100 arasinda rastgele 10 000 adet sayi üret.
	 * 
	 * 1- sayi olustur metodu ile rastgele olusturdugumuz sayilari bir map'e atacagiz.
	 * Sayinin kac kere tekrar ettigini tutacagiz.key = sayi , value = tekrar sayisi
	 * 
	 * 2-mapde gezinirken listeye ekleme yapicaz.
	 * Her eleman ne kadar tekrar ediyor ise,o kadar listeye eklenecek.
	 * 
	 * 3- En son olusturdugumuz listeden rastgele 10 deger alacagız ve 
	 * bu aldıgımız degerleri bir sete ekleyeceğiz.
	 * Bu isleme gecmeden önce listemizi karistiralim.Collections.shuffle(); sansliNumaralariBul();
	 * 
	 */
	static final int maxSayi =100;
	static final int uretilenSayiMiktari =10000;
	
	Map<Integer, Integer> sayilarMap = new HashMap<Integer, Integer>();
	List<Integer> sayilarList = new ArrayList<Integer>();
	Set<Integer> setSansliNumaralar = new TreeSet<Integer>();
	
	
	private int sayiOlustur() {
		
		return Utility.randomSayiUret(1, maxSayi+1);
	}
	
	public void mapOlustur() {
		for(int i =0; i<uretilenSayiMiktari;i++) {
			int sayi = sayiOlustur();
			if(sayilarMap.containsKey(sayi)) {
				sayilarMap.put(sayi, sayilarMap.get(sayi) +1);
			} else {
				sayilarMap.put(sayi, 1);
			}
		}
	}
	
	public void listeOlustur() {
		for (Entry<Integer, Integer> sayi : sayilarMap.entrySet()) {
			
		// sayi.getvalue tekrar sayisini getiriyor
			// sayi.get key sayiyi getiriyor
			
//			for(int i =0;i<sayi.getValue();i++) {   asagıda foreach stream kullanımı daha kolay olur dedik.
			
//				sayilarList.add(sayi.getKey());
//			}
			
		}
	
		sayilarMap.forEach((k,v)->{
		for(int i =0;i<v;i++) {
			sayilarList.add(k);
		}
			
		});
	
	}
	
	public void sansliNumaralariBul() {
		Collections.shuffle(sayilarList);
		
		// setSansliNumaralar.addAll(sayilarList.subList(0, 10));
		
		while(setSansliNumaralar.size()<10) {
			int index = Utility.randomSayiUret(0, sayilarList.size());
			
			setSansliNumaralar.add(sayilarList.get(index));
			sayilarList.remove(index);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
