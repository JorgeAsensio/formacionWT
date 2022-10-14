package com.flota.dominio;

import java.util.Date;

public class Avion extends Vehiculo implements Volable, Reservable{

	public Avion(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
		
	}

	@Override
	public double consumoFuell() {
		return 300.5;
	}

	@Override
	public void despegar() {
		System.out.println("Estoy Despegaaaando soy un avion");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Estoy aterrizando");
		
	}

	@Override
	public void volar() {
		System.out.println("Estoy volaaando");
		
	}
	
	@Override
	public void reservar(Date fechaReserva) {
		System.out.println("Reserva el dia : " + fechaReserva);
		
	}
	
}
