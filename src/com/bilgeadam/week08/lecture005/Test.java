package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		UrunManager urunManager = new UrunManager();
		List<Optional<Urun>> yeniUrunler = new ArrayList<>();
//		Urun urun = urunManager.urunOlustur();
//		System.out.println(urun);
		
//		Optional<Urun> urun2 = urunManager.urunOlustur2();
//		System.out.println(urun2);

		
		for(int i =0;i<3;i++) {
			urunManager.urunEkle(urunManager.urunOlustur2());
		//	yeniUrunler.add(urunManager.urunOlustur2());
		}
		
		for(Urun urun : urunManager.urunler) {
			System.out.println(urun);
		}
		
//		for(Optional<Urun> urun :yeniUrunler) {
//			System.out.println(urun);
//		}
		System.out.println("------------------------------");
		
		// Eger urun var ise urunn fiyatini 2 katina cikaralim.
		
//		for(Optional<Urun> urun :yeniUrunler) {
//			urun.map((x) ->{
//				x.setFiyat(x.getFiyat()*2);       // fiyati setledim bidaha yazdiralim // ifpresent koydugum icin var olanı yazdırdı
//				return x;							// optionalempty yazmadı
//			}).ifPresent(System.out::println);;
//		}
		
		
		urunManager.sonKullanmaTarihiGecmisUrunleriListele(urunManager.urunler);
		System.out.println("-------------------------------------------------------");
		
		urunManager.zamYap(urunManager.urunler);
		
		urunManager.fiyatOrtalamasi(urunManager.urunler);
		
		
	}

}
