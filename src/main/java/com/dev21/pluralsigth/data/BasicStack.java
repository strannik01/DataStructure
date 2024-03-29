package com.dev21.pluralsigth.data;

/*
 * Esta clase es un Stack básico que permite almacenar datos genéricos
 * 
 */
public class BasicStack<T> {
	private T[] data;
	private int stackPointer;	
	
	public BasicStack() {
		data = (T[]) new Object[1000];
		stackPointer = 0;
	}
	
	public void push(T newItem) {
		data[stackPointer++] = newItem;
	}
	
	public T pop() {
		if (stackPointer == 0)
			throw new IllegalStateException("No more item on the stack");
		return data[--stackPointer];
	}
	
	public boolean contains(T item) {
		boolean found = false;
		for (int i = 0; i < stackPointer; i++) {
			if (data[i].equals(item)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public T access(T item) {
		while (stackPointer > 0) {
			T tmpItem = pop();
			if (item.equals(tmpItem)) {
				return tmpItem;
			}
		}
		throw new IllegalArgumentException("Could not find item on the stack: " + item);
	}
	
	public int size() {
		return stackPointer;
	}

}
