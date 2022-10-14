package com.flota.pruebas;

import com.flota.dominio.Barcaza;
import com.flota.dominio.Caja;
import com.flota.dominio.Camion;
import com.flota.dominio.Moto;
import com.flota.dominio.Vehiculo;
import com.flota.informes.InformeCombustibleNecesario;

public class PruebaAbstraccion {
	
	public static void main(String[] args) {
		Vehiculo[] flota = new Vehiculo[5];
		flota[0] = new Barcaza("A1111", 1000);
		flota[1] = new Camion("A2222", 1000,3);
		flota[2] = new Barcaza("A3333", 1000);
		flota[3] = new Barcaza("A4444", 1000);
		flota[4] = new Moto("FTW 6589", 220);
	
		
		for(Vehiculo v : flota) {
			System.out.println(v.getMatricula() + " le cargo una caja");
			v.cargarCaja(new Caja());
			
		
		}
		
		InformeCombustibleNecesario informe = new InformeCombustibleNecesario(flota);
		informe.generateText(System.out);
	}
	
}
