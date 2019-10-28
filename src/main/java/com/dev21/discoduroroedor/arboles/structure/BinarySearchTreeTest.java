package com.dev21.discoduroroedor.arboles.structure;

public class BinarySearchTreeTest {
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> arbol = new BinarySearchTree<>();
		
		arbol.add(8);
		arbol.add(4);
		arbol.add(arbol.getRoot(), 10);
		NodeBinaryTree<Integer>  t = arbol.add(arbol.getRoot(), 12); 
		arbol.add(arbol.getRoot(), 15);
		arbol.add(arbol.getRoot(), 20);
		arbol.add(arbol.getRoot(), -1);
		arbol.add(1);
		
//		arbol.preorder(arbol.getRoot());
//		
//		arbol.inorder(arbol.getRoot());
//		
//		arbol.postorder(arbol.getRoot());
		
		System.out.println(arbol.height(t));
		
		System.out.println(arbol.depth(arbol.getRoot()));
	}

}
