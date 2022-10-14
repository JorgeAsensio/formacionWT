package com.curso.modulo8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebasExceptions {

	public static void main(String[] args) {
		int resultado = doble("2");
		System.out.println("El doble de de 2 es: " + resultado);
		
		guardarResultado("resultados.txt",resultado);
	}

	public static int doble(String numero) {
		int numeroInicial = 0;
		// validar el numero

		// la clase wrapper Integer tiene ParseInt(); que convierte un string en int.
		// si no puede lanza exception

		try {

			// Este codigo es susceptible de lanzar NumberFormatException u otras

			numeroInicial = Integer.parseInt(numero);
			numeroInicial *= 2;
		} catch (NumberFormatException e) {

			System.out.println("No se puede calcular el doble " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error desconocido");
		}

		// calcular x2
		return numeroInicial;
	}

	public static void guardarResultado(String nombreFichero,int numero) {
		// java.io
		File f = new File(nombreFichero);
		File f2 = new File("Parametros.txt");
		try {
			f.createNewFile();

			FileReader fr = new FileReader(f2);
		} catch (FileNotFoundException e) {
			System.out.println("el fichero parametros.txt no existe");

		} catch (IOException e) {
			System.out.println("no puedo crear el fichero salida");
			throw new RuntimeException("asdasd");//tambien ejecuta finally
		} catch (Exception e) {
			System.out.println("Error desconocodo " + e.getMessage());
		} finally {
			System.out.println(".......... siempre si o si me ejecuto");
		}
		System.out.println("Despues del try catch");
	}

}
