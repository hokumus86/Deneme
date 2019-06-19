package com.hokumus.fibo;

public class Fibonacci {

	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1)) // base cases
			return number;
		else
		{
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
			
			
	}

	public static void main(String[] args) {

		System.out.println("Fibonacci of is:" + fibonacci(5));

	}
}
