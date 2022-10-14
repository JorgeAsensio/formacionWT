package com.flota.dominio;

public class Moto extends Vehiculo{

	public Moto(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
		
	}

	@Override
	public double consumoFuell() {
		
		return 100;
	}
	
	@Override
	public void cargarCaja(Caja c) {
		if(this.getNumCajas()==1) {
			throw new RuntimeException("La moto solo puede cargar una caja");
		}
		super.cargarCaja(c);
	}

}
