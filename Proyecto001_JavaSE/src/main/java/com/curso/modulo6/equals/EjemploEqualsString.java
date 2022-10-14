package com.curso.modulo6.equals;

public class EjemploEqualsString {

	public static void main(String[] args) {

		String s = "Hola"; // new String("Hola");

		String p = "Hola";

		String x = new String("Hola"); // Nuevo objeto String

		System.out.println("p == s " + (p == s));

		System.out.println("p == x " + (p == x));
		// "Hola" se crea un objetos String "Hola" en Pool String
		// s y p apuntan al mismo "Hola"

		// STRING CLASE INMUTABLE

		s = "Hola";
		s.toUpperCase();
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);
	}
}
