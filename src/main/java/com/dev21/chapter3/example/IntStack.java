package com.dev21.chapter3.example;

public interface IntStack {
	
	/**
	 * Retorna true si la pila no tiene elementos
	 * 
	 * @return
	 */
	boolean isEmpty();

	/**
	 * Retorna el último item de la pila sin removerlo
	 * 
	 * @return
	 */
	int peek();

	/**
	 * Retorna y remueve el último item de la pila
	 *  
	 * @return
	 */
	int pop();

	/**
	 * Añade item al final de la pila
	 * 
	 * @param item
	 */
	void push(int item);

	/**
	 * Número de elementos en la pila
	 * 
	 * @return
	 */
	int size();
}
