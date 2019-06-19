package com.hokumus.fakt;

public class Recursion {

	public double fakt(int sayi) {
		if (sayi < 0)
			return -1;
		if (sayi <= 1)
			return 1;
		return sayi * fakt(sayi - 1);

	}

}
