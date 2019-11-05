package com.dev21.datastructure.queue.applications;

public class JuiceOrderClient {
	Queue<Task> queue = new LinkedQueue<>();

	public static void main(String[] args) {
		JuiceOrderClient client = new JuiceOrderClient();
		
		client.processOrder(new Task(1, "Fresa", 5), new Task(2, "Naranja", 2), new Task(3, "Uva", 9), new Task(4, "Manzana", 8));
		client.attendOrder();
		
	}

	private void attendOrder() {
		while (!queue.isEmpty()) {
			Task task = queue.dequeue();
			System.out.println(task);
		}
	}

	private void processOrder(Task... taskes) {
		for (int i = 0; i < taskes.length; i++) {
			queue.enqueue(taskes[i]);
		}
	}

}
