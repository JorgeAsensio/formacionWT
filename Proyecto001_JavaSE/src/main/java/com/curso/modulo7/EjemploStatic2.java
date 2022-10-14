	package com.curso.modulo7;

import java.sql.Connection;

public class EjemploStatic2 {
	public static final String USER_DB = "alfreso";
	public static final String URL_DB = "asdasdasd";
	
	//No queremos que se instancioen objetos de la clase EjemploStaic2
	//Se declara el constructor static
	private EjemploStatic2() {
		
	}
	
	public static Connection getConnection() {
		return null;
	}
	
}
