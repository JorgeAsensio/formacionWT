package com.flota.pruebas;

import java.util.Scanner;

import com.flota.dominio.Caja;
import com.flota.dominio.Vehiculo;

public class pruebaCajas {
	public static void main(String[] args) {

		int peso;
		Scanner scan = new Scanner(System.in);
		Vehiculo v = new Vehiculo("6999 FTW", 500);
		System.out.println("Se crea vehiculo " + v.getMatricula() + " Con carga maxima de " + v.getCargaMaxima());
		Caja c = new Caja();
		System.out.println("¿Cuanto pesa la caja?");
		peso = scan.nextInt();
		c.setPeso(peso);
		v.cargarCaja(c);
		System.out.println("La carga maxima del camion es: " + v.getCargaActual());
		
	}
}
