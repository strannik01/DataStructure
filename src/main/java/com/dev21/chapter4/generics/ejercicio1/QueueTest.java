package com.dev21.chapter4.generics.ejercicio1;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayQueue();
		queue.enqueue("Hello");
		queue.dequeue();
		
	}

}
