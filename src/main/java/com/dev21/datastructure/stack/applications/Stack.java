package com.dev21.datastructure.stack.applications;

public interface Stack<E> {
	
	void push(E item);
	
	E peek() throws EmptyStackException;
	
	E pop() throws EmptyStackException;
	
	boolean isEmpty();

}
