package com.hokumus.esit;

public class Runner {
	public static void main(String[] args) {
		String a="H�seyin";
		if(a.equals("H�seyin"))
			System.out.println("E�it 1");
		else
			System.out.println("E�it De�il 1");
		if(a =="H�seyin")
			System.out.println("E�it 2");
		else
			System.out.println("E�it De�il 2");
		if(a ==new String("H�seyin"))
			System.out.println("E�it 3");
		else
			System.out.println("E�it De�il 3");
	}

}
