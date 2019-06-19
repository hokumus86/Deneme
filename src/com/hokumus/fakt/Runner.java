package com.hokumus.fakt;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayi giriniz");
		int sayi = scan.nextInt();
		Recursion r = new Recursion();
		System.out.println(sayi + " sayisinin faktoriyeli :" + r.fakt(sayi));
		double sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;
		}
		int deger = 1;
//		while (deger<=fakt) {
//			sonuc = sonuc*deger;
//			deger++;
//		}
//		do {
//			sonuc = sonuc*deger;
//			deger++;
//		} while (deger<=fakt);
		// System.out.println(fakt +" sayýsýnýn faktoriyel sonucu: "+sonuc);

	}

}
