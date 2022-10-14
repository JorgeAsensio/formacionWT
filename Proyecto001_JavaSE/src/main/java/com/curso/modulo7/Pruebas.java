package com.curso.modulo7;

import java.sql.Connection;

public class Pruebas {
	public static void main(String[] args) {
		// String url = EjemploStatic2.URL_DB;
		// Connection c= EjemploStatic2.getConnection();

		// EjemploStatic2 e = new EjemploStatic2(); NO DEJA PORQUE ES PRIVATE
		// **************************************************************************

		

		// crear 3 objetos counter, ver sus serialNumbers u ver lo que vale ahora
		// counter
		System.out.println("Counter vale: " + Counter.getCounter());
		Counter c = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		System.out.println("Counter vale: " + Counter.getCounter());
	}

}
