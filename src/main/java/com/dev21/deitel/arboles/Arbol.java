package com.dev21.deitel.arboles;

public class Arbol {
	private NodoArbol raiz;
	
	public Arbol() {
		raiz = null;
	}
	
	public void insertNodo(int valor) {
		if (raiz == null)
			raiz = new NodoArbol(valor);
		else
			raiz.insert(valor);
	}
	
	public void recorridoPreorden() {
		ayudantePreorden(raiz);
	}

	private void ayudantePreorden(NodoArbol nodo) {
		if (nodo == null) 
			return;
		System.out.printf( "%d ", nodo.datos); // imprime los datos del nodo
		ayudantePreorden( nodo.nodoIzq); // recorre el subárbol izquierdo
		ayudantePreorden( nodo.nodoDer ); // recorre el subárbol derecho
	}
	
	public void recorridoInorden() {
		ayudanteInorden( raiz );
	}

	private void ayudanteInorden( NodoArbol nodo) {
		if (nodo == null) 
			return;
		ayudanteInorden(nodo.nodoIzq); // recorre el subárbol izquierdo
		System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
		ayudanteInorden( nodo.nodoDer ); // recorre el subárbol derecho
	}
	
	public void recorridoPostorden() {
		ayudantePostorden(raiz);
	}

	private void ayudantePostorden(NodoArbol nodo) {
		if (nodo == null) 
			return;
		ayudantePostorden( nodo.nodoIzq ); // recorre el subárbol izquierdo
		ayudantePostorden( nodo.nodoDer ); // recorre el subárbol derecho
		System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
	}
}
