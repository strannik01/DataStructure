package com.dev21.chapter3.stacks.array.example2;

public class IntLinkedStack implements IntStack {
	private Node top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(int item) {
		top = new Node(item, top);
	}

	@Override
	public int pop() {
		int result = top.data;
		top = top.next;
		return result;
	}

	@Override
	public int size() {
		return 0;
	}
	
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
