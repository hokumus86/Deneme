package com.hokumus.dizilertree;

public class Runner {

	public static void main(String[] args) {
		String [][][]  isimler = new String [5][][];
		isimler[0] = new String[5][2];
		isimler[0][0][0] = "hüseyin";
		isimler[0][0][1] = "okumus";
		isimler[1]= new String [3][4];
		isimler[1][2][0]="okumus";
		System.out.println(isimler[0]);
		System.out.println(isimler[0][0]);
		System.out.println(isimler[0][0][0]);
		System.out.println(isimler[1][1]);
		System.out.println(isimler[1][2][0]);
		

	}

}
