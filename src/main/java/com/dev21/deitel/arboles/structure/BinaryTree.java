package com.dev21.deitel.arboles.structure;

public class BinaryTree<E> {
	protected Node<E> root;
	
	public String preorder() {
		return preorder(root);
	}
	
	private String preorder(Node<E> n) {
		if (n == null) return "";
		return (n + " " + preorder(n.left) + " " + preorder(n.right)).trim();
	}

	protected static class Node<T> {
		protected T data;
		protected Node<T> left, right, parent;

		protected Node(T data, Node<T> parent) {
			this.data = data;
			this.parent = parent;
		}

		public String toString() {
			return data.toString();
		}

	}

}
