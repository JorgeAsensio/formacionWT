package com.flota.dominio;

/**
 * Clase que respresenta un vehiculo de una flota Puede transportar cajas Pero
 * tiene carga maxima permitida
 * 
 * @author jorge
 * @version 1.0
 */

public class VehiculoMejorado {

	private double cargaMaxima;
	private double cargaActual = 0;
	private String matricula = "";
	private int numCajas = 0;

	public VehiculoMejorado(String matricula, double cargaMaxima) {
		// validar matricula no null
		// validar carga maxima > 0

		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;

	}

	public double getCargaActual() {
		return cargaActual;
	}

	public int getNumCajas() {
		return numCajas;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {

		if (cargaMaxima < 0) {
			throw new RuntimeException("No puede puede introducir una carga maxima negativa");
		}
		this.cargaMaxima = cargaMaxima;
	}

	/**
	 * Metodo que recibe el de la caja a cargar y incrementa el peso actual del
	 * camion y el numero de cajas cargadas Si el peso no es valido (<0) lanza una
	 * exception Si el peso a cargar supera el max permitido lanza exception
	 * 
	 * @param peso Peso de la caja a cargar en Kg
	 * @throws RunTimeException El peso de la caja no es valido o supero la carga
	 *                          maxima permitida
	 */

	public void cargarCaja(double peso) throws CargaException {
		if (peso <= 0) {
			throw new CargaException("La carga debe pesar algo",0);
		}
		if (peso > 0 && (peso + cargaActual <= cargaMaxima)) {
			// puedo cargar
			this.cargaActual += peso;
			this.numCajas++;
			System.out.println("Se cargó correctamente");
		} else {
			double exceso= cargaMaxima- (peso+cargaActual);
			throw new CargaException("No caben mas cajas", exceso);
		}

	}

	public void cargarCaja(Caja c)throws CargaException {
		cargarCaja(c.getPeso());

	}

	

}
