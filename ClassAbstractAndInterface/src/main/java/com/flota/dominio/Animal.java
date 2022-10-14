package com.flota.dominio;

public abstract class Animal {

	protected int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public void walk() {
		System.out.println("soy un animal que anda con " + legs +" patas");
	}
	public abstract void eat();
}
