package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.AnioAcademico;

class Test {

	@org.junit.jupiter.api.Test
	void test01() { //Punto a) del practico
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
	void test02() {//Punto b) del practico
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
	void test03() {//Punto c) del practico
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
	void test04() {//Punto d) del practico
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
	void test05() {//Punto e)-a y -b del practico
		//Arrange
		Carrera c01 = new Carrera("Licienciatura En Sistemas", "Lic. Sist.", "071/08");
		Materia m01 = new Materia("Algoritmo y Estrucuturas de Datos", "Alg. y Est. de Datos", AnioAcademico.I );
		String listadoMaterias [] = {"Algoritmo y Estrucuturas de Datos"};
		//Act
		boolean actual01 = c01.addMateria(m01);
		boolean actual02 = c01.addMateria(m01)
		String [] actual03 = c01.getMaterias(AnioAcademico.I);
				
		//Assert
		assertEquals(true, actual01 );
		assertEquals(false, actual02 );
		assertEquals(listadoMaterias, actual03 );
	
	}	
	void test06() {//Punto e)-c y Punto f) del practico
		//Arrange
		Carrera c01 = new Carrera("Licienciatura En Sistemas", "Lic. Sist.", "071/08");
		Materia m01 = new Materia("Algoritmo y Estrucuturas de Datos", "Alg. y Est. de Datos", AnioAcademico.I );
		Materia m02 = new Materia("Matematica Discreta", "Mat. Dis.", AnioAcademico.I );
		Materia m03 = new Materia("Algebra Lineal", "Alg. Li.", AnioAcademico.I );
		Materia m04 = new Materia("Sistemas de Representacion", "Sis. Rep.", AnioAcademico.I );
		Materia m05 = new Materia("Programacion II", "Prog. II", AnioAcademico.III );
		String listadoMaterias [] = {"Algoritmo y Estrucuturas de Datos","Matematica Discreta","Algebra Lineal" };
		//Act
		boolean actual01 = c01.addMateria(m01);
		boolean actual02 = c01.addMateria(m02);
		boolean actual03 = c01.addMateria(m03);
		boolean actual04 = c01.addMateria(m04);
		boolean actual05 = c01.addMateria(m05);
		String [] actual03 = c01.getMaterias(AnioAcademico.I);
				
		//Assert
		assertEquals(false, actual04 );
		assertEquals(true, actual05 );
		assertEquals(listadoMaterias, actual03 );
		
	}
	void test07() {//Punto g) del practico
		//Arrange
		Materia m01 = new Materia("Programacion II", "Prog. II", AnioAcademico.III);
		String fechaInicio = "12/08";
		String fechaFin = "12/12";
		String anioCalendario = "2019";
		Alumnos [] listadoDeAlumnos = null;
		ImplementacionDeMateria imp01 = new ImplementacionDeMateria(m01, anioCalendario, fechaInicio, fechaFin, null);
		
		
		//Act
		Materia actual01 = imp01.getMateria();
		String actual02 = imp01.getAnioCalendario();
		String actual03 = imp01.getfechaInicio();
		String actual04 = imp01.getfechaFin();
		Alumno [] actual05 = imp01.getListadoAlumnos();
		//Assert

		assertEquals(m01, actual01);
		assertEquals(anioCalendario, actual02);
		assertEquals(fechaInicio, actual03);
		assertEquals(fechaFin, actual04);
		assertArrayEquals (listadoDeAlumnos, actual05);
		
	}
	void test08() {//Punto h) del practico
		//Arrange
		Materia m01 = new Materia("Algoritmo y Estrucuturas de Datos", "Alg. y Est. de Datos", AnioAcademico.I );
		Alumno a01 = new Alumno("Matias", "Portugal", "38480366", "190317", "Licenciatura en Sistemas");
		Alumno a02 = new Alumno("Matias", "Portugal", "38480366", "190317", "Licenciatura en Sistemas");
		Alumno a03 = new Alumno("Guillermo", "Cerezo", "38480222", "190318", "Licenciatura en Sistemas");
		Alumno a04 = new Alumno("Guillermo", "Cerezo", "38480222", "190313", "Licenciatura en Enfermeria");
		Alumno [] listadoDeAlumnos = {a01, a03};
		ImplementacioDeCarrera imp01 = new ImplementacionDeCarrera(m01, "2019", "12/08", "12/12", listadoDeAlumnos);
		String carreraEsperada = "Licenciatura en Sistemas";
		
		String listadoMaterias [] = {"Algoritmo y Estrucuturas de Datos"};
		//Act
		boolean actual01 = imp01.addAlumno(a01);
		boolean actual02 = imp01.addAlumno(a02);
		String actual03 = a01.getCarrera();
		String actual04 = a04.getCarrera();

				
		//Assert
		assertEquals(true, actual01 );
		assertEquals(false, actual02 ); 
		assertArrayEquals(carreraEsperada, actual03);
		assertArrayEquals(carreraEsperada, actual04);
	
	}


}
