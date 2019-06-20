package dominio;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	private int [] limite = {31, 28, 31, 30, 31,30, 31, 31, 30, 31, 30, 31};
	
	public Fecha(int dia, int mes, int anio) {
		if (validarFecha(dia, mes, anio)) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}else {
			this.dia = 1;
			this.mes = 1;
			this.anio = 1900;
		}
	}	

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	private boolean validarFecha(int dia, int mes, int anio) {
		if(mes<=0 || mes>12)
			return false;
		if (anio<0)
			return false;
		
		if(dia > 0 && dia <= limite[mes-1])
			return true;
		
		return false;
	}

	public String getFechaCorta() {
		String dia = Integer.toString(this.dia);
		String mes = Integer.toString(this.mes);
		String anio = Integer.toString(this.anio);
		String fechaADevolver = "";
		dia = Utiles.LPAD(dia, 2, "0");
		mes = Utiles.LPAD(mes, 2, "0");
		if (this.anio == 1900 && this.dia == 1 && this.mes == 1)	
			fechaADevolver = dia+ "/" + mes + "/" +anio;
		else
			fechaADevolver = dia+ "/" + mes + "/" +anio.substring(2,anio.length());
		
		return fechaADevolver;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public boolean esMayorQue(Fecha fechaprueba) {
		if (anio < fechaprueba.getAnio())
			return true;
		else
			if(mes < fechaprueba.getMes())
				return true;
			else
				if(dia < fechaprueba.getDia())
					return true;
				
		return false;
	}	
	
	
	
}
