package com.hokumus.aritmeop;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi Giriniz... !!!");
		int a= scan.nextInt();
		int b= a++;
		int c= b--;
		System.out.println((a--)+(++b)-(c--));
		System.out.println((--b)-(++c));
		System.out.println(a+b+c);
		c = a++-b--;
		b= c+(++a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scan.close();
		System.out.println();
		
	}

}
