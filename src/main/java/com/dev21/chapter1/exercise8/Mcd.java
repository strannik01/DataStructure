package com.dev21.chapter1.exercise8;

public class Mcd {
	
	public static int mcd(int m, int n) {
		
		while (n > 0) {
			int r = m % n;
			m = n;
			n = r;
		}

		return m;
	}

	public static void main(String[] args) {
		
		int result = mcd(130, 400);
		System.out.println(result);

	}

}
