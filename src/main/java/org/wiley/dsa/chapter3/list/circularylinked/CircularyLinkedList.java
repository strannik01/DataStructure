package org.wiley.dsa.chapter3.list.circularylinked;

public class CircularyLinkedList<E> {
	private Node<E> tail;
	private int size;
	
	public CircularyLinkedList() {
		super();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if (isEmpty()) 
			return null;
		return tail.getNext().getElement(); // la cabeza está después de la cola
	}
	
	public E last() {
		if (isEmpty()) 
			return null;
		return tail.getElement();
	}
	
	public void rotate() { // rotar el primer elemento al final de la lista
		if (tail != null)
			tail = tail.getNext(); // la vieja cabeza se convierte en la nueva cola
	}
	
	public void addFirst(E e) {
		if ( size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);	// enlace a sí mismo circularmente
		} else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	
	public E removeFirst( ) { // remueve y retorna el primer elemento
		if (isEmpty()) 
			return null;
		Node<E> head = tail.getNext();
		if (head == tail)
			tail = null;	// debe ser el único nodo que queda
		else
			tail.setNext(head.getNext());	// elimina cabeza de la lista
		size--;
		return head.getElement();
	}
	
	private static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public E getElement() {
			return element;
		}

	}

}
