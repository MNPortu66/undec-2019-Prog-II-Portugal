package dominio;


public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	private Materia [] listadoDeMaterias = new Materia [15];
	private int ultimaCargada = 0;
	public Carrera(String nombreCarrera, String abvCarrera, String planCarrera) {
		this.nombre = nombreCarrera;
		this.abreviatura = abvCarrera;
		this.plan = planCarrera;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getAbreviatura() {
		return this.abreviatura;
	}
	public String getPlan() {
		return this.plan;
	}
	
	public boolean addMateria(Materia m01) {
		int contador=0;
		for(int i=0; i<ultimaCargada; i++) {
			if (listadoDeMaterias[i].equals(m01))
				return false;
		
			if(listadoDeMaterias[i].getAnioAcademico() == m01.getAnioAcademico())
				contador++;
		}
		if ( 3 <= contador) {
			
			return false;
		}	
		listadoDeMaterias[ultimaCargada] = m01;
		ultimaCargada++;	
		return true;
	}

	public Materia [] getMaterias(AnioAcademico anio) {
		Materia [] materiaListado = new Materia [3];
		int contador = 0;
		for ( int j= 0; j <ultimaCargada; j++)
			if (listadoDeMaterias[j].anioacademico == anio) { 
				materiaListado[contador] = listadoDeMaterias[j];		
				contador++;
			}	
		return materiaListado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
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
		Carrera other = (Carrera) obj;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		return true;
	}
	public String getNombreEnMayusculas() {
		return nombre.toUpperCase();
	}


	public String getNombreTipoOracion() {
		return nombre.substring(0,1).toUpperCase() 
				+ nombre.substring(1).toLowerCase();
	}


	public String getNombreTresACinco() {
		int cant = 0, i=0;
		
		String [] nombreDividido = nombre.split(" ");
		String nombre ="";
		cant = nombreDividido.length;
		
		for(i = 0; i<cant-1; i++){
			if(nombreDividido[i].length()>3)
				nombre += nombreDividido[i].substring(0, 5)+ ". ";
		}
		if(nombreDividido[i].length()>3)
			nombre += nombreDividido[i].substring(0, 5)+ ".";
		return nombre;
	}
	public String getNombreTresAUna() {
	int cant = 0, i=0;
		
		String [] nombreDividido = nombre.split(" ");
		String nombre ="";
		cant = nombreDividido.length;
		
		for(i = 0; i<cant; i++){
			if(nombreDividido[i].length()>3)
				nombre += nombreDividido[i].substring(0,1);
		}
	return nombre;
	
	}
	public String getNombreFormatoUno() {
		String cadenaResultado = "";
		cadenaResultado = (getNombreTresAUna()+" "+"-"+" " + getNombreMateriaConFormato());
		return cadenaResultado;
	}
	public String getNombreMateriaConFormato() {
		int cant = 0, i=0;
		
		String [] nombreDividido = listadoDeMaterias[ultimaCargada].nombre.split(" ");
		String nombre ="";
		cant = nombreDividido.length;
		
		for(i = 0; i<cant; i++){
			if(nombreDividido[i].length()>3)
				nombre += nombreDividido[i].substring(0, 3)+ " ";
		}
		int hasta = nombre.length()-1;
		nombre = nombre.substring(0, hasta);
		return nombre;
	}
	


	
	
}
