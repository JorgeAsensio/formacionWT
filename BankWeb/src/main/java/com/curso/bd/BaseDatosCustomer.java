package com.curso.bd;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.curso.domain.Customer;



public class BaseDatosCustomer {
	
	private static Map<Integer, Customer> tablaCustomer;
	private static int contador = 3;
	
	
	
	static {
		tablaCustomer = new TreeMap<Integer,Customer>();
		tablaCustomer.put(1, new Customer(1,"Jorge","Asensio"));
		tablaCustomer.put(2, new Customer(2,"Paco","Lopez"));
		tablaCustomer.put(3, new Customer(3,"Luis","Suarez"));
		
		
	}
	
	private BaseDatosCustomer() {}
	
	
	
	
	public static void add(String nombre, String apellido) {
		int newId = ++contador;
		Customer newP = new Customer(newId, nombre,apellido);
		tablaCustomer.put(newId, newP);
	}
	
	
	public static Collection<Customer> getAll(){
		return tablaCustomer.values();
	}
	
	public static Customer findById(int id) {
		return tablaCustomer.get(id);
	}
	
	
	public static void update(Customer pModf) throws Exception {
		Customer p = findById(pModf.getIdCustomer());
		if(p == null) {
			throw new Exception("Customer no encontrado para ser modificado");
		}
		tablaCustomer.put(pModf.getIdCustomer(), pModf);
	}
	
//	public static void delete(int id) {
//		tablaProducto.remove(id);
//	}
//	
//	public static int getContador() {
//		return contador;
//	}
	
	

}
