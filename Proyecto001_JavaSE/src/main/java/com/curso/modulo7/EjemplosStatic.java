package com.curso.modulo7;

public class EjemplosStatic {
	private static int revision;

	private static void hazAlgo() {

	}

	public static class ClaseInterna {
	}

	public static void main(String[] args) {
		/**
		 * La variable estatica revision se crea la primera vez que se carga la Clase
		 * EjemploStatic y solo hay una para toda la aplicacion
		 */
		EjemplosStatic.revision = 3;
		EjemplosStatic c = new EjemplosStatic();
	}
}
