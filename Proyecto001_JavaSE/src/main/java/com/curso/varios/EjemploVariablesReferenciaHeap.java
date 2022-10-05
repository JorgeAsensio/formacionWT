package com.curso.varios;

public class EjemploVariablesReferenciaHeap {
	public static void main(String[] args) {

		Alumno a= new Alumno(1);
		
		metodo1(a);
		System.out.println("El id del alumno es " +a.getId());
		System.out.println("fin main ");
	}

	public static void metodo1(Alumno mePuedoLLamarComoQuiera) {
		Alumno b = mePuedoLLamarComoQuiera;
		b.setId(33);
		
		metodo2();
		
		System.out.println("fin metodo1 ");
	}

	public static void metodo2() {

		
		
		System.out.println("fin metodo2 ");
	}
}
