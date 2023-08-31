package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateOrnek {

	public static void main(String[] args) {
		
		Date date;
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1); // YIL-AY-GUN
		LocalDate date2 = LocalDate.of(2023, 12, 10);
		System.out.println(date2);
		
		long gun = date2.until(date1, ChronoUnit.DAYS);  
		System.out.println(gun);
		long hafta = date2.until(date1, ChronoUnit.WEEKS);
		System.out.println(hafta);
		long ay= date2.until(date1, ChronoUnit.MONTHS);
		System.out.println(ay);
		long yil = date2.until(date1, ChronoUnit.YEARS);
		System.out.println(yil);
		
		
		
		
		
//	
//		System.out.println(date2.plusDays(25)); // 25 gun ekledi
//		System.out.println(date2.plusMonths(2)); // 2 ay ekledi
//		System.out.println(date2.plusWeeks(8)); // 8 hafta ekledi ama 2 ayla aynı degil cünkü her ay aynı gun sayısında degil!
//		System.out.println(date2.plusYears(2));  // 2 yıl ekledi
//		System.out.println(date2.minusDays(5)); // 5 gun cikardi
//		System.out.println("Yil : " + date2.getYear());
//		System.out.println("Ay : " + date2.getMonth()); // ayın ismini doner- December
//		System.out.println("Ay : " + date2.getMonthValue()); // ayin numarasını doner -12
//		System.out.println("Gun : " + date2.getDayOfMonth()); // ayın kacıncı gunu oldugunu doner
//		System.out.println("Yılın Kacinci gunu : " + date2.getDayOfYear()); // Yılın kacıncı gunu oldugunu doner.
//		System.out.println("Gunun adi : " + date2.getDayOfWeek()); // Gunun ismini verir
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date1.isAfter(date2));
//		
// //		Scanner scanner = new Scanner(System.in);
////		System.out.print("Lutfen yil giriniz : ");
////		int yil = scanner.nextInt();
////		System.out.print("Lutfen ay giriniz : ");
////		int ay = scanner.nextInt();
////		System.out.print("Lutfen gun giriniz : ");
////		int gun = scanner.nextInt();
////		
////		
////		LocalDate date3 = LocalDate.of(yil, ay, gun);
////		System.out.println(date3);
//		
//		LocalDate date4 = LocalDate.parse("2023-07-10"); // 07 degil 7 yazarsan hata verir.
//		System.out.println(date4);
////		LocalDate date5 = LocalDate.parse(scanner.nextLine());
////		System.out.println(date5);

	}

}
