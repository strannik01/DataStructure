package com.dev21.chapter5.queues.ejercicio1;

public class LinkedQueueTest {

	public static void main(String[] args) {
		LinkedQueue<String> queue = new LinkedQueue<>();
		queue.enqueue("Juan");
		queue.enqueue("Pablo");
		queue.print();
		System.out.println(queue.peek());
		queue.print();
		queue.enqueue("Cánepa");
		queue.print();
		System.out.println(queue.dequeue());
		queue.enqueue("Alvarez");
		System.out.println(queue.size());
		queue.enqueue("Denisse");
		queue.print();
		System.out.println(queue.dequeue());
		queue.print();
		System.out.println(queue.dequeue());
		queue.print();
	}

}
