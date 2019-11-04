package com.dev21.chapter3.stacks.array.example1;

import java.util.Stack;

public class IntStackTest {

	public static void main(String[] args) {
		IntStack s = new IntArrayStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		
		IntStack operands = new IntArrayStack();
		operands.push(17);
		operands.push(0);
		operands.push(-12);
		operands.push(101);
		
		Stack<String> pila = new Stack<>();
		pila.push("5");
		pila.push("7");
		pila.push("10");
		
		pila.pop();
		System.out.println(pila.peek());
	}

}
