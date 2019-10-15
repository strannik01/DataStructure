package com.dev21.chapter4.generics.ejercicio5;

import java.util.EmptyStackException;

public class StringLinkedStack implements Stack<String> {
	private Node<String> top;
	private int size;

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		--size;
		String result = top.data;
		top = top.next;
		return result;
	}

	@Override
	public void push(String item) {
		top = new Node<>(item, top);
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	private class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}

}
