package com.miBanco.domain;

public class Cliente {
	private String nombre;
	private String apellido;
	private Cuenta[] cuentas;
	private int numeroDeCuentas;

	

	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		cuentas = new Cuenta[10];
		numeroDeCuentas=0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}

	public void addCuenta(Cuenta cuenta) {
		int i = numeroDeCuentas++;
		cuentas[i] = cuenta;
	}

	public Cuenta getCuenta(int index) {
		return cuentas[index];
	}
}
