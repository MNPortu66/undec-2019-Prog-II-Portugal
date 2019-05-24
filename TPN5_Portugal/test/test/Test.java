package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.AnioAcademico;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange
		String nombreEsperado = "Licienciatura en Enologia";
		String abvEsperado = "Lic. Enolog.";
		String planEsperado = "128/12";
		
		//Act
		Carrera c01 = new Carrera(nombreEsperado,abvEsperado,planEsperado);
		
		String actualNombre = c01.getNombre();
		String actualAbv = c01.getAbreviatura();
		String actualPlan = c01.getPlan();
		
		//Assert
		assertEquals(nombreEsperado, actualNombre );
		assertEquals(abvEsperado, actualAbv );
		assertEquals(planEsperado, actualPlan );
	
	}
	void test02() {
		//Arrange
		Carrera c01 = new Carrera("Licienciatura En Sistemas", "Lic. Sist.", "071/08");
		Carrera c02 = new Carrera("Licienciatura En Sistemas", "Lic. Sist.", "070/08");
		Carrera c03 = new Carrera("Licienciatura En Sistemas", "Lic. Sist.", "071/08");
		
		//Act
		boolean actual01 = c01.equals(c02);
		boolean actual02 = c01.equals(c03);
		
		//Assert
		assertEquals(false, actual01 );
		assertEquals(true, actual02 );
	
	}
	void test03() {
		//Arrange
		String nombreEsperado = "Algoritmo y Estructuras de Datos";
		String abvEsperado = "Alg. y Est. de Datos";
		AnioAcademico anioAcademicoEsperado = AnioAcademico.I;
		
		//Act
		Materia m01 = new Materia(nombreEsperado,abvEsperado,anioAcademicoEsperado);
		
		String actualNombre = m01.getNombre();
		String actualAbv = m01.getAbreviatura();
		AnioAcademico actualAnioAcademico = m01.getAnioAcademico();
		
		//Assert
		assertEquals(nombreEsperado, actualNombre );
		assertEquals(abvEsperado, actualAbv );
		assertEquals(anioAcademicoEsperado, actualAnioAcademico );
	
	}	
	void test04() {
		//Arrange
		Materia m01 = new Materia("Algoritmo y Estrucuturas de Datos", "Alg. y Est. de Datos", AnioAcademico.I );
		Materia m02 = new Materia("Tecnologia de Comunicaciones", "Alg. y Est. de Datos",AnioAcademico.I );
		Materia m03 = new Materia("Algoritmo y Estrucuturas de Datos", "AYED", AnioAcademico.III);
		
		//Act
		boolean actual01 = m01.equals(m02);
		boolean actual02 = m01.equals(m03);
		
		//Assert
		assertEquals(false, actual01 );
		assertEquals(true, actual02 );
	
	}
}
