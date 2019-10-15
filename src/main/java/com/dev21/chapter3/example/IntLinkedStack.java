package com.dev21.chapter3.example;

public class IntLinkedStack implements IntStack {
	private Node top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pop() {
		// top ya no debe apunta al primer elemento en la pila sino al segundo
		// top = top.next;
		int result = top.data; // top apunta aquí al primer elemento
		top = top.next; // top ahora apunta al segundo elemento
		return result; // result entrega el elemento que debe ser eliminado
	}

	@Override
	public void push(int item) {
		// 1) Se crea un nuevo nodo que apunta al top (ese top será el siguiente elemento cuando el nodo recién creado sea insertado
//		Node p = new Node(item, top);
		
		// 2) Top adquiere nuevo valor que es el nodo que acaba de ser creado.
//		top = p;
		
		
		// En una sola línea sería así
		top = new Node(item, top);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
