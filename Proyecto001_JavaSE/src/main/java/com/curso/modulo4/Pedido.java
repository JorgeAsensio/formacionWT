package com.curso.modulo4;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {

	private int id;
	private Date fechaPedido;
	private int idProducto;
	private int cantidad;
	private String Observaciones;

	public Pedido(int id, Date fechaPedido, int idProducto, int cantidad, String observaciones) {
		// super();
		this.id = id;
		this.fechaPedido = fechaPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		Observaciones = observaciones;
	}

	public Pedido(int id) {
		this(id, new Date(), 0, 0, "");
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaPedido=" + fechaPedido + ", idProducto=" + idProducto + ", cantidad="
				+ cantidad + ", Observaciones=" + Observaciones + "]";
	}
}
