package com.dev21.datastructure.applications;

public class PostfixStack<E> implements Stack<E> {
	private Node<E> top;
	private int size;

	@Override
	public void push(E item) {
		top = new Node<>(item, top);
		size++;
	}

	@Override
	public E peek() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		return top.getData();
	}
	
	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		size--;
		E result = top.getData();
		top = top.next;
		return result;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	private class Node<T> {
		private Node<T> next;
		private T data;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

	}

}
