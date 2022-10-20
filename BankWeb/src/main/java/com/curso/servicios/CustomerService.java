package com.curso.servicios;

import java.util.List;

import com.curso.domain.Customer;

import com.curso.persistencia.CustomerInMemoryDAO;
import com.curso.persistencia.GenericDAO;

public class CustomerService {

	GenericDAO<Customer> dao = new CustomerInMemoryDAO();


	public void darAltaUnProducto(Customer p) {
		// validar que p no es null
		// validar desc
		// validar precio

		dao.add(p);
	}

	public List<Customer> dameTodosLosProductos() {
		return dao.getAll();
	}

	public Customer getById(int id) {
		return dao.getByID(id);

	}
}
