package com.hokumus.pramit;

public class Bitkiler {
	int a = 8;
	public static void main(String[] args) {
		int uzunluk = 6;
		for(int i =0;i<uzunluk;i=i+2) {
			for(int k=0; k<i-1;k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <=uzunluk-i+1; j++) {
				System.out.print("*");
			}
			for(int k=0; k<i-1;k++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
