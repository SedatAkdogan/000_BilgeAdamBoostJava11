package com.bilgeadam.week09.lecture001;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 
 * 1-Not ortalamasi hesaplayan stream yapisini kuralim.
 * Her ogrenci icin ayri hesaplayip ortalama notlar isimli bir double listede saklayabiliriz.
 * 
 * 2- Ogrencileri bolumlerine gore mapleyen bir metot yazalim.Ciktisina da metot icinde alalim.
 * 
 * 3-ogrenci ve not ortalamasini mapleyen bir metot yaz.
 * 4- Not ortalamasi 50'nin altinda olanlar => "kaldi" , 70 in altinda olanlar "Kosullu gecti"
 * 70 in ustunde olanlar "Gecti", 95 veya ustu olanlar " Basariyla Gecti" olmak uzere ogrenci durum guncellemesi yapalim.
 * 
 * 
 */

public class StudentManager {

	List<Student> ogrenciler;

	public StudentManager() {
		baslangicVerisiOlustur();
		
	}
	public void durumuGuncelle() {
		ogrenciler.stream().filter((ogrenci) -> {  // 1.yol bu!!!!
			if(ogrenci.notOrtHesapla() <50) {
				ogrenci.setDurum("Kaldi");
				
			} else if(ogrenci.notOrtHesapla() <70 ) {
				ogrenci.setDurum("Kosullu Gecti");
				
			} else if (ogrenci.notOrtHesapla()>=70 && ogrenci.notOrtHesapla()<95) {
				ogrenci.setDurum("Gecti");
			} else {
				ogrenci.setDurum("Basariyla Gecti");
			}
			return true; // filtrelemede kosul atlına return false yazarsan ekranda cıkmayacak !!!!!!!!!!!!
		}).forEach(System.out::println);
	}
	
	public  void bolumeGoreOgrenciGrupla() {
	//	= ogrenciler.stream().collect(Collectors.groupingBy(Student::getBolum)); diger yazim ayni sey.
		Map<String, List<Student>> mapBolum ;
		mapBolum = ogrenciler.stream().collect(Collectors.groupingBy((s) -> s.getBolum())); // daha dinamik bir yapi ama su anlık aynı isi yapiyo
		
		// grouping by map döner!!!  key -value olarak bir list olan maplerde grouping by kullanılması mantıklı 
		// Map<String, List<Student>> mapBolum aynı burdaki gibi
		
//		mapBolum.forEach((k,v) -> {    normal yazim
//			System.out.println(k + " = " +v);
//		});
	// 	mapBolum.entrySet().forEach(System.out::println); bu sekildede yazilabilir.
		
		mapBolum.forEach((k,v) -> {   // ogrencileri alt alta yazdiran
			System.out.println(k);
			v.forEach(System.out::println);
		});
		
	}
	
	public void ogrenciVeNotOrtMaple() {
		Map<Student, Double> map;
		map = ogrenciler.stream().collect(Collectors.toMap((ogrenci)-> ogrenci, Student :: notOrtHesapla));
		
		map.entrySet().forEach(System.out::println);
		
	}
	

	public void baslangicVerisiOlustur() {

//		ogrenciler = List.of(
//				new Student(1, "Alperen", "MF"),
//				new Student(2,"Mahmut","TM"),
//				new Student(3,"Fatma","MF"));

		ogrenciler = new ArrayList<Student>();
		Student student = new Student(1, "Alperen", "MF");
		student.getNotlar().add(90.0);
		student.getNotlar().add(95D);
		student.getNotlar().add(100.0);

		Student student2 = new Student(2, "Mahmut", "TM");
		student2.getNotlar().add(50.0);
		student2.getNotlar().add(65.0);
		student2.getNotlar().add(90.0);

		Student student3 = new Student(3, "Fatma", "MF");
		student3.getNotlar().add(75.0);
		student3.getNotlar().add(50.0);
		student3.getNotlar().add(83.0);

		Student student4 = new Student(4, "Ali", "MF");
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(100.0);

		Student student5 = new Student(5, "Ayse", "TM");
		student5.getNotlar().add(45.0);
		student5.getNotlar().add(40.0);
		student5.getNotlar().add(40.0);

		Student student6 = new Student(6, "Alican", "TM");
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(100.0);

		// Ogrencileri ogrenci listesine ekleme yontem 1;
//		ogrenciler.add(student);
//		ogrenciler.add(student2);
//		ogrenciler.add(student3);
//		ogrenciler.add(student4);
//		ogrenciler.add(student5);
//		ogrenciler.add(student6);

		// Ogrencileri ogrenci listesine ekleme yontem 2;
		ogrenciler = List.of(student, student2, student3, student4, student5, student6);
	}

	public void ortalamaHesaplama() {
		List<Double> notlar = new ArrayList<Double>();

		// Map cozumu
		notlar = ogrenciler.stream()
				.map((ogrenci) -> ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(Double::doubleValue)))
		// Double::doubleValue dedigimiz sey; veri double olarak geliyor::double olarak
		// kullanmaya devam et.
				.collect(Collectors.toList());
//
		notlar.forEach(System.out::println);

		// Foreach cozumu
//		ogrenciler.stream().forEach((ogrenci) -> {
//			System.out.println(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		}
//
//		);	
//		ogrenciler.stream().forEach((ogrenci) -> {
//			notlar.add(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		});
//
//		notlar.forEach(System.out::println);

		// 3. Yontem
//		ogrenciler.stream().forEach((ogrenci) -> System.out.println(ogrenci.notOrtHesapla()));
//		notlar = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla()).collect(Collectors.toList());
//		notlar.forEach(System.out::println);

		// TODO gelistirme asamasi bittiginde kod optimize edilecek. yerine; Double ort2
		// = ogrenciler.stream().map((ogrenci) ->
		// ogrenci.notOrtHesapla()).collect(Collectors.averagingDouble(Double::doubleValue));

		
		Double ort = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla()).collect(Collectors.toList()).stream()
				.mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println("Sayilarin ortalamasi : " +ort);

		Double ort2 = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla())
				.collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.println(ort2);

		Double ort3 = ogrenciler.stream().collect(Collectors.averagingDouble(
				(z) -> z.getNotlar().stream().collect(Collectors.averagingDouble(Double::doubleValue))));
		System.out.println(ort3);
		
//	List<String> bolumler=	ogrenciler.stream().map((ogrenci) ->ogrenci.getBolum()).collect(Collectors.toList());
//	bolumler.forEach(System.out::println);
		
		
		
		
		
		
		
	}


}
