package com.dev21.chapter4.generics.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack implements Stack<String> {
	
	List<String> array = new ArrayList<>();

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(String item) {
		array.add(item);
		
	}

	@Override
	public int size() {
		return array.size();
	}

}
