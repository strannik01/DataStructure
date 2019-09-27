package com.dev21.chapter4.generics.ejercicio5;

public interface Stack<E> {

	/*Returns true if stack has no elements in it.*/
	public boolean isEmpty();
	
	/* Returns item at top of stack without removing it.*/
	public E peek();
	
	/*Returns and removes item from top of stack.*/
	public E pop();
	
	/*Adds item to top of stack.*/
	public void push(E item);
	
	/*Number of elements in stack.*/
	public int size();
	
}
