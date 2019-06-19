package com.hokumus.runner;

public class Runner {
	public static void main(String[] args) {

		
		byte b = 0b10010;
		long sayi = 10_000_000_393_900_403L;
		 //b=0xb;
		// b=100;
		System.out.println(b);
		System.out.println(sayi);
		
		float pi = 3.14f;
		int a =(int) pi;
		System.out.println(a);
		double d = 3.1456767676d;		
		int sayi1 = 54;
		int sayi2 = 8;
		float sonuc = (float)(sayi1/sayi2);
		System.out.println(sonuc);
		
		boolean durum= false ;
		if(durum) {
			System.out.println("geldi");
			durum =true;
		}
			
		else
			System.out.println("gelmedi");
	}

}
