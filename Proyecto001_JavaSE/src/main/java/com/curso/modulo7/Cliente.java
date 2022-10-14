package com.curso.modulo7;

public class Cliente {

	private static final double DESCUENTO_MAXIMO = 30.0;
	private String nombre;

	public void verDatos() {
		System.out.println("........ los datos del cliente");
	}

	public final void hazAlgo() {
		System.out.println("trabajando...");
	}
}

final class ClienteVIP extends Cliente {

	@Override
	public void verDatos() {

		super.verDatos();
	}
	//public void hazAlgo() {} //Error porque es final y no se puede sobreescribir
}
//class ClienteExtraVIP extends ClienteVIP{} //Error porque no puede heredad al ser final