package com.dyd.javastructures.lists.ejercicio1;

public class ListTest {

	public static void main(String[] args) {
		List list = new List();
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtFinal(1);
		list.print();
		list.insertAtFinal(5);
		list.print();
		
		try {
			Object eleiminado = list.deleteFromFront();
			System.out.printf("%s eliminado\n", eleiminado);
			list.print();
			
			eleiminado = list.deleteFromFront();
			System.out.printf("%s eliminado\n", eleiminado);
			list.print();
			
			eleiminado = list.deleteFromFinal();
			System.out.printf("%s eliminado\n", eleiminado);
			list.print();
			
			eleiminado = list.deleteFromFinal();
			System.out.printf("%s eliminado\n", eleiminado);
			list.print();
			
		} catch (EmptyException e) {
			e.printStackTrace();
		}
	}

}
