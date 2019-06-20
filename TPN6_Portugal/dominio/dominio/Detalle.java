package dominio;

public class Detalle {
	private Producto producto;
	private int cantidadProducto;
	
	
	public Detalle(Producto producto, int cantidadProducto) {

		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getCantidadProducto() {
		return cantidadProducto;
	}


	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	public double getSubTotal() {
		return producto.getLastPrecio * cantidad;
		
	}
	
	
	
	
	
}
