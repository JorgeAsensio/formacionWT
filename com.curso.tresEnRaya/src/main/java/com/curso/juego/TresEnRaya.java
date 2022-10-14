package com.curso.juego;

/**
 * Implementa el juego tres en raya
 * 
 * Requisito01 Una pieza puede colocarse en cualquier espacio vacio de untablero
 * de 3x3 *Cuando una pieza se coloca fuera del eje de las x se lanza
 * RunTimeExpecption *Cuando una pieza se coloca fuera del eje de las y se lanza
 * RunTimeExpecption *Cuando una pieza se coloca en un espacio ocupado por otra
 * pieza se lanza RunTimeException *Cuando una pieza se coloca en un espacio
 * libre y dentro del tablero
 */
public class TresEnRaya {

	private Character[][] tablero;
	private Character jugadorActual;

	public TresEnRaya() {

		this.tablero = new Character[3][3];
		this.jugadorActual = 'X';
	}
	
	public Character getJugadorActual() {
		return jugadorActual;
	}
	

	public int suma(int n, int n2) {

		return n + n2;
	}

	public void jugar(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		ponerFicha(x, y);

	}// fin ponerFicha

	public Character verFicha(int x, int y) {

		return this.tablero[x][y];
	}

	private void validarCoordenadaX(int x) {

		if (x < 0 || x > 2) {
			throw new RuntimeException(
					"La ficha no se puede posicionar" + " fuera del tablero. " + "Coordenada X mal.");

		}
	}

	private void validarCoordenadaY(int y) {

		if (y < 0 || y > 2) {
			throw new RuntimeException(
					"La ficha no se puede posicionar" + " fuera del tablero. " + "Coordenada y mal.");

		}

	}

	private void ponerFicha(int x, int y) {
		if (tablero[x][y] != null) {
			throw new RuntimeException("Ya hay una ficha en este posicion");
		}
		tablero[x][y] = this.jugadorActual;
		
		if(this.jugadorActual == 'X') {
			this.jugadorActual = 'O';
		}
		else {
			this.jugadorActual = 'X';
			}

	}

}
