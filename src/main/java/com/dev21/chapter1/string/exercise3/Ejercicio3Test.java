package com.dev21.chapter1.string.exercise3;

public class Ejercicio3Test {

	public static void main(String[] args) {
		String s = "stack" , t = "queue" , u = "Stack";
		
		System.out.println(s.equals(t)); // false
		System.out.println(s.equals(u)); // false
		System.out.println(!t.equalsIgnoreCase(u)); // true
		System.out.println(s.equalsIgnoreCase(u)); // true
	}

}
