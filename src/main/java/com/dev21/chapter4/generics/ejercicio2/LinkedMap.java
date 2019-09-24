package com.dev21.chapter4.generics.ejercicio2;

import java.util.HashMap;

public class LinkedMap implements Map<String, Integer> {
	java.util.Map<String, Integer> interno = new HashMap<>();

	@Override
	public void put(String k, Integer v) {
		interno.put(k, v);
	}

	@Override
	public Integer get(String k) {
		return interno.get(k);
	}

}
