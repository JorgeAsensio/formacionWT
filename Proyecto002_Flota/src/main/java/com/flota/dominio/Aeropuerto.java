package com.flota.dominio;

public class Aeropuerto {
	public void gestionarVuelo(Volable v) {
		v.despegar();
		v.volar();
		v.aterrizar();
	}

	public static void main(String[] args) {
		/**
		 * la variable de referencia v puede apuntar a cualquier objeto de la clase que
		 * implente el interfaz Volable
		 */
		Volable v = new Avion("asd", 56);
		
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.gestionarVuelo(v);
		
		Pajaro p = new Pajaro();
		aeropuerto.gestionarVuelo(p);
	}
}
