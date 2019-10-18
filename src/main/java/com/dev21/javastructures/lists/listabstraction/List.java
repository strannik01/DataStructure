package com.dev21.javastructures.lists.listabstraction;

public interface List<E> {
	
	int size();
	
	boolean isEmpty();
	
	void clear();
	
	void addFirst(E value);
	
	void addLast(E value);
	
	E getFirst();
	
	E removeFirst();
	
	E removeLast();
	
	E remove(E value);
	
	E remove();
	
	E get();
	
	boolean contains(E value);
	
	int indexOf(E item);
	
	int lasIndexOf(E value);
	
	E get(int i);
	
	/** Reemplaza el elemento en el índice, devolviendo el valor anterior. */
	E set(int index, E item);
	
	void add(int index, E value);
	
	E removeAt(int index);
	
//	Iterator<E> iterator();
	
	

}
