package com.miBanco.domain;



public class Banco {
	private Cliente[] clientes;
	private int numCliente;

	

	public Banco(Cliente[] clientes, int numCliente) {
		
		this.clientes = new Cliente[6];
		this.numCliente = 0;
	}

	public void addClientes(String nombre, String apellido) {
		clientes[numCliente]= new Cliente(nombre, apellido);
		this.numCliente++;
		
	}

	public int getNumClientes() {
		return numCliente;
	}

	public Cliente getClientes(int index) {
		
		return clientes[index];
	}

}
