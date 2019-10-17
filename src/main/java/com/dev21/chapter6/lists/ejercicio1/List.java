package com.dev21.chapter6.lists.ejercicio1;

public interface List<E> {

	void add(E item);
	
	void add(int index, E item);
	
	E get(int index);
	
	int indexOf(E item);
	
	boolean isEmpty();
	
	E removeAt(int index);
	
	/** Reemplaza el elemento en el índice, devolviendo el valor anterior. */
	E set(int index, E item);
	
	int size();
}
