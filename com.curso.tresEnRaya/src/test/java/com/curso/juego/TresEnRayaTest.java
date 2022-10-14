package com.curso.juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresEnRayaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumarDosMasDosDara4() {

		// Datos de entrada
		TresEnRaya juego = new TresEnRaya();
		int n = 2;
		int n2 = 2;

		// resultado esperado

		int espero = 4;

		// resultado real obtenido

		int r = juego.suma(n, n2);

		// si no coinciden fallo
		if (espero != r) {
			fail("No sumado 2 +2 =4 sino que el resultado es :" + r);
		}

	}

	@Test(expected = RuntimeException.class)
	public void ponerFichaEnCoordenadaXMalLanzaUnaExpection() {

		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas
		juego.jugar(4, 2); // falla si no lanza RunTimeExpection

	}

	@Test(expected = RuntimeException.class)
	public void ponerFichaEnCoordenadaYMalLanzaUnaExpection() {

		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas
		juego.jugar(2, 4); // falla si no lanza RunTimeExpection

	}

	@Test(expected = RuntimeException.class)
	public void ponerFichaEnPosicionQueYaHayOtraLanzaException() {

		// preparar el escenario
		TresEnRaya juego = new TresEnRaya();

		juego.jugar(0, 0);
		juego.jugar(0, 0); // debe lanzar una exception

	}

	@Test
	public void ponerFichaXeYBienEsperaQueEstaPosicionYaNoSeaNull() {

		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);

		if (juego.verFicha(0, 0) == null) {
			fail("La ficha debe estar en esta posicion y no hay ficha");
		}

	}

	@Test
	public void primerJugadorEsX() {

		TresEnRaya juego = new TresEnRaya();

		if (juego.getJugadorActual() != 'X') {
			fail("El primer jugador debe ser X");
		}
	}

	@Test
	public void siAnteriorJugadorEsXAhoraesO() {

		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		if (juego.getJugadorActual() != 'O') {
			fail("El primer jugador debe ser O");
		}
	}

	public void siAnteriorJugadorEsOAhoraesX() {

		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		juego.jugar(0, 2);

		if (juego.getJugadorActual() != 'X') {
			fail("El primer jugador debe ser X");
		}
	}

	@Test
	public void jugadorHaceLineaHorizontal() {
		String ganador =null;
		
		
	}
	
	
	
	
	
	
}
