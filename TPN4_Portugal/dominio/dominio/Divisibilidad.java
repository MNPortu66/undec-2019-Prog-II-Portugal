package dominio;
import java.lang.Math;
public class Divisibilidad {
	
	public static boolean esDivisiblePorDos(int numero) {
		int ultimaCifra = 0;
		ultimaCifra = separarNumeroEnCifras(numero);
		if ((ultimaCifra % 2) == 0) {
			return (true);
		}else {
			return (false);
		}
	}
	public static boolean esDivisiblePorTres(int numero) {

		if (devolverSuma(numero) % 3 == 0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorCuatro(int numero) {
		int numero1=0, numero2=0, numero3=0;
		numero1 = separarNumeroEnCifras(numero);
		numero2 = separarNumeroEnCifras(numero/10);
		if (numero1 == 0 && numero2 == 0) {
			return true;
		}
		//realizo estas operaciones fuera del if para que quede mas legible.
		numero3 = (numero2 * 10) + numero1;
		if (numero3 % 4 == 0) {
				return true;
			}
		numero3 = (numero2 * 2) + numero1;
		if (numero3 % 4 == 0) {
			return true;
		}
		return false;
	}
	public static boolean esDivisiblePorCinco(int numero) {
		int numero1 = separarNumeroEnCifras(numero);
		if (numero1 == 5 || numero1 == 0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorSeis(int numero) {
		if (esDivisiblePorDos(numero) && esDivisiblePorTres(numero) )
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorSiete(int numero) {
		int numero2=0, diferencia=0;
		while (numero > 0) {
			numero2 = (separarNumeroEnCifras(numero)) * 2;
			numero /=10;
			diferencia = numero - numero2;
			diferencia = Math.abs(diferencia);
			if (diferencia == 0 || diferencia%7 == 0) {
				return true;
			}
		}
		return false;	
	}
	public static boolean esDivisiblePorOcho(int numero) {
		int numero1=0, numero2=0, numero3=0;
		numero1 = separarNumeroEnCifras(numero);
		numero /= 10;
		numero2 = separarNumeroEnCifras(numero);
		numero /= 10;
		numero3 = separarNumeroEnCifras(numero);
		int numero4 = numero1 + (numero2*10) + (numero3*100);
		if (numero4 == 0 || numero4%8 == 0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorNueve(int numero) {
		if (devolverSuma(numero) % 9 == 0)
			return true;
		else
			return false;

	}
	public static boolean esDivisiblePorDiez(int numero) {
		if (separarNumeroEnCifras(numero) == 0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorOnce(int numero) {
		int suma1 = 0, suma2 = 0;
		int tam = (int) Math.log10(numero);
		
		for (int i = 0; i<tam+1; i++) {
			if (i%2 == 0)
				suma1 += separarNumeroEnCifras(numero);
			else
				suma2 += separarNumeroEnCifras(numero);
			numero /= 10;
			
		}
		int diferencia = suma1 - suma2;
		Math.abs(diferencia);
		if (diferencia == 0 || diferencia %11 == 0)
			return true;
		else 
			return false;
	}	
	public static int separarNumeroEnCifras(int numero) {
		return (numero % 10);
	}
	public static int devolverSuma (int numero) {
		int suma=0;
		while (numero != 0) {
			suma += separarNumeroEnCifras(numero);
			numero /= 10;
		}
		return suma;
	}
	
}
