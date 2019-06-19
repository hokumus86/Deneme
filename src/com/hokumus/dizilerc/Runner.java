package com.hokumus.dizilerc;

public class Runner {

	public static void main(String[] args) {
		int sayi =3;
		
		
		String [][] isimler = new String [sayi][];
		isimler[0]= new String[7];
		isimler[0][0]="hüseyin";
		isimler[1]= new String[5];
		isimler[1][4]="okumus";
		isimler[4] = new String[4];
		isimler[4][0]="semih";
		isimler[2] = new String[7];
		isimler[2][3]="selin";
		isimler[2][6]="yunus";
		isimler[3] = new String[7];
		System.out.println(isimler[0][0]);
		System.out.println(isimler[0]);
		System.out.println(isimler[1][0]);
		System.out.println(isimler[1][4]);
		System.out.println(isimler[2][3]);
		
		for (String[] isim : isimler) {
			for (String deger : isim) {
				System.out.println(deger);
			}
			
			
		}
		
		
	}
}
