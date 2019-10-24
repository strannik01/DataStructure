package com.dev21.deitel.arboles;

public class NodoArbol {
	
	NodoArbol nodoIzq;
	int datos; // valor del nodo
	NodoArbol nodoDer;
	
	public NodoArbol(int datos) {
		this.datos = datos;
		nodoIzq = null;
		nodoDer = null;
	}
	
	public void insert(int valorInsertar) {
		if (valorInsertar < datos) {
			if (nodoIzq == null)
				nodoIzq = new NodoArbol(valorInsertar);
			else
				nodoIzq.insert(valorInsertar);
		} else if (valorInsertar > datos) {
			if (nodoDer == null)
				nodoDer = new NodoArbol(valorInsertar);
			else
				nodoDer.insert(valorInsertar);
			
		}
	}

}
