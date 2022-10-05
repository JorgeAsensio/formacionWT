package com.curso.varios;

public class Saludador {
	// Atributos
	private String saludo;

//	Constructor por defecto
	public Saludador() {
		super();
		saludo = "Hola";
	}
	//////////////Constructor//////////////////////

	public Saludador(String saludo) {

		this.saludo = saludo;
	}

	public String saluda(String nombre) {

		return saludo + nombre;

	}

	// Cobrecargar el metodo

	public String saluda() {
		return saludo + " Amigo";
	}

}
