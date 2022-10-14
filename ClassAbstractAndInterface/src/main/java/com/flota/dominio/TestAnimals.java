package com.flota.dominio;

public class TestAnimals {
	
	public static void main(String[] args) {
	
		Fish fish = new Fish();
		
		Cat cat = new Cat("Fluffy");
		
		Animal animal = new Fish();
		
		Animal animal2 = new Spider();
		
		Pet pet = new Cat();
		
		
		fish.play();
		cat.play();
		
		animal2.eat();
		animal2.walk();
		
		animal.walk();
		
	}
}
