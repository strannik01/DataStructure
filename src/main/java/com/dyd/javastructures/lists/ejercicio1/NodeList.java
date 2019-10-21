package com.dyd.javastructures.lists.ejercicio1;

public class NodeList {
	
	Object datos;
	NodeList nextNode;
	
	NodeList(Object object) {
		this(object, null);
	}
	
	NodeList(Object datos, NodeList nextNode) {
		this.datos = datos;
		this.nextNode = nextNode;
	}

}
