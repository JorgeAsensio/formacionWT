package com.curso.modulo6;

public class Animal {
	private String sonido;

	public void comer() {
		System.out.println("estoy comiendo");
	}
}

class Perro extends Animal {

	private String raza;

	@Override
	public void comer() {
		System.out.println("Como huesos o pienso");
	}
}

class PerroCaza extends Perro {
	private int altura;

	public void olfatearPresa() {
		System.out.println("oliendo presa");
	}

	@Override
	public void comer() {
		System.out.println("Como lo que he cazado");
	}

}

class Vaca extends Animal {

	@Override
	public void comer() {
		System.out.println("Como hierba");
	}
}

class Gato extends Animal {
	@Override
	public void comer() {
		System.out.println("Como ratones");
	}

}

/**
 * 
 * Gato g = new Gato(): g = new Perro(); NO g = new Animal(); NO
 * 
 * 
 */
