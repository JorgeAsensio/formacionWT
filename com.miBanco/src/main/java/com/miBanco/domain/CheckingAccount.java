package com.miBanco.domain;

public class CheckingAccount extends Cuenta {

	private double overDraft;

	public CheckingAccount(double balance) {
		super(balance);

	}

	public CheckingAccount(double balance, double overDraft) {
		super(balance);
		this.overDraft = overDraft;
	}

	public boolean retirar(double cantidad) {
		boolean resultado = true;

		if (balance < cantidad) {
			double overdraftNeeded = cantidad - balance;
			if (overDraft < overdraftNeeded) {

				resultado = false;
			} else {

				balance = 0.0;
				overDraft -= overdraftNeeded;
			}
		} else {

			balance = balance - cantidad;
		}

		return resultado;

	}

}