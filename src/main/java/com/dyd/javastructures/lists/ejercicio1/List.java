package com.dyd.javastructures.lists.ejercicio1;

public class List {
	private NodeList firstNode;
	private NodeList lastNode;
	private String name;

	public List() {
		this("list");
	}

	public List(String name) {
		this.name = name;
		firstNode = null;
		lastNode = null;
	}

	public void insertAtFront(Object element) {
		if (isEmpty()) {
			firstNode = new NodeList(element);
			lastNode = firstNode;
		} else {
			/**
			 * El primer nodo tomará un nuevo valor y el que era primero será el siguiente
			 */
			firstNode = new NodeList(element, firstNode);
		}
	}

	public void insertAtFinal(Object element) {
		if (isEmpty()) {
			firstNode = new NodeList(element);
			lastNode = firstNode;
		} else {
			/* El siguienteNode de ultimoNodo hace referencia al nuevo nodo */
			lastNode.nextNode = new NodeList(element);
			lastNode = lastNode.nextNode;
		}
	}

	public Object deleteFromFront() throws EmptyException {
		if (isEmpty()) {
			throw new EmptyException(name);
		}
		Object elementDeleted = firstNode.datos;

		if (firstNode == lastNode) {
			firstNode = null;
			lastNode = null;
		} else {
			firstNode = firstNode.nextNode;
		}
		return elementDeleted;
	}

	public Object deleteFromFinal() throws EmptyException {
		if (isEmpty()) {
			throw new EmptyException(name);
		}
		Object elementDeleted = firstNode.datos;

		if (firstNode == lastNode) {
			firstNode = null;
			lastNode = null;
		} else {
			NodeList actual = firstNode;

			while (actual.nextNode != lastNode) {
				actual = actual.nextNode;
			}

			lastNode = actual;
			actual.nextNode = null;
		}
		return elementDeleted;
	}

	public void print() {
		if (isEmpty()) {
			System.out.printf("%s vacia\n", name);
			return;
		}

		System.out.printf("La %s es: ", name);
		
		NodeList actual = firstNode;
		
		while (actual != null) {
			System.out.printf("%s ", actual.datos);
			actual = actual.nextNode;
		}
		System.out.println("\n");
	}

	private boolean isEmpty() {
		return firstNode == null;
	}

}
