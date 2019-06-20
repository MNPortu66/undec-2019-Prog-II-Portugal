package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Fecha;
import dominio.Precio;

class TestPrecio {

	/**
	 * Validar que el constructor y los getter funcionan corractamentes
	 * 
	 */
	@Test
	void test01() {
		//Arrange
		double valorEsperado = 12.4;
		Fecha fechaDesdeEsperada = new Fecha(01, 03, 2018);
		Fecha fechaHastaEsperada = new Fecha(01, 30, 2018);
		
		Precio p01 = new Precio(valorEsperado, fechaDesdeEsperada, fechaHastaEsperada);
		
		//Act
		double actual01 = p01.getValor();
		Fecha actual02 = p01.getFechaDesde();
		Fecha actual03 = p01.getFechaHasta();
		
		//Assert
		assertEquals(valorEsperado, actual01);
		assertEquals(fechaDesdeEsperada, actual02);
		assertEquals(fechaHastaEsperada, actual03);
		
		
	}

	/**
	 * Validar dos precios son iguales solamente si se solapan sus intervalos desde hasta 
	 * 
	 */
	@Test
	void test02() {
		//Arrange
		double valor01 = 12.4;
		Fecha fechaDesde01 = new Fecha(01, 3, 2018);
		Fecha fechaHasta01 = new Fecha(31, 3, 2018);
		double valor02 = 16.4;
		Fecha fechaDesde02 = new Fecha(29, 3, 2018);
		Fecha fechaHasta02 = new Fecha(15, 4, 2018);
		double valor03 = 100.4;
		Fecha fechaDesde03 = new Fecha(16, 4, 2018);
		Fecha fechaHasta03 = new Fecha(30, 4, 2018);
		
		Precio p01 = new Precio(valor01, fechaDesde01, fechaHasta01);
		Precio p02 = new Precio(valor02, fechaDesde02, fechaHasta02);
		Precio p03 = new Precio(valor03, fechaDesde03, fechaHasta03);
		
		//Act
		boolean actual01 = p01.validarPrecio(p02);
		boolean actual02 = p01.validarPrecio(p03);
		boolean actual03 = p02.validarPrecio(p03);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		
	}
}