package com.dev21.pluralsigth.data;

public class BasicBinaryTree<X extends Comparable<X>> {
	private Node root;
	private int size;

	public BasicBinaryTree() {
		this.root = null;
	}

	public int size() {
		return size;
	}

	public void add(X item) {
		Node node = new Node(item);
		
		if (root == null) {
			this.root = node;
			System.out.println("Set root: " + node.getItem());
			this.size++;
		} else {
			insert(this.root, node);
		}
	}
	
	public boolean contains(X item) {
		Node currentNode = getNode(item);
		return currentNode != null;
	}
	
	public boolean delete(X item) {
		boolean deleted = false;
		
		// si root es nulo significa que el árbol está vacío, no borrará.
		if (this.root == null) {
			return false;
		}
		
		Node currentNode = getNode(item);
		
		// find the node to delete
		if (currentNode != null) {
			// si el nodo a borrar no tiene ningún hijos, desvinculo el nodo actual y establezco un valor nulo (lo borro)
			if (currentNode.getLeft() == null && currentNode.getRight() == null) {
				unLink(currentNode, null);
				deleted = true;
			} else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
				unLink(currentNode, currentNode.getRight());
				deleted = true;
			} else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
				unLink(currentNode, currentNode.getLeft());
				deleted = true;
			} 
			// El nodo a borrar tiene ambos hijos
			else {
				// Aquí usamos como técnica el intercambio de nodos
				// podemos intercambiar el nodo actual del lado izquierdp con el nodo derecho más interno (tipo hoja)
				Node child = currentNode.getLeft();
				
				while (child.getRight() != null && child.getLeft() != null) {
					child = child.getRight();
				}
				
				// tenemos el nodo hoja que está más a la derecha. Podemos reemplazar el nodo actual con este nodo
				child.getParent().setRight(null); // cortamos la referencia
				
				child.setLeft(currentNode.getLeft());
				child.setRight(currentNode.getRight());
				
				unLink(currentNode, child);
				deleted = true;
			}
			
		}
		
		if (deleted) {
			this.size--;
		}
		
		return deleted;
	}
	
	private void unLink(Node currentNode, Node newNode) {
		if (currentNode == this.root) {
			newNode.setLeft(currentNode.getLeft());
			newNode.setRight(currentNode.getRight());
			this.root = newNode;
		} else if (currentNode.getParent().getRight() == currentNode) {
			currentNode.getParent().setRight(newNode);
		} else {
			currentNode.getParent().setLeft(newNode);
		}
	}
	
	private Node getNode(X item) {
		Node currentNode = this.root;
		
		while (currentNode != null) {
			int val = item.compareTo(currentNode.getItem());
			
			if (val == 0) {
				return currentNode;
			} else if (val < 0) {
				currentNode = currentNode.getLeft();
			} else {
				currentNode = currentNode.getRight();
			}
		}
		return null;
	}

	private void insert(Node parent, Node child) {
		if (child.getItem().compareTo(parent.getItem()) < 0) {
			// debe insetarse hacia la izquierda
			if (parent.getLeft() == null) {
				parent.setLeft(child);
				child.setParent(parent);
				this.size++;
			} else {
				insert(parent.getLeft(), child);
			}
		} else if (child.getItem().compareTo(parent.getItem()) > 0) {
			// debe insetarse hacia la derecha
			if (parent.getRight() == null) {
				parent.setRight(child);
				child.setParent(parent);
				this.size++;
			} else {
				insert(parent.getRight(), child);
			}
		}
		// no he agregado el caso child.getItem().compareTo(parent.getItem()) == 0 ya
		// que espero que se agreguen valores únicos
	}

	private class Node {
		private Node left;
		private Node right;
		private Node parent;
		private X item;

		public Node(X item) {
			this.left = left;
			this.right = right;
			this.parent = parent;
			this.item = item;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		public X getItem() {
			return item;
		}

		public void setItem(X item) {
			this.item = item;
		}

	}

}
