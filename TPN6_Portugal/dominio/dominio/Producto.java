package dominio;

public class Producto {
	
	private String nombre;
	private String codigo;
	private Precio [] listadoDePrecios = new Precio[15];
	private int contadorDePrecios;
	
	public Producto(String nombre, String codigo, Precio [] listadoDePrecios) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.listadoDePrecios = listadoDePrecios;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
//	public Precio getLastPrecio() {
//		
//		return ;
//	}	
	

}
