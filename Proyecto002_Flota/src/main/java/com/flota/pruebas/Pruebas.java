package com.flota.pruebas;




import com.flota.dominio.Vehiculo;

public class Pruebas {
	public static void main(String[] args) {
		Vehiculo camion = new Vehiculo("FTW 6999", 500.10);
		// camion.cargaMaxima = 555.25; //porque el atributo es public

		try {
			camion.setCargaMaxima(600);
			System.out.printf("El camion con matricula %s tiene" + " una carga actual de %f Kg \n", camion.getMatricula(),
					camion.getCargaActual());
			System.out.println("cargo una caja de 560 Kg");
			camion.cargarCaja(560);
			System.out.printf("El camion con matricula %s tiene" + " una carga actual de %f Kg \n", camion.getMatricula(),
					camion.getCargaActual());
			System.out.println("cargo una caja de 100 Kg");
			camion.cargarCaja(100);
			
		} catch (Exception e) {
			System.out.println("No pudo cargar: " + e.getMessage());
		}
	}
}
