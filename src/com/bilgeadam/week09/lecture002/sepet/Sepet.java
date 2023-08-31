package com.bilgeadam.week09.lecture002.sepet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sepet {

	/*
	 * 1 - Urun sinifini encapsulated bir sekilde olusturalim.isim,fiyat
	 * 
	 * 2- Sepette EUrunlerden olusan bir array olsun. Urun listemiz olsun.
	 * urunOlustur () isimli bir metodumuz olsun. EUrun arrayimizdeki enumlarin
	 * degerleri ile urun olusturup listemizi dolduralim.
	 * 
	 * 3- Urunler ile fiyatlarini mapleyelim.Urunler listesi ustunden calisalim.. 
	 * 
	 * 4-urunEkle() metodumuz olsun.Sepetime bir urun ekleyecek ,urun hali hazirda
	 * sepette varsa adetini artiricak
	 * 
	 * 5- 2 tane mapim var.urunlerveFiyatlari ,sepet.Sepetimin toplam fiyatini hesaplamak istiyorum.
	 * Bunun icin;
	 * Sepetimden urun adini almam bu urun adına denk gelen fiyat degerini urunlerveFiyatlari mapinde aramam gerekiyor.
	 * Sonra bu fiyat degerini alip,sepetimdeki urun adedi sayisiyla carpip toplama eklemem gerekiyor.Bunu sepetteki
	 * her bir urun icin yaparsam ve toplami her zaman guncelleyerek ilerlersem sepetimin toplam fiyatını bulabilirim.
	 * 
	 * List<Double> fiyatlar;
	 * 
	 */

	EUrun[] enumUrunler = EUrun.values();

	List<Urun> urunler = new ArrayList<Urun>();
	Map<String, Double> urunlerVeFiyatlari = new HashMap<>();
	Map<String, Integer> sepet = new HashMap<String, Integer>(); // KEY : Urun ismi value :urun adedi
	Double toplam =0.0;

	public Sepet() {
		urunOlustur();
		urunFiyatMapOlustur();
	}
	
	public void sepetToplami() {
		List<Double> fiyatlar = new ArrayList<Double>();
		sepet.forEach((isim,adet) -> {
			double fiyat = urunlerVeFiyatlari.get(isim) * adet;  // burada get isim diyince sana value olan fiyatı getiriyor.
			fiyatlar.add(fiyat);
		}); 
		toplam = 0.0;
		for(Double fiyat : fiyatlar) {
			toplam += fiyat;
		}
		System.out.println("Sepet toplam tutari : " + toplam);
	}

	public void urunEkle() {
		String urunIsmi = Utility.stringDegerAlma("Lutfen sepete eklemek istediginiz urunun adini giriniz : ");
		
//		Urun urun = null ;
//		for(Urun u : urunler) {
//			if(u.getIsim().equals(urunIsmi)) {   1.cozum
//				urun =u;
//				break;
//			}
//		}
//		if (urun!=null)
		Optional<Urun> urun = urunler.stream().filter((u) -> u.getIsim().equals(urunIsmi)).findFirst();
	
			if(urun.isPresent())				{
			if (sepet.containsKey(urunIsmi)) {
				sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
			} else {
				sepet.put(urunIsmi, 1);
			}
		} else {
			System.out.println("Urunler listesinde boyle bir urun bulunmamaktadir.!!!!");
		}
	}

	public void sepetiGoster() {
		sepet.forEach((k, v) -> {
			System.out.println(k + " Urunu " + v + " adet.");
			sepetToplami();
		});
	}

	public void menu() {
		int kontrol = 0;
		do {
			System.out.println("----------------------");
			System.out.println("Sepet App");
			System.out.println("----------------------");
			System.out.println("1 - Urunleri Goster");
			System.out.println("2 - Urun Ekle");
			System.out.println("3 - Sepeti Goster");
			System.out.println("0 - Cikis");
			System.out.println("----------------------");
			kontrol = Utility.intDegerAlma("Lutfen bir secim yapiniz : ");

			switch (kontrol) {
			case 1: {
				urunleriListele();
				break;
			}
			case 2: {
				urunEkle();
			}
				break;
			case 3: {
				sepetiGoster();
				break;
			}
			case 0: {
				System.out.println("Uygulamadan cikis yapiliyor....");
				break;
			}
			default:
				System.out.println("Lutfen gecerli bir deger giriniz");
			}

		} while (kontrol != 0);

	}

	private void urunleriListele() {
		urunlerVeFiyatlari.forEach((k, v) -> System.out.println(k + " urununun fiyati : " + v + " TL'dir"));

	}

	public void urunOlustur() {

		for (EUrun eUrun : enumUrunler) {
			urunler.add(new Urun(eUrun.name(), eUrun.getFiyat()));

		}
		// urunler.forEach(System.out::println);

	}

	public void urunFiyatMapOlustur() {
		// urunler.stream().forEach((urun) -> urunlerVeFiyatlari.put(urun.getIsim(),
		// urun.getFiyat()));
		// urunlerVeFiyatlari.entrySet().forEach(System.out::println);

		urunlerVeFiyatlari = urunler.stream().collect(Collectors.toMap((k) -> k.getIsim(), (v) -> v.getFiyat()));
		// urunlerVeFiyatlari.forEach((k,v) -> System.out.println(k + " urununun fiyati
		// : " + v + " TL'dir"));

	}

}