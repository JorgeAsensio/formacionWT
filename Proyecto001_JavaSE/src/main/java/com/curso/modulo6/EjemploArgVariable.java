package com.curso.modulo6;

public class EjemploArgVariable {

	private static int suma(int n, int nn, int nnn) {

		return n + nn + nnn;
	}

	private static int suma(int n, int nn) {

		return n + nn;
	}

	//metodo con argumentos variables
	private static int suma(int... numeros) {
		int r = 0;
		for (int i : numeros) {
			r += i;
		}
		return r;
	}

	public static void main(String[] args) {
		suma(2, 2, 3);
		suma(2, 4);
		
		int[] numerosAsumar = { 4, 5, 6, 8 };
		suma(numerosAsumar); // metodo 3
		
		
		//argumento variable 
		suma(2,3,4,5,55,553,333);//metodo 3
	}
}
