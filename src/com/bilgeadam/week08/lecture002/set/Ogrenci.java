package com.bilgeadam.week08.lecture002.set;

public class Ogrenci implements Comparable<Ogrenci>{

	int id;
	String name;
	
	public Ogrenci(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", name=" + name + "]";
	}

	
	// sorting algorythms

	@Override
	public int compareTo(Ogrenci o) {    // implements yapınca eklemek zorunlu override ettik.
		if(o.id<this.id) {
			return 1;
		} else if(o.id == this.id) {
			return 0 ;
		} else {				// burda 1 donunce yer  degisiyor - 1 de zaten olması gerektigi yerde elleme gibi düsün.
			return -1;
		}
		
	}
	
	
	
}
