package com.curso.varios;

public class EjemploVariablesPila {
	public static void main(String[] args) {

		int a = 2;
		metodo1(a);
		System.out.println("fin main ");
	}

	public static void metodo1(int numero) {
		int b = numero;
		metodo2();
//		String s = null;
//		s= s.toUpperCase();
		System.out.println("fin metodo1 ");
	}

	public static void metodo2() {

		int c = 3;
//		if (c == 3) {
//			throw new RuntimeException("La has liado");
//		}
		
		System.out.println("fin metodo2 ");
	}
}
