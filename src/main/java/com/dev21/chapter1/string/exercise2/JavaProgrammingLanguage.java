package com.dev21.chapter1.string.exercise2;

public class JavaProgrammingLanguage {

	public static void main(String[] args) {
		String t = "Java programming language";
		
		System.out.println(t.length()); // 25
		System.out.println(t.charAt(0)); // J
		System.out.println(t.indexOf("s")); // -1
		System.out.println(t.indexOf("n")); // 14
		System.out.println(t.indexOf("gram")); // 8
		System.out.println(t.indexOf("g", 9)); // 15 (muestra el índice de la primera ocurrencia dada luego del índice especificado, sino hay ocurrencia muestra -1)
		System.out.println(t.indexOf("g", 16)); // 20
		System.out.println(t.indexOf("r", 6)); // 6
		System.out.println(t.indexOf("r", 7)); // 9
		System.out.println(t.substring(5)); // programming language
		System.out.println(t.substring(5, 12)); // program (en este caso los índices son contados desde el cero)
		System.out.println(t.toLowerCase()); // java programming language
	}

}
