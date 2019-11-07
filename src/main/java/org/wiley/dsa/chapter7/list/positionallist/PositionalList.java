package org.wiley.dsa.chapter7.list.positionallist;

public interface PositionalList<E> {
	
	int size();
	
	boolean isEmpty();
	
	/**Retorna la primera posición en la lista (o nulo si está vacío) */
	Position<E> first();
	
	Position<E> last();
	
	/** Retorna la posición que está inmediantamente antes de la posición p (o nulo si es la primera posición)*/
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	
	/** Retorna la posición que está inmediantamente después de la posición p (o nulo si es la primera posición)*/
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	
	/** Inserta un nuevo elemento al principio de la lista y retorna su nueva posición*/
	Position<E> addFirst(E e);
	
	Position<E> addLast(E e);
	
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;

	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	
	E set(Position<E> p, E e) throws IllegalArgumentException;
	
	E remove(Position<E> p) throws IllegalArgumentException;
}
