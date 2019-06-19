package com.hokumus.diziler;

public class Runner {
	
	public static void main(String[] args) {
		int [] dizi = new int[10];
		String [] isimler = {"hüseyin","semih","selin","utku","yunus"};
		//isimler[0]="deneme";
		//System.out.println(isimler[0]);
		
		for (String isim : isimler) {
			System.out.println(isim);
			
		}
		System.out.println("-------------------------------------");
		int uz = isimler.length;
		for (int i = 0; i < isimler.length/2; i++) {
			String temp = isimler[i];
			isimler[i]=isimler[uz-i-1];
			isimler[uz-i-1] = temp;
			
		}
		for (String isim : isimler) {
			System.out.println(isim);
			
		}
		

	}

}
