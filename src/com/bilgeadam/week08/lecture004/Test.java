package com.bilgeadam.week08.lecture004;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	
	public static void main(String[] args) {
		
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
	//	sansliNumaralar.sayilarMap.forEach((k,v) -> System.out.println(k + " sayisi " + v + " kadar tekrar ediyor"));
		sansliNumaralar.listeOlustur();
		
		
		sansliNumaralar.sayilarMap.forEach((k,v) -> System.out.println(k + " = " + v )); //1.soru
		sansliNumaralar.sayilarList.forEach(System.out::println); // 2.soru
		
		
		
		// sansliNumaralar.setSansliNumaralar.forEach(System.out::println);
		
		sansliNumaralar.sansliNumaralariBul(); // 3.soru
		int i =0;
		for(Integer sansliNumara : sansliNumaralar.setSansliNumaralar) {
			System.out.println(i+1 +". Sansli numaramiz : " + sansliNumara);
			i++;
		}
		
		System.out.println("50' den büyük olan sansli numaralar : "); // stream ile
		sansliNumaralar.setSansliNumaralar.stream().filter(number -> number>50).forEach(System.out::println);
		System.out.println("50' den buyuk olan sayilari yeni bir listeye yazalim.");
		List<Integer> list = sansliNumaralar.setSansliNumaralar.stream().filter((number) -> number>50).collect(Collectors.toList());
		System.out.println(list);
		
		
		System.out.println("Sansli numaralarin toplami : ");// stream ile
		
	   System.out.println(sansliNumaralar.setSansliNumaralar.stream().reduce((x,y) -> x+y)); // cıktı optional cıkıyor dikkat
		
	  Optional<Integer> toplam = sansliNumaralar.setSansliNumaralar.stream().reduce((x,y) -> x+y);
	  
	  System.out.println("50 den buyuk sayilarin toplamini bir toplam2 degiskenine esitleyip yazdiralim.");
	  
	  Optional<Integer> toplam2 = sansliNumaralar.setSansliNumaralar.stream().filter((x) -> x>50)
			  .reduce((x,y) ->x+y);

	//   toplam2.ifPresent(System.out::println);
	  System.out.println(toplam2); // toplam2().get yazarsak optionaldan cıkar normal bi int degere esitleyebilirsin.
	  sansliNumaralar.setSansliNumaralar.stream().filter((x) -> x>50)
	  .reduce((x,y) ->x+y).ifPresent(System.out::println);
	  
	  
	  
	  
	  // OPTIONAL METOTLARI
	  
	  Integer toplam3 = toplam2.get();
	  Optional<String> kelime = Optional.empty();
	 // String kelime2 = kelime.get(); // NoSuchElementException
	  Optional<String> kelime3 = kelime;
	  System.out.println(kelime3);
	  System.out.println(toplam3);
	  
	  Optional<String> kelime4 = Optional.ofNullable(null); // bu metot icine bir deger girersen onu verir girmezsen optional.empty verir.
	  System.out.println("Kelime 4: " +kelime4); // cok kullanilir
	  
	  Optional<String> kelime5 = Optional.of("Merhaba Dunya");
	  System.out.println(kelime5.get());
	  
	  
	  System.out.println(kelime4.isEmpty()); // isEmpty  isPresent
	  System.out.println(kelime4.isPresent()); // cok kullanilir
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}
	
	

}
