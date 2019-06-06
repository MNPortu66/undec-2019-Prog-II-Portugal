package dominio;

public class ImplementacionDeMateria {
	private Materia materia1;
	private int anioCalendario = 0;
	private String fechaInicio;
	private String fechaFin;
	private Alumno [] alumnosInscriptos = new Alumno [50];
	private int cantidadAlumnos ;

	public ImplementacionDeMateria(Materia m01, int anioCalendario,String fechaInicio, String fechaFin){
		this.materia1 = m01;
		this.anioCalendario = anioCalendario;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;

	}
	public boolean addAlumno(Alumno a01) {
		int i=0;
		if (cantidadAlumnos == 0) { 
			alumnosInscriptos[0] = a01;
			cantidadAlumnos++;
			return true;
		}
		for (i = 0; i<cantidadAlumnos; i++)
			if(alumnosInscriptos[i].equals(a01))
				return false;
		alumnosInscriptos[i] = a01;
		cantidadAlumnos++;
		return true;
	}
	


	public Materia getMateria() {

		return materia1;
	}


	public int getAnioCalendario() {

		return anioCalendario;
	}


	public String getfechaInicio() {

		return fechaInicio;
	}


	public String getfechaFin() {

		return fechaFin;
	}


	public Alumno [] getListadoAlumnos() {

		return null;
	}

	
}	
