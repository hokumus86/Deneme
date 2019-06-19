package com.hokumus.esit;

public class Runner {
	public static void main(String[] args) {
		String a="Hüseyin";
		if(a.equals("Hüseyin"))
			System.out.println("Eþit 1");
		else
			System.out.println("Eþit Deðil 1");
		if(a =="Hüseyin")
			System.out.println("Eþit 2");
		else
			System.out.println("Eþit Deðil 2");
		if(a ==new String("Hüseyin"))
			System.out.println("Eþit 3");
		else
			System.out.println("Eþit Deðil 3");
	}

}
