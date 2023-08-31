package com.bilgeadam.Sınav1;

public class OgrenciOzelListe {

	public String[] ogrenciDizisi;
	public int boyut = 0;

	public void add(String ogrenci) {
		String[] tmp;

		if (ogrenciDizisi == null) {
			ogrenciDizisi = new String[1];
			ogrenciDizisi[0] = ogrenci;

		} else {
			tmp = new String[boyut + 1];
			for (int i = 0; i < boyut; i++) {
				tmp[i] = ogrenciDizisi[i];
			}
			tmp[boyut] = ogrenci;
			ogrenciDizisi = tmp;
		}
		boyut++;

	}

	public void list() {
		System.out.print("[");
		for (int i = 0; i < boyut; i++) {
			System.out.print(ogrenciDizisi[i]);
			if (i != boyut - 1)
				System.out.print(",");
		}
		System.out.println("]");

	}

}
