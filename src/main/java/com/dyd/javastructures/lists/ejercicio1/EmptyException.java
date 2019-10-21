package com.dyd.javastructures.lists.ejercicio1;

public class EmptyException extends Exception {

	private static final long serialVersionUID = -726958355207839989L;
	
	public EmptyException() {
		this("list");
	}

	public EmptyException(String name) {
		super(name + " está vacía");
	}

}
