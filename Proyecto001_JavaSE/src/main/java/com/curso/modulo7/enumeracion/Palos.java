package com.curso.modulo7.enumeracion;

public enum  Palos { //solo puede ser public uno de ellos
	
	OROS,BASTOS,COPAS,ESPADAS,COMODIN
}

enum ModelosCoche {
	
	BASICO("Solo tiene motor y ruedas"), //ModelosCoche.BASICO = new ModelosCoche("Solo tiene motor");
	MEDIO("Tiene aireacondicionado"),
	SUPERIOR("Con todos los complementos");
	
	//se pueden declarar atributos, constructores y metodos
	private String descripcion;
	
	private ModelosCoche(String s) {
		this.descripcion=s;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
}