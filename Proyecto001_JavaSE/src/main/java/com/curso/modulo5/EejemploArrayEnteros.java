package com.curso.modulo5;

public class EejemploArrayEnteros {

	public static void main(String[] args) {

		int[] numeros; // array de tipos int

		numeros = new int[4]; // array de enteros inicialicados a 0
		
		numeros[0]= 7;

		for (int n : numeros) {
			System.out.println(n);
		}
		
	}
}
