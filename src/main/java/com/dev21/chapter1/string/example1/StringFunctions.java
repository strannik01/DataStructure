package com.dev21.chapter1.string.example1;

public class StringFunctions {
	
	public static int count(String s, String target) {
		int count = 0;
		int n = target.length();
		for (int i = 0; i < s.length() - n; i++) {
			String piece = s.substring(i, i + n);
			if (piece.equals(target)) 
				count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Number of this's: " + count("this and that and this", "this"));
	}

}
