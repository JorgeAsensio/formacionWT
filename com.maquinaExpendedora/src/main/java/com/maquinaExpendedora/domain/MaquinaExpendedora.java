package com.maquinaExpendedora.domain;

import java.util.List;

public class MaquinaExpendedora {

	private double refrescosVendidos = 0;
	private double dineroTotal;
	private List<Refresco> refrescos;

	public MaquinaExpendedora() {

	}

	public MaquinaExpendedora(double dineroTotal, List<Refresco> refrescos) {

		this.dineroTotal = dineroTotal;
		this.refrescos = refrescos;
	}

	public double getRefrescosVendidos() {
		return refrescosVendidos;
	}

	public void setRefrescosVendidos(double refrescosVendidos) {
		this.refrescosVendidos = refrescosVendidos;
	}

	public void reponerRefresco(Refresco r) {

	}

	public void venderRefresco() {
		
	}

	public void mostrarInforme() {
		
	}

	public List<Refresco> getRefrescos() {
		return refrescos;
	}

	public void setRefrescos(List<Refresco> refrescos) {
		this.refrescos = refrescos;
	}

	public double getDineroTotal() {
		return dineroTotal;
	}

	public void setDineroTotal(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}
}
