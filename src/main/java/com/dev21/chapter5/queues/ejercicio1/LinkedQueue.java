package com.dev21.chapter5.queues.ejercicio1;

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;

	@Override
	public E dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("No se encontraron elementos en la cola");
		
		E data = front.data;
		front = front.next;
		
		if (isEmpty())
			rear = null;
		
		--size;
		return data;
	}

	@Override
	public void enqueue(E item) {
		Node<E> temp = new Node<>(item);
		
		if (isEmpty())
			front = temp;
		else 
			rear.next = temp;
		
		rear = temp;
		size++;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E peek() {
		if (isEmpty())
			throw new NoSuchElementException("No se encontraron elementos en la cola");
		
		return front.data;
	}

	@Override
	public int size() {
		return size;
	}
	
	
	public void print() {
		if (!isEmpty()) {
			Node<E> current = front;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println("null");
		}
		
	}
	
	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

}
