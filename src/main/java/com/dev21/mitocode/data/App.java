package com.dev21.mitocode.data;

import java.util.Stack;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Stack<String> pila = new Stack<>();
		pila.push("1-MitoCode");
		pila.push("2-Mito");
		pila.push("3-Code");
		pila.push("4-Jaime");

		for (String elemento : pila) {
			System.out.println(elemento);
		}
		
		System.out.println("Tope  " + pila.peek());
		System.out.println("Search " +  pila.search("2-MitoCode"));
		System.out.println("Search " +  pila.search("4-Jaime"));
		System.out.println("Search " +  pila.search("1-MitoCode"));
		
		System.out.println("LIFO");
		while (!pila.isEmpty()) {
			System.out.println("Atendiendo a " + pila.pop());
			Thread.sleep(1000);
		}
	}

}
