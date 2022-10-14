package com.curso.merdado.persistencia;

import java.util.List;

import com.curso.mercado.entidades.Producto;

public class ProductoDAO implements GenericDAO<Producto>{

	@Override
	public void add(Producto entidad) {
		System.out.println("Lo guardo el la BD "+ entidad);
		
	}

	@Override
	public List<Producto> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
