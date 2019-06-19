package com.hokumus.ifcond;

public class Runner {
	
	public static void main(String[] args) {
		int a=3;
		
		if(a==1)
			System.out.println("1 geldi");
		else if(a==2)
			System.out.println("2 geldi");
		else if(a==3)
			System.out.println("3 geldi");
		else if(a==4)
			System.out.println("4 geldi");
		else
			System.out.println("hiçbiri gelmedi");
		boolean islem =true;
		boolean durum =true;
		if(islem) {
			if(durum) {
				System.out.println("geldi buraya!!!!");
			}else {
				System.out.println("else geldi!!");
			}
		}
	}

}
