package com.dev21.chapter3.stacks.array.example1;

import java.util.EmptyStackException;

public class IntArrayStack implements IntStack {
	
	private int top = -1;
	private int[] data;
	private static final int DEFAULT_CAPACITY = 10;

	public IntArrayStack() {
		data = new int[DEFAULT_CAPACITY];
	}
	
	@Override
	public boolean isEmpty() {
		return data.length == 0;
	}

	@Override
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return data[top];
	}

	@Override
	public void push(int item) {
		if (top == data.length -1) {
			resize(2 * data.length);
		}
		data[++top] = item;

	}

	private void resize(int newCapacity) {
		int[] newData = new int[newCapacity];
		for (int i = 0; i < top; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return data[top--];
	}

	@Override
	public int size() {
		return data.length;
	}

}
