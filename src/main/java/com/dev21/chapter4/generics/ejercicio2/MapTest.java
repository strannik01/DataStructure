package com.dev21.chapter4.generics.ejercicio2;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedMap();
		m.put("sueldo", 10000);
		int sueldo = m.get("sueldo");
		System.out.println("Mi sueldo es: " + sueldo);
	}

}
