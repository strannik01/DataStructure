package com.dev21.chapter3.example;

public class IntStackTest {

	public static void main(String[] args) {
		IntStack s = new IntArrayStack();
		for (int i = 0; i < 6; i++) {
			s.push(i);
		}
		
		int data = s.peek();
		System.out.println(data);
		
		
		s = new IntLinkedStack();
		
		IntStack t = new IntLinkedStack();
		
		t.push(100);
		t.push(300);
		t.pop();
		
	}

}
