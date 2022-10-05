package com.miBanco.domain;

public class Cuenta {
	private double balance = 0;

	public Cuenta(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean depositar(double cantidad) {
		balance = cantidad + balance;
		return true;
	}

	public boolean retirar(double cantidad) {
		boolean ok = false;

		if (cantidad <= balance) {
			balance = balance - cantidad;
			ok = true;

		}
		return ok;
	}
}