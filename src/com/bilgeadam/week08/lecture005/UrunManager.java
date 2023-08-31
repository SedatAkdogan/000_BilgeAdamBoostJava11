package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UrunManager {
	
	List<Urun> urunler = new ArrayList<Urun>();
	

	
	static Scanner scanner = new Scanner(System.in);
	
	public Urun urunOlustur() {
		System.out.print("Urun adini giriniz : ");
		String urunAdi = scanner.nextLine();
		
		System.out.print("Urun fiyatini giriniz : ");
		double fiyat = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Urun son kullanma tarihini giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());
		
		if(urunAdi.isBlank() || fiyat<=0) {
			return null;
		} else {
			return new Urun(urunAdi, fiyat, skt);
		}
	}
	
	public Optional<Urun> urunOlustur2(){
		
		System.out.print("Urun adini giriniz : ");
		String urunAdi = scanner.nextLine();
		
		System.out.print("Urun fiyatini giriniz : ");
		double fiyat = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Urun son kullanma tarihini giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());
		
		if(urunAdi.isBlank() || fiyat<=0) {
			return Optional.empty();

	} else {
		return Optional.of(new Urun(urunAdi, fiyat, skt));
	}

}
	public void urunEkle(Optional<Urun> urun) {
		
		if(urun.isPresent()) {
			urunler.add(urun.get());
		}
		
	}
	
	public void sonKullanmaTarihiGecmisUrunleriListele(List<Urun> urunler) {
		urunler.stream().filter((x) -> x.getSkt()<2023).forEach(System.out::println);
		
	}
	
	public void zamYap(List<Urun> urunler) {
	//	urunler.stream().filter((x) -> x.getSkt() >2023).map((y) ->{ y.setFiyat(y.getFiyat() *2)}); hatali
		
		urunler.stream()
		.filter((x) -> x.getSkt()>2023)
		.map((y) -> {
			y.setFiyat(y.getFiyat()*2);
			return y.getFiyat();
		}).forEach(System.out::println);
		
		
	}
	
	public void fiyatOrtalamasi(List<Urun> urunler) {
		double ort = urunler.stream().collect(Collectors.averagingDouble(Urun::getFiyat)) ; // 1.yontem
		System.out.println("Urunlerin fiyat ortalamasi.. : " + ort);
		
	//	double ort2= urunler.stream().mapToDouble(Urun :: getFiyat).average().orElse(0.0);
		 urunler.stream().mapToDouble(Urun :: getFiyat).average().ifPresent(System.out::println);
		
	}
	
	
	
}
