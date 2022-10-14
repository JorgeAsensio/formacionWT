package com.miBanco.domain;

public class Cuenta {
	protected double balance = 0;

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

	public void retirar(double cantidad) throws OverDraftException{

		if (cantidad <= balance) {
			balance = balance - cantidad;
		}
		else {
			throw new OverDraftException("Fondos insuficientes", cantidad - balance);
		}
		
	}
}



