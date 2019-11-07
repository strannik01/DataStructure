package org.wiley.dsa.chapter7.list.positionallist;

public interface Position<E> {
	
	/**
	 * Retorna el elemento alojado en esta posición
	 * 
	 * @return
	 * @throws IllegalStateException
	 */
	E getElement() throws IllegalStateException; 

}
