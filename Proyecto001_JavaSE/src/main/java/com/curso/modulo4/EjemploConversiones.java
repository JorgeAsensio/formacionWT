package com.curso.modulo4;

public class EjemploConversiones {
	public static void main(String[] args) {
		// 8 tipos primitivos

		// entero
		byte b = 1; // 8bits -139 .. 0 .. 127
		short s = 1;// 16 bits
		int i = 1; // 32 bits
		long l = 11; // 64 bits

		// literales enteros
		int numero = 1; // litereal de tipo int 32 bits
		long n2 = 1; // literal entero de 32 bits 1 cabe en un long de 64 bits
		long n3 = 1L; // litreal long 64 bits
//		int n4 = 1L; //  no compila

		// casting enteros
		 
		int x = 2;
		long y = x; //  cabe casting implicito
		
		long z = 1L;
		int zz = (int) z;// casting explicito
		
		//decimales
		float f = 45.5f; //32 bits
		double d = 333.0; // 64 bits
		
		//caracter
		char letra='x'; // 64 bits
		char letra2 = '\u03A6';
		System.out.println(letra2);
		
		int valor = letra;
		System.out.println(letra);
		System.out.println((char)(++valor));
		
		
		
		
	}
}
