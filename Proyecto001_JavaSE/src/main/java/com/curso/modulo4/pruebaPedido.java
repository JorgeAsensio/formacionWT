package com.curso.modulo4;

import java.util.Date;

public class pruebaPedido {
	public static void main(String[] args) {
		Pedido p = new Pedido(1);

		p.setCantidad(10);
		p.setIdProducto(23);
		p.setFechaPedido(new Date());
		p.setObservaciones("urge");

		System.out.println(p);

		Pedido p2 = p;

		System.out.println(p2);

		p.setCantidad(500);

		System.out.println(p2.toString());

	}
}
