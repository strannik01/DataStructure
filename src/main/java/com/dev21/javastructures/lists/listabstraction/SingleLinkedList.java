package com.dev21.javastructures.lists.listabstraction;

public class SingleLinkedList<E> implements List<E> {
	private Node<E> head;
	private int count;
	
	public SingleLinkedList() {
		head = null;
		count = 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = null;
		count = 0;
	}

	@Override
	public void addFirst(E value) {
		head = new Node<>(value, head);
		count++;
	}

	@Override
	public void addLast(E value) {
		Node<E> temp = new Node<>(value, null);
		if (head != null) {
			Node<E> finger = head;
			while (finger.getNextElement() != null) {
				finger = finger.getNextElement();
			}
			finger.setNextElement(temp);
		} else head = temp;
		
		count++;
	}

	@Override
	public E getFirst() {
		return head.getValue();
	}

	@Override
	public E removeFirst() {
		Node<E> temp = head;
		head = head.getNextElement();
		count--;
		return temp.getValue();
	}

	@Override
	public E removeLast() {
		// pre: list is not empty
		// post: removes last value from list
		Node<E> finger = head;
		Node<E> previous = null;
		
		while(finger.getNextElement() != null) {  // find end of list
			previous = finger;
			finger = finger.getNextElement();
		}
		// finger is null, or points to end of list
		if (previous == null) {
			// has exactly one element
			head = null;
		} else {
			// pointer to last element is reset
			previous.setNextElement(null);
		}
		count--;
		return finger.getValue();
	}

	@Override
	public E remove(E value) {
		// pre: value is not null
		// post: removes first element with matching value, if any
		Node<E> finger = head;
		Node<E> previous = null;
		
		while (finger != null && !finger.getValue().equals(value)) {
			previous = finger;
			finger = finger.getNextElement();
		}
		// finger points to target value
		if (finger != null) {
			// we found element to remove
			if (previous == null) { // it is first
				head = finger.getNextElement();
			} else {
				previous.setNextElement(finger.getNextElement());
			}
			count--;
			return finger.getValue();
		}
		// didn't find it, return null
		return null;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E value) {
		// pre: value is not null
		// post: returns true iff value is found in list
		Node<E> finger = head;
		while (finger != null && !finger.getValue().equals(value)) {
			finger = finger.getNextElement();
		}
		return finger != null;
	}

	@Override
	public int indexOf(E item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lasIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
