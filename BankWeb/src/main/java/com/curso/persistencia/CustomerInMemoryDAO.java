package com.curso.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.bd.BaseDatosCustomer;
import com.curso.domain.Customer;

/**
 * 
 * 
 *  DAO - Data Access Object
 *  
 * @author begonaolea
 *
 */
public class CustomerInMemoryDAO implements GenericDAO<Customer> {

	
	@Override
	public void add(Customer entidad) {
	  
       BaseDatosCustomer.add(entidad.getFirstName(), entidad.getLastName());
	
	}



	@Override
	public Customer getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		
		return new ArrayList( BaseDatosCustomer.getAll());
	}

//	@Override
//	public Producto getByID(int id) {
//		return BaseDatosMercado.findById(id);
//	}

}
