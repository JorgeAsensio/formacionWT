package com.cursos.pruebas;

import com.curso.varios.Saludador;

public class pruebaSaludador {

	public static void main(String[] args) {
		// Uso de la clase saludador

		// 1. Se puede crear un objeto Saludador
		// crear un objeto de la clase, instancias un objeto de la clase
		// s1 es una variable de referencia que apunta a objetos de tipo Saludador
		Saludador s1 = new Saludador();

		// 2. Pedir saludar pasando nombre -> muestra "hola " + nombre

		System.out.println(s1.saluda("Jorge Asensio"));

		// 3.Pedir saludar sin nombre -> muestra "hola amigo"
		System.out.println(s1.saluda());
		
		
		//4. Crear un saludador en el que indique el saludo
		Saludador s2 = new Saludador("Buenos dias");
		
		//5. Pedir saludo sin nombre "Buenos dias amigo"
		System.out.println(s2.saluda());
		
	}

}
