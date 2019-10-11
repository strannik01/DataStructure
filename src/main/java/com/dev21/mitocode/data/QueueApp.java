package com.dev21.mitocode.data;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> cola = new PriorityQueue<>();
		cola.offer("1-MitoCode");
		cola.offer("2-Code");
		cola.offer("3-Mito");
		cola.offer("4-Jaime");
		
		
		
		while (!cola.isEmpty()) {
			System.out.println("Se procede a atender a " +  cola.peek());
			System.out.println("Atendiendo a " + cola.poll());
			Thread.sleep(1000);
		}

	}

}
