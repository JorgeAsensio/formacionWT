package com.maquinaExpendedora.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pruebaMaquinaExpendedora {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	static Scanner scan3 = new Scanner(System.in);
	static MaquinaExpendedora maquina = new MaquinaExpendedora();
	
	public static void main(String[] args) {

		List<Refresco> lista = new ArrayList<Refresco>();

		Refresco refresco = new Refresco("COLA", 250f, 2, false, 10);
		Refresco refresco1 = new Refresco("FANTA", 250f, 2, false, 10);
		Refresco refresco2 = new Refresco("PEPSI", 250f, 2, false, 10);
		Refresco refresco3 = new Refresco("TRINA", 250f, 2, false, 10);
		Refresco refresco4 = new Refresco("AQUARIUS", 250f, 2, false, 10);

		lista.add(refresco);
		lista.add(refresco1);
		lista.add(refresco2);
		lista.add(refresco3);
		lista.add(refresco4);

		maquina.setDineroTotal(100);
		maquina.setRefrescos(lista);

//		for (Refresco r : lista) {
//			System.out.println(r.getSabor());
//		}

		int opcion = -1;

		while (opcion != 0) {
			opcion = opciones();
			if (opcion == 1) {

				System.out.println("Elige un refresco");
				for (Refresco r : lista) {
					System.out.println(r.toString());
				}
				boolean encuentra = false;
				String sabor = scan2.nextLine().toUpperCase();
				for (Refresco r : lista) {
					if (r.getSabor().equals(sabor)) {
						encuentra = true;
						pagar(r);
						r.setStock(r.getStock() - 1);
						System.out.println("**************GRACIAS POR LA COMPRA***************");
	
					}
				}
				if (!encuentra) {
					System.out.println("EL refresco no existe");
				}
//				if(lista.indexOf(sabor)!=-1) {}
				opcion = -1;

			} else if (opcion == 2) {

				maquina.mostrarInforme();
				opcion = -1;

			} else if (opcion == 3) {
				maquina.reponerRefresco(null);
				opcion = -1;

			}

		}
		System.out.println("Adios!!");

	}

	public static int opciones() {
		System.out.println("¿Que desea hacer?");
		System.out.println("Pulse 1 para Comprar Refresco");
		System.out.println("Pulse 2 para Mostrar informe de ventas");
		System.out.println("Pulse 3 para Reponer Refrescos");
		System.out.println("Pulse 0 para SALIR");
		int opcion = scan.nextInt();
		return opcion;
	}

	public static void pagar(Refresco r) {
		double totalIntroducido = 0;
		
		System.out.println("El refresco " + r.getSabor() + " , cuesta " + r.getPrecio()
		+ "€ \nIntroduce el dinero por favor");
		
		while (totalIntroducido < r.getPrecio()) {
			System.out.println("Te falta : "+ (r.getPrecio()-totalIntroducido)+"€");
			System.out.println("Introduzca dinero");
			totalIntroducido += scan3.nextDouble();
			if (totalIntroducido < 0) {
				System.out.println("Numero no valido");
			}

		}double cambio=totalIntroducido-r.getPrecio();
		if(cambio>0) {
			System.out.println("Tu cambio es: "+ cambio);
			maquina.setDineroTotal(maquina.getDineroTotal()-cambio);
			
		}
	}

}
