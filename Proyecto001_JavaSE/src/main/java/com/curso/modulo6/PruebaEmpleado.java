package com.curso.modulo6;

import java.util.Date;

public class PruebaEmpleado {
	public static void main(String[] args) {

		Empleado e = new Empleado("Paaaco");
		e.setNombre("LUIS");
		e.setSalario(20000);

		Gerente g = new Gerente("paco2","a");
		g.setNombre("PACO");
		g.setSalario(20000);
		g.setDepartamento("Informatica");

		System.out.println(e.getDetails());
		System.out.println(g.getDetails());

		Administrativo a = new Administrativo("adminisPaco",450000,new Date());
		a.setNombre("Roberto");
		a.setSalario(20000);

		System.out.println(a.getDetails());

		Empleado e22 = new Gerente("paco3","gf");
		e22.setNombre("ROSA");

		System.out.println(e22.getDetails());
		e22.saluda();//no esta bien hecho
		
		Empleado.saluda();
		Gerente.saluda();
		
		Gerente soyGerente = (Gerente) e22;
		
		if(e22 instanceof Gerente) {
			soyGerente = (Gerente) e22;
		}
		
		Empleado mario= new Empleado("mario", 34000.0, new Date());
		
		Gerente ggg = new Gerente("BEGOÑA",450000, new Date(), "Desarrollo");
		
		System.out.println(mario.getClass());
		System.out.println(mario.toString());
		
		
	}

}
