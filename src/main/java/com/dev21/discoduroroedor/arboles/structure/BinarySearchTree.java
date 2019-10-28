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
					node = add(origin.getLeft(), element);
				} else {
					node = new NodeBinaryTree<>(element);
					node.setParent(origin);
					origin.setLeft(node);
				}
				
				
			} else {
				
				
				if (origin.getRight() != null) {
					node = add(origin.getRight(), element);
				} else {
					node = new NodeBinaryTree<>(element);
					node.setParent(origin);
					origin.setRight(node);
				}
			}
		}

		return node;
	}

	public NodeBinaryTree<T> add(T element) {
		NodeBinaryTree<T> node = null;
		if (root == null) {
			root = new NodeBinaryTree<>(element);
		} else {

			NodeBinaryTree<T> aux = root;
			boolean insertado = false;

			while (!insertado) {

				if (aux.getElement().compareTo(element) > 0) {
					if (aux.getLeft() != null) {

						aux = aux.getLeft();

					} else {
						node = new NodeBinaryTree<>(element);
						node.setParent(aux);
						aux.setLeft(node);
						insertado = true;
					}
				} else {

					if (aux.getRight() != null) {
						aux = aux.getRight();
					} else {
						node = new NodeBinaryTree<>(element);
						node.setParent(aux);
						aux.setRight(node);
						insertado = true;
					}
				}
			}

		}

		return node;
	}

	public void preorder(NodeBinaryTree<T> node) {

		System.out.println(node.getElement().toString());

		if (node.getLeft() != null) {
			preorder(node.getLeft());
		}

		if (node.getRight() != null) {
			preorder(node.getRight());
		}

	}

	public void inorder(NodeBinaryTree<T> node) {

		if (node.getLeft() != null) {
			inorder(node.getLeft());
		}

		System.out.println(node.getElement().toString());

		if (node.getRight() != null) {
			inorder(node.getRight());
		}

	}

	public void postorder(NodeBinaryTree<T> node) {

		if (node.getLeft() != null) {
			postorder(node.getLeft());
		}

		if (node.getRight() != null) {
			postorder(node.getRight());
		}
		System.out.println(node.getElement().toString());

	}
	
	public int height(NodeBinaryTree<T> node) {
		int height = 0;
		
		if (isInternal(node)) {
			if (node.getLeft() != null) {
				height = Math.max(height, height(node.getLeft()));
			}
			
			if (node.getRight() != null) {
				height = Math.max(height, height(node.getRight()));
			}
			
			height++;
		}
		
		return height;
	}
	
	public int depth(NodeBinaryTree<T> node) {
		int depth = 0;
		
		if (node != getRoot()) {
			depth = 1 + depth(node.getParent());
		}
		
		return depth;
	}
	
	public void remove(NodeBinaryTree<T> node) {
		
		if (root == null) {
			System.out.println("No hay nodo que borrar");
		} else if (isLeaf(node)) {
			
		} else if (node.getRight() != null && node.getLeft() == null) {
			
		} else if (node.getRight() == null && node.getLeft() != null) {
			
		} else {
			
		}
	}
	
	private void removeLeaf(NodeBinaryTree<T> node) {
		
		if (isRoot(node)) {
			root = null;
		} else {
			
			NodeBinaryTree<T> parent = node.getParent();
			
			if (parent.getLeft() == node) {
				parent.setLeft(null);
			}
			
			if (parent.getRight() == node) {
				parent.setRight(null);
			}
			
			node = null;
			
		}
		
	}
	
	private final int NODE_LEFT = 1;
	private final int NODE_RIGHT = 2;
	private final int NODES = 3;
	
	private void removeWithChild(NodeBinaryTree<T> node, int typeNode) {
		
		NodeBinaryTree<T> siguiente;
		
		switch (typeNode) {
		case NODE_LEFT:
			break;
		case NODE_RIGHT:
			
			break;
		case NODES:
			break;
		}
	}
	
	
	
}
