package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		/*
		 * Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		 *   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		 *   eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		 * 
		 * 
		 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		 * içerisinde o harf varsa değiştirsin
		 * 
		 *
		 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		 * olmadığını bulunuz(kek,iki,kabak)
		 * 
		 * 
		 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde)  a lar için bir sayfaya b ler  bir sayfaya  cler bir
		 * sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
		 * sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
		 * sayfa oluğunu ekrana yazdıralım
		 * * 0- cıkıs
		 */
		
		
		boolean kontrol = true;
		int secim;
		Scanner scanner = new Scanner(System.in);
		
		while(kontrol) {
			
			
			
			System.out.println("\n----String İslemleri------");
			System.out.println("1 - Harf Saydırma");
			System.out.println("2 - Harf Degistirme");
			System.out.println("3 - Polindrom Kontrolü");
			System.out.println("4 - Sayfa acma");
			System.out.println("0 - Cıkıs");
			System.out.println("Lutfen bir secenek giriniz");
			secim = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(secim) {
			case 1 : {
				System.out.println("\nHarf Saydırma");
				System.out.print("\nLutfen bir kelime giriniz : ");
				String kelime = scanner.nextLine();
				System.out.print("Lutfen bir harf giriniz : ");
				String harf =scanner.nextLine();
				int adet = 0;
				if(!kelime.contains(harf)) {
					System.out.println("\nGirdiginiz kelimede aradıgınız harf bulunmamaktadır");
					break;
				}
				for(int i =0 ; i<kelime.length() ; i++) {
					if(kelime.charAt(i) == harf.charAt(0)) {
						adet++;
						System.out.println("Girdiginiz kelimenin" + i +".indexsinde" + harf + "harfi bulunmaktadır");
					}
				}
				System.out.println("Girdiginiz kelimede ;" + harf + "harfi" + adet + "adet bulunmaktadır");
				break;
				
			}
			
			
				
				
				
				
				
				
				
				
			case 2 :{
				System.out.println("\nHarf degistirme");
				System.out.print("\nLutfen bir kelime giriniz : ");
				String kelime = scanner.nextLine();
				kelime =kelime.toLowerCase();
				System.out.print("Lutfen değistirmek istediğiniz harfi giriniz : ");
				char eskiHarf =scanner.next().charAt(0);
				System.out.println("Lutfen yeni harfi giriniz");
				char yeniHarf = scanner.next().charAt(0);
				String yeniKelime= kelime.replace(eskiHarf, yeniHarf);
				System.out.println("Girdiginiz kelimenin eski hali : " + kelime + "\n Girdiginiz kelimenin yeni hali :" + yeniKelime);
				
				
				
				break;
			}
			case 3 :{
				System.out.println("\n Palindrom kontrolü");
				System.out.println("Lutfen bir kelime giriniz");
				String kelime3 = scanner.nextLine();
				String tersKelime ="" ;
				for(int i =kelime3.length()-1 ; i>=0 ; i-- ) {
					tersKelime += kelime3.toLowerCase().charAt(i);
					if(kelime3.toLowerCase().equals(tersKelime)) {
						System.out.println("Girdigizin kelime palindromdur");
					} else {
						System.out.println("Girdiginiz kelime palindrom degildir");
					}


					/*
					 * 
					 * Bu da faarklı bir çözüm incele!!!
					 * int right = kelime.length -1;
					 * int left = 0;
					 * booolean isPalindrome = true
					 * while (left < right) {
					if (kelime.charAt(left) != kelime.charAt(right)) {
						isPalindrome = false;
					}
					left++;
					right--;
				}
				if (isPalindrome) {
					System.out.println("Palindromdur!");
				} else {
					System.out.println("Palindrom değildir!");
				}
					 */
					
					
					
			}
				break;
					
					
				}
				
			case 4 :{
				int a =0,	b=0,	c=0,	d=0,	toplam =0 ;
			System.out.println("\n Sayfa açma");
			System.out.println("Lutfen 5 adet sayı giriniz");
			for(int i = 0 ; i<5 ; i++) {
				System.out.println((i+1) + ". kelimeyi giriniz : ");
				String kelime = scanner.nextLine();
				if(kelime.charAt(0) == 'a') {
					a =1;
				}else if(kelime.charAt(0) =='b') {
					b=1;
				}else if(kelime.charAt(0) =='c') {
					c=1;
				}else {
					d +=1 ;
				}
				toplam = a+b+c+d ;
				System.out.println("Toplam dosya syısı : " + toplam);
				
				
			}
			
				break;
				
			}
			case 0 :{
				System.err.println("Çıkıs");
				kontrol = false;
				break;
				
			}
				
			default: {
				System.err.println("\n Lutfen gecerlibir secenek giriniz");
				
			}
			
			
			}
			
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
