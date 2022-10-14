package com.curso.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BaseDatosMemoria {

	private static Map<Integer, Alumno> tablaAlumnos;
	
	static {
		tablaAlumnos = new HashMap<>();
	}
	
	public Alumno getAlumnoById(int id) {
		return tablaAlumnos.get(id);
	}
	
	public static void addALumno(Alumno a) {
		tablaAlumnos.put(a.getId(), a);
	}
	
	public static void grabarBD() {
		// ir a la bd y grabar tabla
		Collection<Alumno> alumnos = tablaAlumnos.values();
		
		for(Alumno a : alumnos) {
			System.out.println("Inserto en BD ->" + a);
		}
	}
}

class Alumno {

	private Integer id;
	private String nombre;

	public Alumno(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
}
