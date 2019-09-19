package com.dev21.chapter1.string.exercise4;

public class Ejercicio4Test {

	public static void main(String[] args) {
		String s = "stack" , t = "queue" , u = "Stack";
		
		System.out.println(s.compareTo(t)); // 
		System.out.println(s.compareTo(u));
		System.out.println(t.compareToIgnoreCase(u));
		System.out.println(s.compareToIgnoreCase(u));

	}

}
