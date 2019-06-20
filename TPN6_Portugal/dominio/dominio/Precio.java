package dominio;

public class Precio {
	private double valor;
	private Fecha fechaDesde;
	private Fecha fechaHasta;
	
	
	public Precio(double valor, Fecha fechaDesde, Fecha fechaHasta) {
		this.valor = valor;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Fecha getFechaDesde() {
		return fechaDesde;
	}


	public void setFechaDesde(Fecha fechaDesde) {
		this.fechaDesde = fechaDesde;
	}


	public Fecha getFechaHasta() {
		return fechaHasta;
	}


	public void setFechaHasta(Fecha fechaHasta) {
		this.fechaHasta = fechaHasta;
	}


	public boolean validarPrecio(Precio precioPrueba) {
		if (this.fechaHasta.esMayorQue(precioPrueba.fechaDesde))
			return true;
		else
			return false;
	}
	
	
	
}
