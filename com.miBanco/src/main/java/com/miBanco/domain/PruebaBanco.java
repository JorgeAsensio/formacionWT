package com.miBanco.domain;

public class PruebaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco(null, 0);

		banco.addClientes("Simms", "Jane");
		banco.addClientes("Bryant", "Owen");
		banco.addClientes("Soley", "Tim");
		banco.addClientes("Soley", "Maria");

		int numeroClientes = banco.getNumClientes();

		for (int i = 0; i < numeroClientes; i++) {
			Cliente c = banco.getClientes(i);

			System.out.println("Cliente [" + i + "]" + "es " + c.getNombre() + ", " + c.getApellido());
			System.out.println(c);
		}

		
	}

}
