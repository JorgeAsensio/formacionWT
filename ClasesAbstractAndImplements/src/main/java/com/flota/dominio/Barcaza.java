package com.flota.dominio;

public class Barcaza extends Vehiculo {

	public Barcaza(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);

	}

	@Override
	public double consumoFuell() {
		
		return 200.9;
	}

}
