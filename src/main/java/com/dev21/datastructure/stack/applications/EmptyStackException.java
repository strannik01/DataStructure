package com.dev21.datastructure.stack.applications;

public class EmptyStackException extends Exception {

	private static final long serialVersionUID = -2817872596922368509L;
	
	public EmptyStackException() {
		super("La pila está vacía");
	}
	
	

}
