package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.Materia;

class Test02 {

	@Test
	//Nuevos requerimientos para el TP.
	void test01() {
		//1.1 Se deberia trabajar con la clase carrera
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		
		//Act
		String actual = c01.getNombreEnMayusculas();
		
		//Assert
		assertEquals(nombreEsperado, actual);
		
	}
	@Test
	void test02() {
		//1.2 Todo en formato tipo oracion
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "Licenciatura en sistemas";
		
		Carrera c02 = new Carrera("Abogacia", "Abog.", "128/01");
		String nombreEsperado02 = "Abogacia";
		
		Carrera c03 = new Carrera("abogacia", "Abog.", "128/01");
		String nombreEsperado03 = "Abogacia";
		
		Carrera c04 = new Carrera("aBOGACIA", "Abog.", "128/01");
		String nombreEsperado04 = "Abogacia";		
		
		//Act
		String actual01 = c01.getNombreTipoOracion();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c04.getNombreTipoOracion();
		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
	}

	@Test
	void test04() {
		//1.4 Las palabras de mas de 3letras se abrevian a 5 y un punto
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "Licen. Siste.";
		
		Carrera c02 = new Carrera("Abogacia", "Abog.", "128/01");
		String nombreEsperado02 = "Aboga.";
		
		Carrera c03 = new Carrera("Tecnicatura en Alimentos", "Abog.", "128/01");
		String nombreEsperado03 = "Tecni. Alime.";
	
		
		//Act
		String actual01 = c01.getNombreTresACinco();
		String actual02 = c02.getNombreTresACinco();
		String actual03 = c03.getNombreTresACinco();

		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);

	}
	@Test
	void test05() {
		//1.5 Las palabras de mas de 3letras se abrevian a un letra en mayuscula sin punto ni espacios
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "LS";
		
		Carrera c02 = new Carrera("Abogacia", "Abog.", "128/01");
		String nombreEsperado02 = "A";
		
		Carrera c03 = new Carrera("Tecnicatura en Alimentos", "Abog.", "128/01");
		String nombreEsperado03 = "TA";
	
		
		//Act
		String actual01 = c01.getNombreTresAUna();
		String actual02 = c02.getNombreTresAUna();
		String actual03 = c03.getNombreTresAUna();

		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);

	}

	@Test
	void test06() {
		//2.1 Formato uno: Antepuesto el nombre de la carrera en formato cinco seguida de un espacio
		//un guion medio, otro espacio y las primeras tres letras de cada palabra de la materia.

		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m01 = new Materia("Algoritmo y Estrucuturas de Datos", "Alg. y Est. de Datos", AnioAcademico.I );
		String nombreEsperado01 = "LS - Alg Est Dat";
		
		Carrera c02 = new Carrera("Abogacia", "Abog.", "128/01");
		Materia m02 = new Materia("Derecho Romano", "Der. Rom.", AnioAcademico.II );
		String nombreEsperado02 = "A - Der Rom";
		
		Carrera c03 = new Carrera("Tecnicatura en Alimentos", "Abog.", "128/01");
		Materia m03 = new Materia("Biologia", "Bio.", AnioAcademico.I );
		String nombreEsperado03 = "TA - Bio";
		
	
		
		//Act
		c01.addMateria(m01);
		c02.addMateria(m02);
		c03.addMateria(m03);
		String actual01 = c01.getNombreFormatoUno();
		String actual02 = c02.getNombreFormatoUno();
		String actual03 = c03.getNombreFormatoUno();

		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);

	}
	@Test
	void test07() {
		//2.2 Antepuesto el nombre de la carrera en formato cinco seguida de un espacio, el anio academico
		//un guion medio, otro espacio y las primeras tres letras de cada palabra de la materia
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		
	
		
		//Act
		String actual01 = c01.getNombreTresACinco();
		String actual02 = c02.getNombreTresACinco();
		String actual03 = c03.getNombreTresACinco();

		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);

	}

}
