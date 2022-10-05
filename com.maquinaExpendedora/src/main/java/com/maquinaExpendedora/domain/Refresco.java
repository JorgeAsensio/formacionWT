package com.maquinaExpendedora.domain;

public class Refresco {

	private String sabor;
	private float cl;
	private int precio;
	private boolean agotado;
	private int stock;


	public Refresco(String sabor, float cl, int precio, boolean agotado, int stock) {

		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.agotado = agotado;
		this.stock = stock;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public float getCl() {
		return cl;
	}


	public void setCl(float cl) {
		this.cl = cl;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public boolean isAgotado() {
		return agotado;
	}


	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Sabor=" + sabor + ", precio=" + precio + ", Stock="+ stock ;
	}
	

}
