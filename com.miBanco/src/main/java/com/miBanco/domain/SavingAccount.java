package com.miBanco.domain;

public class SavingAccount extends Cuenta {
	
	private int interes;

	public SavingAccount(double balance, int interes) {
		super(balance);
		this.interes = interes;
	}
	
	

}