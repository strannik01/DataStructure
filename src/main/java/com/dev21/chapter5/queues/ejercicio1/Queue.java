package com.dev21.chapter5.queues.ejercicio1;

public interface Queue<E> {
	
	E dequeue();
	
	void enqueue(E item);
	
	boolean isEmpty();
	
	E peek();
	
	int size();

}
