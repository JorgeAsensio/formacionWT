package com.curso.modulo6;

public class EjemplosClasesWrapper {
	public static void main(String[] args) {

		int numero = 2;
		Integer numero2 = new Integer(2);

		Integer numero3 = 3;

		int nn = numero3;

		int b = numero3 + new Integer(4);

		// comparacion

		Integer n1 = 12;
		Integer n2 = 12;
		Integer n3 = new Integer(12);
		
		System.out.println("n1 == n2 " + (n1==n2));//true hasta 127
		System.out.println("n1 == n3 " + (n1==n3));//true hasta 127
		
		if(n1.equals(n2)) {
			System.out.println("n1 y n2 son iguales");
		}

	}
}
