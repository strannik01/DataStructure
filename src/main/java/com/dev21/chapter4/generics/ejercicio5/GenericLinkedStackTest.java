package com.dev21.chapter4.generics.ejercicio5;

public class GenericLinkedStackTest {

	public static void main(String[] args) {
		Stack<String> stack = new GenericLinkedStack<>();
		stack.push("Juan");
		stack.push("Pablo");
		stack.push("Cánepa");
		stack.push("Alvarez");
		
		Stack<Integer> stack2 = new GenericLinkedStack<>();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.push(40);

	}

}
