package com.dev21.chapter1.basic.factorial;

public class NumericFunctions {
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			System.out.println(n);
			System.out.println(" ");
			System.out.println(factorial(n));
		}
	}

}
