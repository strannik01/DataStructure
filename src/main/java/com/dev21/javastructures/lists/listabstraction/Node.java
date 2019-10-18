package com.dev21.javastructures.lists.listabstraction;

public class Node<T> {
	private T value;
	private Node<T> nextElement;

	public Node(T data, Node<T> nextElement) {
		this.value = data;
		this.nextElement = nextElement;
	}
	
	public Node(T data) {
		this(data, null);
	}

	public T getValue() {
		return value;
	}

	public Node<T> getNextElement() {
		return nextElement;
	}

	public void setNextElement(Node<T> nextElement) {
		this.nextElement = nextElement;
	}

}
