package com.dev21.chapter4.generics.ejercicio5;

public class StringLinkedStackTest {

	public static void main(String[] args) {
		Stack<String> stack = new StringLinkedStack();
		stack.push("Hello");
		stack.push("World");
		stack.push("Juan Pablo");
		stack.push("Developer");
		
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}

	}

}
