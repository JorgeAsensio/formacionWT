package com.curso.modulo6.equals;

public class PruebasEquals {
	
	public static void main(String[] args) {
		
		//comparacion enrte tipos primitivos 
		
		int a= 500;
		int b=500;
		
		System.out.println("a == B " + (a==b));
		
		//comparacion entre objetos
		
		Cliente c1 = new Cliente(1, "Laura");
		Cliente c2 = new Cliente(1, "Laura");
		
		System.out.println("c1 == c2 "+ (c1==c2)); //false, compara direcciones de memoria
		
		/**
		 * Cliente extiende de object pero no esta sobrecargado
		 */
		
		System.out.println("c1 equals c2 " + (c1.equals(c2))); // false, sigue usando ==
		
		
		
		
		
		
	}
	
}
