package com.dev21.discoduroroedor.arboles.structure;

public class NodeBinaryTree<T extends Comparable<T>> {
	private T element;
	private NodeBinaryTree<T> parent;
	private NodeBinaryTree<T> left;
	private NodeBinaryTree<T> right;

	public NodeBinaryTree(T element) {
		super();
		this.element = element;
	}

	public NodeBinaryTree(T element, NodeBinaryTree<T> parent, NodeBinaryTree<T> left, NodeBinaryTree<T> right) {
		super();
		this.element = element;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public NodeBinaryTree(T element, NodeBinaryTree<T> parent) {
		super();
		this.element = element;
		this.parent = parent;
	}

	public NodeBinaryTree(T element, NodeBinaryTree<T> left, NodeBinaryTree<T> right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public NodeBinaryTree<T> getParent() {
		return parent;
	}

	public void setParent(NodeBinaryTree<T> parent) {
		this.parent = parent;
	}

	public NodeBinaryTree<T> getLeft() {
		return left;
	}

	public void setLeft(NodeBinaryTree<T> left) {
		this.left = left;
	}

	public NodeBinaryTree<T> getRight() {
		return right;
	}

	public void setRight(NodeBinaryTree<T> right) {
		this.right = right;
	}

}
