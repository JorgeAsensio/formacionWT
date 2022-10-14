package com.flota.dominio;

public class Cat extends Animal implements Pet {

	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		this("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Estoy comiendo soy un gato");

	}

	@Override
	public void play() {
		System.out.println("Juego como un gatete");

	}

}
