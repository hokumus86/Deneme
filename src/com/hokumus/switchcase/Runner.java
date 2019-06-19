package com.hokumus.switchcase;

public class Runner {
	public static void main(String[] args) {
		String a= "10";
		switch (a) {
		case "0":
			System.out.println("a 0 geldi");
			break;
		case "1": 
			System.out.println(" a 1 geldi");
			break;

		case "2": 
			System.out.println(" a 2 geldi");
			break;
		default:
			System.out.println("a hiç bir case le eþleþmedi");
			break;
		}
	}

}
