package com.dev21.pluralsigth.data;

public class BasicLinkedList<T> {
	private Node first;
	private Node last;
	private int nodeCount;
	
	public BasicLinkedList() {
		first = null;
		last = null;
		nodeCount = 0;
	}
	
	public void add(T item) {
		if (first == null) {
			first = new Node(item);
			last = first;
		} else {
			Node newLastNode = new Node(item);
			last.setNextNode(newLastNode);
			last = newLastNode;
		}
		nodeCount++;
	}
	
	public void insert(T item, int position) {
		if(size() < position) {
			throw new IllegalStateException("The LinkedList is smaller than the position you are trying to insert at: " + position);
		}
		
		Node currentNode = first;
		
		//start at 1 because we are already on the first node
		for(int i = 1; i < position && currentNode != null; i++) {
			currentNode = currentNode.getNextNode();
		}
		
		//severs the link chain and reconnects with the new node
		Node newNode = new Node(item);
		Node nextNode = currentNode.getNextNode();
		currentNode.setNextNode(newNode);
		newNode.setNextNode(nextNode);
		nodeCount++;
	}
	
	public T removeAt(int position) {
		if(first == null) {
			throw new IllegalStateException("The LinkedList is empty and there are no items to remove");
		}
		
		Node currentNode = first;
		Node prevNode = first;
		
		//start at 1 because we are already on the first node
		for(int i = 1; i < position && currentNode != null; i++) {
			prevNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		
		//now update the pointers and throw away the old first
		T nodeItem = currentNode.getNodeItem();
		prevNode.setNextNode(currentNode.getNextNode());
		nodeCount--;
		return nodeItem;
		
	}
	
	public T get(int position) {
		if(first == null) {
			throw new IllegalStateException("The LinkedList is empty and there are no items to get");
		}

		Node currentNode = first;
		for(int i = 1; i < size() && currentNode != null; i++) {
			if(i == position) {
				return currentNode.getNodeItem();
			}

			currentNode = currentNode.getNextNode();
		}
		
		//if we didn't find it then return null
		return null;
	}
	
	public int find(T item) {
		if(first == null) {
			throw new IllegalStateException("The LinkedList is empty and there are no items to find");
		}

		Node currentNode = first;
		for(int i = 1; i < size() && currentNode != null; i++) {
			if(currentNode.getNodeItem().equals(item)) {
				return i;
			}

			currentNode = currentNode.getNextNode();
		}
		
		//if we didn't find it, then return -1
		return -1;
	}
	
	public T remove() {
		if (first == null) {
			throw new IllegalStateException("The LinkedList is empty and there are no items to");
		}
		
		T nodeItem = first.getNodeItem();
		
		first = first.getNextNode();
		nodeCount--;
		return nodeItem;
	}
	
	public int size() {
		return nodeCount;
	}
	
	public String toString() {
		StringBuffer contents = new StringBuffer();
		Node curNode = first;
		
		while(curNode != null) {
			contents.append(curNode.getNodeItem());
			curNode = curNode.getNextNode();
			
			if(curNode != null) {
				contents.append(", ");
			}
		}
		return contents.toString();
	}
	
	private class Node {
		private Node nextNode;
		private T nodeItem;
		
		public Node(T item) {
			this.nextNode = null;
			this.nodeItem = item;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public T getNodeItem() {
			return nodeItem;
		}

		public void setNodeItem(T nodeItem) {
			this.nodeItem = nodeItem;
		}

		
	}
}
