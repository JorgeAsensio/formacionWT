package com.curso.modulo6;

import java.util.Date;

public class Gerente extends Empleado {

	// hereda todos los atributos de empleado + los suyos propios
	private String departamento;

	public Gerente(String nombre, double salario, Date fechaNacimiento, String departamento) {
		super(nombre, salario, fechaNacimiento);// construcor de la clase empleado
		this.departamento = departamento;
	}

	public Gerente(String nombre, String departamento) {
		super(nombre); // construcor de la clase empleado
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String getDetails() {

		return super.getDetails() + " Gerente de : " + departamento;
	}

	public static void saluda() {
		System.out.println("Hola soy un Gerente ");
	}
}
