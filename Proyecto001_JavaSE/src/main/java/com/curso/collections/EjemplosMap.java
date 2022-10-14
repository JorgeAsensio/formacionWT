package com.curso.collections;

import java.util.*;
import javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon;

public class EjemplosMap {
	public static void main(String[] args) {

		// Map <<Interface>>

		// . solo trabaja con objetos
		// . key - unico NO DUPLICADOS
		// . value - si SI DUPLICADOS

		Map map;
		// map.put(key,value);
		// map.get(key): recibe el value

		// key no duplicado - value
		map = new HashMap(); // no ordenado

		Map<Integer, Punto> figura = new HashMap<>();

		figura.put(1, new Punto(0, 0));
		figura.put(10, new Punto(4, 6));
		figura.put(10, new Punto(8, 8)); // sobreescribe la posicion 10

		System.out.println(figura.get(10));

		figura.remove(1);

		System.out.println(figura.get(1));

		figura.put(10, new Punto(4, 6));
		figura.put(2, new Punto(6, 6));
		figura.put(7, new Punto(6, 6));

		Collection<Punto> valores = figura.values();
		Set<Integer> claves = figura.keySet();

		System.out.println("...... recorre los valores");

		for (Punto p : valores)
			System.out.println(p);

		System.out.println("...... recorre las claves y sus valores");

		for (Integer clave : claves) {
			System.out.println(clave + " " + figura.get(clave));
		}

		// HashMap - Recorro la collection a traves de los key: no hay orden
		// LinkedHashMap - Recorro la coleccion a traves de los key: por orden de insercion
		// TreeMap -Recorro la coleccion a traves de los key: por orden Comparable/Comparator
	
		
	}
}
