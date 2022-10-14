package com.curso.collections;

import java.util.*;

public class EjemploColecciones {
	public static void main(String[] args) {
		/*
		 * collection
		 * 		 set NO DUPLICADOS 
		 * 		 HashSet NO ORDENADOS 
		 * 		 LinkedHashSet ORDENADOS POR ORDEN DE INSERCION 
		 * 		 TreeSet ORDENADOS POR ORDEN NATURAL
		 * (COMPARABLE/COMPARATOR) list Permiten duplicados ArrayList .add(obj) .add(index,obj) .get(index) LinkedList Queu
		 */
		Collection c; // Interfaz

		// Set<String> s = new HashSet();//Interfaz que no permite duplicados
		Set s = new HashSet();
		s.add("Zapato");
		s.add("Avion");
		s.add(new Integer(2));
		s.add(3);
		s.add(3);

		s.remove("Avion");

		for (Object o : s) {
			System.out.println(o);
		}

		Set<String> nombres = new TreeSet(); //orden alfabetico
							//new LinkedHashSet();//Orden de insercion
							//new HashSet<>();

		nombres.add("Begoña");
		nombres.add("Mario");
		nombres.add("Carlota");
		nombres.add("Perico");
		boolean añadido =nombres.add("Begoña");
		if(!añadido) System.out.println("No se puedo añadir"); 

		for (String n : nombres) {
			System.out.println(n.toUpperCase());
		}
		
		System.out.println("/////////////////////////////////////");
		
		Punto p1 = new Punto(0, 2);
		Punto p2 = new Punto(1, 1);
		Punto p3 = new Punto(1, 5);
		Punto p4 = new Punto(1, 5);//se repite
		
		
		//NO PERMITE DUPLICADO-NO HAY ORDEN
		Set<Punto> figura = new TreeSet();
							//new HashSet();
		
		figura.add(p1);
		figura.add(p2);
		figura.add(p3);
		figura.add(p4);
		
		 for(Punto p : figura) {
			 System.out.println(p);
		 }
		
		 
		 //Comparator
		  Set<String> apellidos = new TreeSet(new ComparadorStringOrdenInverso());
		 
		  apellidos.add("Asensio");
		  apellidos.add("Alvarez");
		  apellidos.add("Cremades");
		  apellidos.add("Lopez");
		 
		 
			for(String x : apellidos) {
				 System.out.println(x);
			 }
		 
			
			//Collection tipo List
			
			List<String> paises = new ArrayList<String>();
			
			paises.add("China");
			paises.add("Egipto");
			paises.add("Italia");
			paises.add("Peru");
			paises.add("Peru");
			
			paises.add(0,"España");
			
			System.out.println("pais en 0 es: " + paises.get(0));
			System.out.println("............ lista paises");
			for(String string : paises) {
				System.out.println(string);
			}
			System.out.println(".............................................................\n Paises Ordenados: ");
			Collections.sort(paises);
			
			for(String string : paises) {
				System.out.println(string);
			}
			
			System.out.println("Lista de paises inversa : ");
			
			Collections.sort(paises, new ComparadorStringOrdenInverso());
			
			for(String string : paises) {
				System.out.println(string);
			}
			
			LinkedList<String> lista = new LinkedList<String>();
			
			lista.addFirst("Hola");
			lista.add("Hola2");
			lista.addLast("Adios");
			lista.getFirst();
			
			
			//COLAS
			
			PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
			
			cola.add(39);
			cola.add(1);
			cola.add(10);
			cola.add(59);
			cola.add(30);
			
			for(Integer i : cola) {
				System.out.println(i);
			}
			Integer trato = cola.peek(); // lo muestra y no lo borra
//			System.out.println(" Me entrega " + trato);
//			System.out.println(cola.peek());
//			System.out.println(cola.peek());
//			
			System.out.println(cola.poll()); // lo muestra y lo borra
			System.out.println(cola.poll());
			System.out.println(cola.poll());
			System.out.println("....................................");
			for(Integer i: cola)System.out.println(i);
	}
}
