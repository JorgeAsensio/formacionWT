package com.curso.modulo5;

public class EjemploArrayObjetosPunto {

	public static void main(String[] args) {

		Punto[] figura = new Punto[3];

		figura[0] = new Punto(3, 4);

		for (Punto p : figura) {
			System.out.println(p);
		}

		// declarar e inicializar

		int[] cantidades = { 1, 34, 56, 40, 23 };

		int[] c;
		c = new int[] { 2, 3, 0 };
		
		//array de 3 puntos
		
		Punto[] triangulo = {
				new Punto(2,3),
				new Punto(4,9),
				new Punto(7,11),		
		};
		System.out.println("triangulo...");
		for(Punto p :triangulo) {
			System.out.println(p);
		}
		
		
	}

}
