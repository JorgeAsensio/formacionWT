package com.curso.modulo6;

import java.util.Date;

public class Prueba {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		empleado.setNombre("Jorge Asensio");
		empleado.setSalario(50000);
		
		Gerente gerente = new Gerente();
		
		gerente.setDepartamento("Paco Sanz");
		gerente.setSalario(70000);
		gerente.setDepartamento("Desarrollo");
		
		System.out.println(" gerente es un gerente?" + (gerente instanceof Gerente));
		System.out.println(" empleado es un empleado?" + (empleado instanceof Empleado));
		System.out.println(" empleado es un gerente?" + (empleado instanceof Gerente));
		
		/**
		 * una variable de referencia puede apuntar 
		 * a objetos de su clase o clases hijas
		 */
		
		Empleado carlos = new Gerente();
		carlos.setNombre("Carlos asd");
		carlos.setSalario(40000);
		//carlos.setDepartamento("asd");
		
		/**
		 * Carlos tiene forma de empleado por lo tanto solo permite acceder 
		 * a los metodos declarados en clase Empleado
		 */
		
		carlos = new Empleado();
		Gerente g1= new Gerente("JORGE",450000, new Date(),"Desarrollo");
	}
}
