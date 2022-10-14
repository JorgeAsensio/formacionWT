package com.flota.dominio;

public class Pajaro implements Volable{

	@Override
	public void despegar() {
		System.out.println("Despego soy un pajaro");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("aterrizo como un pajaro");
		
	}

	@Override
	public void volar() {
		System.out.println("Vuelo batiendo las alas");
		
	}

}
