package com.dev21.chapter3.example5;

public class QueueTest {

	public static void main(String[] args) {
		Queue q1 = new ArrayQueue();
		Queue q2 = new LinkedQueue();
		
		q1.enqueue(19);
		
		int result = q2.dequeue();
		System.out.println(result);
	}

}
