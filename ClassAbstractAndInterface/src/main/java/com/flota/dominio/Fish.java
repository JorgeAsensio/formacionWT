package com.flota.dominio;

public class Fish extends Animal implements Pet{
	
	private String name;

	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Estoy comiendo soy un pez");
		
	}
	@Override
	public void walk() {

		System.out.println("Yo nado, soy un pez");
	}

	@Override
	public void play() {
		System.out.println("Juego como un pez");
		
	}

}
