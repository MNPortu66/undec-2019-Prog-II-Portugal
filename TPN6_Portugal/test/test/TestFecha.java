package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Fecha;

class TestFecha {

	/**
	 * Validar que al construir una fecha con datos validos los metodos getDia(), 
	 * getMes() y getAnio() devuelvan los valores adecuados.
	 */
	@Test
	void test01() {
		//Arrange
		int fechaEsperadaDia = 15;
		int fechaEsperadaMes = 12;
		int fechaEsperadaAnio = 2015;
		Fecha fecha1 = new Fecha(fechaEsperadaDia, fechaEsperadaMes, fechaEsperadaAnio);

		
		//Act
		int actual01 = fecha1.getDia();
		int actual02 = fecha1.getMes();
		int actual03 = fecha1.getAnio();
		
		//Assert
		assertEquals(fechaEsperadaDia,actual01);
		assertEquals(fechaEsperadaMes,actual02);
		assertEquals(fechaEsperadaAnio,actual03);
				
	}

	/**
	 * Validar que al construir una fecha con datos valido el metodo getFechaCorta 
	 * devuelva con el formato adecuado.Hacer pruebas con dias de uno
	 *  y dos digitos, con meses de uno y dos digitos.
	 */
	@Test
	void test02() {
		//Arrange
		Fecha fecha1 = new Fecha(15, 4, 2019);
		Fecha fecha2 = new Fecha(1, 1,2019 );
		Fecha fecha3 = new Fecha(9, 6, 2019);
		String fechaEsperada01 = "15/04/19";
		String fechaEsperada02 = "01/01/19";
		String fechaEsperada03 = "09/06/19";
		
		//Act
		String actual01 = fecha1.getFechaCorta();
		String actual02 = fecha2.getFechaCorta();
		String actual03 = fecha3.getFechaCorta();
		
		//Assert
		assertEquals(fechaEsperada01,actual01);
		assertEquals(fechaEsperada02,actual02);
		assertEquals(fechaEsperada03,actual03);
	}
	
	
	/**
	 * Validar que al construir una fecha con valores de dias no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para cada mes.
	 */
	@Test
	void test03() {
		//Arrange
		Fecha fecha01 = new Fecha(32, 1,2003);
		Fecha fecha02 = new Fecha(30, 2, 2004 );
		Fecha fecha03 = new Fecha(0, 3, 2005);
		Fecha fecha04 = new Fecha(-5, 4, 2006);
		Fecha fecha05 = new Fecha(33, 5,2007 );
		Fecha fecha06 = new Fecha(31, 6, 2008);
		Fecha fecha07 = new Fecha(-3, 7, 2009);
		Fecha fecha08 = new Fecha(0, 8,2010 );
		Fecha fecha09 = new Fecha(31, 9, 2011);
		Fecha fecha10 = new Fecha(-5, 10, 2012);
		Fecha fecha11 = new Fecha(31, 11,2013 );
		Fecha fecha12= new Fecha(333, 12, 2014);
		String fechaEsperada01 = "01/01/1900";
		
		//Act
		String actual01 = fecha01.getFechaCorta();
		String actual02 = fecha02.getFechaCorta();
		String actual03 = fecha03.getFechaCorta();
		String actual04 = fecha04.getFechaCorta();
		String actual05 = fecha05.getFechaCorta();
		String actual06 = fecha06.getFechaCorta();		
		String actual07 = fecha07.getFechaCorta();
		String actual08 = fecha08.getFechaCorta();
		String actual09 = fecha09.getFechaCorta();
		String actual10 = fecha10.getFechaCorta();
		String actual11 = fecha11.getFechaCorta();
		String actual12 = fecha12.getFechaCorta();
		
		//Assert
		assertEquals(fechaEsperada01,actual01);
		assertEquals(fechaEsperada01,actual02);
		assertEquals(fechaEsperada01,actual03);
		assertEquals(fechaEsperada01,actual04);
		assertEquals(fechaEsperada01,actual05);
		assertEquals(fechaEsperada01,actual06);
		assertEquals(fechaEsperada01,actual07);
		assertEquals(fechaEsperada01,actual08);
		assertEquals(fechaEsperada01,actual09);
		assertEquals(fechaEsperada01,actual10);
		assertEquals(fechaEsperada01,actual11);
		assertEquals(fechaEsperada01,actual12);
		
	}
	
	/**
	 * Validar que al construir una fecha con valores de meses no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos.
	 * 
	 */
	@Test
	void test04() {
		//Arrange
		Fecha fecha01 = new Fecha(30, 13,03);
		Fecha fecha02 = new Fecha(28, 500, 04 );
		Fecha fecha03 = new Fecha(31, -6, 05);
		Fecha fecha04 = new Fecha(1, 0, 12);
		
		String fechaEsperada01 = "01/01/1900";
		
		//Act
		String actual01 = fecha01.getFechaCorta();
		String actual02 = fecha02.getFechaCorta();
		String actual03 = fecha03.getFechaCorta();
		String actual04 = fecha04.getFechaCorta();
		
		//Assert
		assertEquals(fechaEsperada01,actual01);
		assertEquals(fechaEsperada01,actual02);
		assertEquals(fechaEsperada01,actual03);
		assertEquals(fechaEsperada01,actual04);
	}
		
	/**
	 * Validar equals de fecha.
	 * Tanto el true como el false.
	 */
	@Test
	void test05() {
		//Arrange
		Fecha fecha01 = new Fecha(30, 1, 2003);
		Fecha fecha02 = new Fecha(28, 2, 2004);
		Fecha fecha03 = new Fecha(30, 1, 2003);
		Fecha fecha04 = new Fecha(1, 12, 2012);		
		
		//Act
		boolean actual01 = fecha01.equals(fecha03);
		boolean actual02 = fecha01.equals(fecha02);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
	}
	
	/**
	 * Validar el metodo esMayorQue(Fecha).
	 * Hacer pruebas con fechas mayores, menores e iguales.
	 * En los primeros dos casos hacer pruebas que difieran solo en el dia,  
	 * luego solo en el mes, luego solo en el anio.
	 * Luego en el dia y anio y finalmente los tres valores.
	 */
	@Test
	void test06() {
		//Arrange
		Fecha fecha01 = new Fecha(27, 1, 2003);
		Fecha fecha02 = new Fecha(15, 1, 2003);
		Fecha fecha03 = new Fecha(30, 1, 2003);
		Fecha fecha04 = new Fecha(27, 1, 2003);
		
		Fecha fecha05 = new Fecha(30, 5, 2003);
		Fecha fecha06 = new Fecha(30, 2, 2003);
		Fecha fecha07 = new Fecha(30, 7, 2003);
		Fecha fecha08 = new Fecha(30, 5, 2003);
		
		Fecha fecha09 = new Fecha(28, 1, 2012);
		Fecha fecha10 = new Fecha(28, 1, 2005);
		Fecha fecha11 = new Fecha(28, 1, 2015);
		Fecha fecha12 = new Fecha(28, 1, 2012);
		
		Fecha fecha13 = new Fecha(30, 1, 2012);
		Fecha fecha14 = new Fecha(28, 1, 2004);
		Fecha fecha15 = new Fecha(29, 1, 2015);
		Fecha fecha16 = new Fecha(30, 1, 2012);
		
		Fecha fecha17 = new Fecha(11, 5, 2011);
		Fecha fecha18 = new Fecha(9, 4, 2002);
		Fecha fecha19 = new Fecha(15, 7, 2012);
		Fecha fecha20 = new Fecha(11, 5, 2011);

		//Act
		boolean actual01 = fecha01.esMayorQue(fecha02);
		boolean actual02 = fecha01.esMayorQue(fecha03);
		boolean actual03 = fecha01.esMayorQue(fecha04);
		
		boolean actual04 = fecha05.esMayorQue(fecha06);
		boolean actual05 = fecha05.esMayorQue(fecha07);
		boolean actual06 = fecha05.esMayorQue(fecha08);
		
		boolean actual07 = fecha09.esMayorQue(fecha10);
		boolean actual08 = fecha09.esMayorQue(fecha11);
		boolean actual09 = fecha09.esMayorQue(fecha12);
		
		boolean actual10 = fecha13.esMayorQue(fecha14);
		boolean actual11 = fecha13.esMayorQue(fecha15);
		boolean actual12 = fecha13.esMayorQue(fecha16);
		
		boolean actual13 = fecha17.esMayorQue(fecha18);
		boolean actual14 = fecha17.esMayorQue(fecha19);
		boolean actual15 = fecha17.esMayorQue(fecha20);
		//Assert
		
		assertEquals(false, actual01);
		assertEquals(true, actual02);
		assertEquals(false, actual03);
		
		assertEquals(false, actual04);
		assertEquals(true, actual05);
		assertEquals(false, actual06);
		
		assertEquals(false, actual07);
		assertEquals(true, actual08);
		assertEquals(false, actual09);
		
		assertEquals(false, actual10);
		assertEquals(true, actual11);
		assertEquals(false, actual12);
		
		assertEquals(false, actual13);
		assertEquals(true, actual14);
		assertEquals(false, actual15);
		
	}
	
	
}