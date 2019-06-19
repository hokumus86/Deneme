package com.hokumus.fibo;

public class TekSayiToplam {

	public static int hesapla(int sayi) {
		if (sayi <= 0)
			return 0;
		return sayi + hesapla(sayi - 2);

	}
	
	
	public static void main(String[] args) {
		System.out.println(hesapla(3));
	}

}
