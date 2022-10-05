package com.curso.modulo4;

public class Producto {
	private int id;
	private String descripcion;
	private double precio;

	public static final double PRECIO_MINIMO = 1.2;

	public Producto(String s) {
		this.descripcion = s;
		this.precio=PRECIO_MINIMO;
	}

	public void incrementarPrecio() {
		int incremento = 5;
		precio += incremento / 200;
	}
}
