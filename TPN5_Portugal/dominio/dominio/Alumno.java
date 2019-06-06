package dominio;

public class Alumno {
	private String nombre;
	private String apellido;
	private TipoDNI dni;
	private int nroDNI;
	private int maticula;
	private Carrera carreraDeAlumno;
	
	public Alumno(String nombre, String apellido, TipoDNI dni, int nroDNI, int matricula, Carrera carreraInscripto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nroDNI = nroDNI;
		this.maticula = matricula;
		this.carreraDeAlumno = carreraInscripto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maticula;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (maticula != other.maticula)
			return false;
		return true;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public TipoDNI getDni() {
		return dni;
	}


	public void setDni(TipoDNI dni) {
		this.dni = dni;
	}


	public int getNroDNI() {
		return nroDNI;
	}


	public void setNroDNI(int nroDNI) {
		this.nroDNI = nroDNI;
	}


	public int getMaticula() {
		return maticula;
	}


	public void setMaticula(int maticula) {
		this.maticula = maticula;
	}


	public Carrera getCarrera() {
		return carreraDeAlumno;
	}

}
