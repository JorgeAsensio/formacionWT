package com.miBanco.reports;

import com.miBanco.domain.*;

public class TestReport {
	public static void main(String[] args) {

		System.out.println("CUSTOMER REPORT");
		System.out.println("================");

		Banco banco = new Banco(null, 0);

		banco.addClientes("Simms", "Jane");
		Cliente jane = banco.getClientes(0);
		Cuenta cuentaJane = new SavingAccount(500, 1);
		Cuenta cuentaJane2 = new CheckingAccount(200, 0);
		jane.addCuenta(cuentaJane);
		jane.addCuenta(cuentaJane2);
		
		banco.addClientes("Bryant", "Owen");
		Cliente Owen = banco.getClientes(1);
		Cuenta cuentaOwen2 = new CheckingAccount(200, 0);
		Owen.addCuenta(cuentaOwen2);
		
		banco.addClientes("Soley", "Tim");
		Cliente Tim = banco.getClientes(2);
		Cuenta cuentaTim = new SavingAccount(1500, 1);
		Cuenta cuentaTim2 = new CheckingAccount(200, 0);
		Tim.addCuenta(cuentaTim);
		Tim.addCuenta(cuentaTim2);
		
		banco.addClientes("Soley", "Maria");
		Cliente Maria = banco.getClientes(3);
		Cuenta cuentaMaria = new SavingAccount(200, 1);
		Cuenta cuentaMaria2 = new CheckingAccount(150, 0);
		Maria.addCuenta(cuentaMaria);
		Maria.addCuenta(cuentaMaria2);
		

		int numeroClientes = banco.getNumClientes();

		for (int i = 0; i < numeroClientes; i++) {
			Cliente c = banco.getClientes(i);
			System.out.println("Cliente : " + c.getNombre() + ", " + c.getApellido());
		//	System.out.println(c.getNumeroDeCuentas());
			for (int numeroCuentas = 0; numeroCuentas < c.getNumeroDeCuentas(); numeroCuentas++) {
				Cuenta cuenta = c.getCuenta(numeroCuentas);
				String tipoCuenta = "";
				if (cuenta instanceof SavingAccount) {
					tipoCuenta = "Saving Account";
				} else if (cuenta instanceof CheckingAccount) {
					tipoCuenta = "CheckingAccount";
				} else {
					tipoCuenta = "Unknown Account type";
				}
				
				System.out.println("" + tipoCuenta + " Balance actual: " + cuenta.getBalance());
				
			}
			System.out.println("");
		}
		
	}
}
