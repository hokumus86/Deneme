package com.hokumus.toplam;

public class Islem {
	public static void main(String[] args) {
		int gelenSonuc = toplama(5, 8);
		System.out.println("gelen toplam deðeri : " + gelenSonuc);
		gelenSonuc = cikarma(13, 5);
		System.out.println("gelen çýkarma sonucu : ");
	}

	public static int toplama(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	public static int cikarma(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
}
