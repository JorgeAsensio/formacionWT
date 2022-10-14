package com.curso.modulo5;

public class Punto {
	/**
	 * Clase que modela un punto de las coordenadas cartesianas
	 * @author jorge
	 */
	private int x;
	private int y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
