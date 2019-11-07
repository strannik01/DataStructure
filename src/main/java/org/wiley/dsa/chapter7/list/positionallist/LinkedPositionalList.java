package org.wiley.dsa.chapter7.list.positionallist;

public class LinkedPositionalList<E> implements PositionalList<E> {
	private Node<E> header;
	private Node<E> trailer;
	private int size;
	
	public LinkedPositionalList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<E> first() {
		return position(header.getNext());
	}

	@Override
	public Position<E> last() {
		return position(trailer.getPrev());
	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev());
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext());
	}

	@Override
	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext());
	}

	@Override
	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev(), trailer);
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext());
	}

	@Override
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;
	}

	@Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();		
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(answer);
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}
	
	/** Valida la posición y la retorna como un nodo */
	private Node<E> validate(Position<E> p) throws IllegalStateException {
		if (!(p instanceof Node))
			throw new IllegalStateException("Invalid p");
		Node<E> node = (Node<E>) p;
		if (node.getNext() == null)
			throw new IllegalStateException("p is no longer in the list");
		return node;
	}
	
	/** Retorna el nodo dado como una posición */
	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
			return null;
		return node;
	}
	
	/** Agrega el elemento e a la lista vinculada entre los nodos dados */
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
	}

	private static class Node<E> implements Position<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		@Override
		public E getElement() throws IllegalStateException {
			if (next == null)
				throw new IllegalStateException("Position no longer valid");
			return element;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public void setElement(E element) {
			this.element = element;
		}

	}

}
