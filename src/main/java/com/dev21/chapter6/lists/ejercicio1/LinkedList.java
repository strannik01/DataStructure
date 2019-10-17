package com.dev21.chapter6.lists.ejercicio1;

public class LinkedList<E> implements List<E> {
	private Node<E> first;
	private Node<E> last;
	private int size;
	
	public LinkedList() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public void add(E item) {
		if (first == null) {
			first = new Node<>(item);
			last = first;
		} else {
			Node<E> newLastNode = new Node<>(item);
			last.setNextElement(newLastNode);
			last = newLastNode;
		}
		size++;
	}

	@Override
	public void add(int index, E item) {
		if (size() < index && (index != 1)) {
			throw new IllegalStateException("The LinkedList is smaller than the position you are trying to insert at: " + index);
		}
		Node<E> currentNode = first;
		
		// comienza en 1 porque ya estamos en el primer nodo
		for (int i = 1; i < index && currentNode != null; i++) {
			currentNode = currentNode.getNextElement();
		}
		// corta la cadena de enlace y se vuelve a conectar con el nuevo nodo
		Node<E> newNode = new Node<>(item);
		Node<E> nextNode = currentNode.getNextElement();
		currentNode.setNextElement(newNode);
		newNode.setNextElement(nextNode);
		size++;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	private class Node<T> {
		private T data;
		private Node<T> nextElement;

		public Node(T data, Node<T> nextElement) {
			this.data = data;
			this.nextElement = nextElement;
		}
		
		public Node(T data) {
			this(data, null);
		}

		public T getData() {
			return data;
		}

		public Node<T> getNextElement() {
			return nextElement;
		}

		public void setNextElement(Node<T> nextElement) {
			this.nextElement = nextElement;
		}

	}

}
