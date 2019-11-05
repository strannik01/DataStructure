package com.dev21.datastructure.queue.applications;

public interface OrderQueue<E> {
	
	E dequeue();
	
	void enqueue(E item);
	
	boolean isEmpty();
	
	E peek();
	
	int size();

}
