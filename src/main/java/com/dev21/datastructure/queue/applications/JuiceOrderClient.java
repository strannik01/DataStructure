package com.dev21.datastructure.queue.applications;

public class JuiceOrderClient {
	OrderQueue<JuiceOrder> orderQueue = new OrderLinkedQueue<>();

	public static void main(String[] args) {
		JuiceOrderClient client = new JuiceOrderClient();
		
		client.takeOrder(new JuiceOrder(100, "Fresa", 5), new JuiceOrder(101, "Naranja", 2), new JuiceOrder(102, "Uva", 9), new JuiceOrder(103, "Manzana", 8));
		System.out.println("Total órdenes: " + client.totalOrder());
		client.attendOrder();
		System.out.println("Órdenes por atender: " + client.totalOrder());
	}

	private int totalOrder() {
		return orderQueue.size();
	}

	private void attendOrder() {
		System.out.println("Ordenes de jugo atendidas");
		System.out.println("===========================");
		while (!orderQueue.isEmpty()) {
			JuiceOrder juiceOrder = orderQueue.dequeue();
			System.out.println(juiceOrder);
		}
	}

	private void takeOrder(JuiceOrder... taskes) {
		for (int i = 0; i < taskes.length; i++) {
			orderQueue.enqueue(taskes[i]);
		}
	}

}
