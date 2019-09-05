package com.dev21.chapter1.exercise1;

public class Incrementer {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
//		x = ++y;
//		System.out.println(x);
		
//		x = --y;
//		System.out.println(x);
		
//		x = y++;
//		System.out.println(x);
		
		// Incremento de variable y se da luego de asignación del valor de y hacia x
		x = y--;
		System.out.println(x);
	}

}
