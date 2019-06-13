package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto {

	/**}
	 * Validar el constructor de producto junto con los getter de nombre y codigo.
	 * 
	 */
	@Test
	void test01() {
		//Arrange
		String nombreEsperado = "Teclado";
		String codigoEsperado = "00001";
	
		Fecha fechaDesde01 = new Fecha (01,2,2001);
		Fecha fechaHasta01 = new Fecha (15,2,2001);
		
		Fecha fechaDesde02 = new Fecha (16,2,2001);
		Fecha fechaHasta02 = new Fecha (27,2,2001);
		
		Fecha fechaDesde03 = new Fecha (01,3,2001);
		Fecha fechaHasta03 = new Fecha (15,3,2001);
		
		Precio p01 = new Precio(12.2, fechaDesde01, fechaHasta01);
		Precio p02 = new Precio(15.2, fechaDesde02, fechaHasta02);
		Precio p03 = new Precio(105.5, fechaDesde03, fechaHasta03);
		Precio [] listaDePrecios = {p01, p02, p03};
		
		//Act
		Producto producto01 = new Producto (nombreEsperado, codigoEsperado,listaDePrecios);
		String actual01 = producto01.getNombre();
		String actual02 = producto01.getCodigo();
		
		//Assert
		assertEquals(nombreEsperado, actual01);
		assertEquals(codigoEsperado, actual02);
		
	}
	
	/**}
	 * Validar que un producto devuelva como precio -1 cuando no tiene cargado ningun precio.
	 * 
	 */
	@Test
	void test02() {
		//Arrange
		String nombreEsperado = "Teclado";
		String codigoEsperado = "00001";
		int precioEsperado = -1;
		
		//Act
		Producto producto01 = new Producto (nombreEsperado, codigoEsperado);
		Precio [] actual01 = producto01.getListadoDePrecios();
		
		//Assert
		assertEquals(precioEsperado, actual01);
		
		
	}
	
	/**}
	 * Validar que un producto cargue adecuadamente varios precio (con fechas distintas pero siempre progresivas)
	 * y en medio de cada carga que el metodo getLastPrecio funcione adecuadamente.
	 * 
	 */
	@Test
	void test03() {
		//Arrange
		Fecha fechaDesde01 = new Fecha (01,3,2001);
		Fecha fechaHasta01 = new Fecha (15,3,2001);
		
		Fecha fechaDesde02 = new Fecha (16,3,2001);
		Fecha fechaHasta02 = new Fecha (31,3,2001);
		
		Fecha fechaDesde03 = new Fecha (01,4,2001);
		Fecha fechaHasta03 = new Fecha (15,4,2001);
		
		Precio p01 = new Precio(12.2, fechaDesde01, fechaHasta01);
		Precio p02 = new Precio(15.2, fechaDesde02, fechaHasta02);
		Precio p03 = new Precio(105.5, fechaDesde03, fechaHasta03);
		
		Producto producto01 = new Producto (nombreEsperado, codigoEsperado);
		
		//Act
		producto01.addNuevoPrecio(p01);
		boolean actual01 = precio01.equals(producto01.getLastPrecio);
		
		producto01.addNuevoPrecio(p02);
		precio01.equals(producto01.getLastPrecio);
		boolean actual02 = precio01.equals(producto01.getLastPrecio);
		
		producto01.addNuevoPrecio(p03);
		precio01.equals(producto01.getLastPrecio);
		boolean actual03 = precio01.equals(producto01.getLastPrecio);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		
		
		
	}
	
	/**}
	 * Validar que un producto no cargue un nuevo precio cuando las fechas se solapen. 
	 * 
	 */
	@Test
	void test04() {
		//Arrange
		
		
		//Act
		
		
		//Assert
		
		
	}
	
	/**}
	 * Validar que el método removeLastPrecio elimine adecuadamente los precios.
	 * 
	 */
	@Test
	void test05() {
		//Arrange
		
		
		//Act
		
		
		//Assert
		
		
		
	}

}
