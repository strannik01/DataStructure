package com.dev21.datastructure.queue.applications;

public interface Queue<E> {
	
	E dequeue();
	
	void enqueue(E item);
	
	boolean isEmpty();
	
	E peek();
	
	int size();

}
