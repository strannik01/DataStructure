package com.dev21.chapter1.exercise2;

public class Looper {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (100 == i)
				System.out.println(i);
			else
				System.out.print(i + ", ");
		}
		System.out.println();
		for (int j = 0; j <= 9; j++) {
			if (9 == j)
				System.out.println(j);
			else
				System.out.print(j + ", ");
		}
		System.out.println();
		for (int m = 0; m <= 100; m = m + 2) {
			if (100 == m)
				System.out.println(m);
			else
				System.out.print(m + ", ");
		}
		System.out.println();
		for (int n = 0; n <= 10; n++) {
			if (10 == n)
				System.out.println((int) Math.pow(2, n));
			else
				System.out.print((int) Math.pow(2, n) + ", ");
		}
	}

}
