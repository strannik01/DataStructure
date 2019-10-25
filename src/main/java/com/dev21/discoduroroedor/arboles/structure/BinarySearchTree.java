package com.dev21.discoduroroedor.arboles.structure;

public class BinarySearchTree<T extends Comparable<T>> {

	private NodeBinaryTree<T> root;

	public boolean isEmpty() {
		return root == null;
	}

	public NodeBinaryTree<T> getRoot() {
		return root;
	}

	public boolean isRoot(NodeBinaryTree<T> node) {
		return root == node; // compara las referencias
	}

	public boolean isLeaf(NodeBinaryTree<T> node) {
		return node.getLeft() == null && node.getRight() == null;
	}

	public boolean isInternal(NodeBinaryTree<T> node) {
		return !isLeaf(node);
	}
	
	public NodeBinaryTree<T> add(NodeBinaryTree<T> origin, T element) {
		NodeBinaryTree<T> node = null;
		if (root == null) {
			root = new NodeBinaryTree<>(element);
		} else if (origin == null) {
			System.out.println("El origen es nulo");
		} else {
			if (origin.getElement().compareTo(element) > 0) {
				if (origin.getLeft() != null) {
					add(origin.getLeft(), element);
				} else {
					node = new NodeBinaryTree<>(element);
					node.setParent(origin);
					origin.setLeft(node);
				}
			} else {
				if (origin.getRight() != null) {
					add(origin.getRight(), element);
				} else {
					node = new NodeBinaryTree<>(element);
					node.setParent(origin);
					origin.setRight(node);
				}
			}
		}
		
		return node;
	}
}
