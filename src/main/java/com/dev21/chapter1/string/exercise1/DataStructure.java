package com.dev21.chapter1.string.exercise1;

public class DataStructure {

	public static void main(String[] args) {
		String s = "data structures";
		System.out.println(s.length()); // resultado: 15
		System.out.println(s.charAt(5)); // resultado: s
		System.out.println(s.indexOf("a")); // resultado: 1
		System.out.println(s.indexOf("m")); // resultado: -1
		System.out.println(s.indexOf("struct")); // resultado: 5
		System.out.println(s.indexOf("t", 3)); // resultado: 6
		System.out.println(s.indexOf("t", 7)); // resultado: 10
		System.out.println(s.indexOf("d", 0)); // resultado: 0
		System.out.println(s.indexOf("d", 1)); // resultado: -1
		System.out.println(s.substring(5)); // resultado: structures
		System.out.println(s.substring(1, 3)); // resultado: at
		System.out.println(s.toUpperCase()); // resultado: DATA STRUCTURES
	}

}
