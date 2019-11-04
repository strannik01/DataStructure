package com.dev21.datastructure.applications;

import java.util.Scanner;

public class PostfixApplication {
	Stack<String> stack = new PostfixStack<>();

	public static void main(String[] args) {
		PostfixApplication application = new PostfixApplication();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter expression to evaluate or a # to quit.");
		String expresion = scanner.nextLine();

		while (!expresion.equals("#")) {
			boolean isRegularExpresion = application.analyzeRegularExprexion(expresion);

			try {
				if (isRegularExpresion) {
					String result = application.process(expresion);
					System.out.println("Result = " + Integer.parseInt(result));
					System.out.println();
				} else {
					System.out.println("Expresion irregular");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			

			System.out.println("Enter expression to evaluate or a # to quit.");
			expresion = scanner.nextLine();
		}
		scanner.close();
		System.out.println("Programa finalizado");
		System.exit(0);
	}

	private boolean analyzeRegularExprexion(String expresion) {

		return true;
	}

	private String process(String expresion) throws PostfixAppException {
		String[] elements = extractElements(expresion);

		for (int i = 0; i < elements.length; i++) {

			switch (elements[i]) {
			case "+":
				add();
				break;
			case "-":
				subtract();
				break;
			case "*":
				multiply();
				break;
			case "/":
				divide();
				break;
			default:
				stack.push(elements[i]);
			}

		}
		
		String result = null;
		try {
			result = stack.pop();
		} catch (EmptyStackException e) {
			throw new PostfixAppException(e.getMessage());
		}

		return result;
	}

	private void divide() throws PostfixAppException {
		double last = 0;
		double after = 0;
		try {
			last = Double.parseDouble(stack.pop());
			after = Double.parseDouble(stack.pop());
		} catch (NumberFormatException | EmptyStackException e) {
			throw new PostfixAppException();
		}
		stack.push(String.valueOf(after / last));
	}

	private void multiply() throws PostfixAppException {
		double last = 0;
		double after = 0;
		try {
			last = Double.parseDouble(stack.pop());
			after = Double.parseDouble(stack.pop());
		} catch (NumberFormatException | EmptyStackException e) {
			throw new PostfixAppException();
		}
		stack.push(String.valueOf(after * last));
	}

	private void subtract() throws PostfixAppException {
		double last = 0;
		double after = 0;
		try {
			last = Double.parseDouble(stack.pop());
			after = Double.parseDouble(stack.pop());
		} catch (NumberFormatException | EmptyStackException e) {
			throw new PostfixAppException();
		}
		stack.push(String.valueOf(after - last));
	}

	private void add() throws PostfixAppException {
		double last = 0;
		double after = 0;
		try {
			last = Double.parseDouble(stack.pop());
			after = Double.parseDouble(stack.pop());
		} catch (NumberFormatException | EmptyStackException e) {
			throw new PostfixAppException();
		}
		stack.push(String.valueOf(after + last));
	}

	private String[] extractElements(String expresion) {
		String[] elements = new String[expresion.length()];
		for (int i = 0; i < expresion.length(); i++) {
			char element = expresion.charAt(i);
			String sElement = String.valueOf(element);
			elements[i] = sElement;
		}
		return elements;
	}

}
