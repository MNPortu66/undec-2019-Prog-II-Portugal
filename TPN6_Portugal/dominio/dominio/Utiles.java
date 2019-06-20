package dominio;

public class Utiles {
	public static String LPAD(String cadena, int cantDigitos, String caracter) {
		String salida=cadena;
		for (int i = 1; i <= cantDigitos-cadena.length(); i++) 
			salida=caracter+salida;
		return salida;
	}
	
	public static String LPAD(int cadena, int cantDigitos, String caracter) {
		return LPAD(String.valueOf(cadena),cantDigitos,caracter);
	}
	
	public static String LPAD(int cadena, int cantDigitos) {
		return LPAD(cadena,cantDigitos,"0");
	}
	
	public static String imprimirArray(int [] A) {
		String salida="{";
		for (int i = 0; i < A.length; i++)
			salida+=A[i]+",";
		return salida.substring(0, salida.length()-1)+"};";
	}
	
	public static String imprimirMatriz(int [] [] A) {
		String salida="{";
		for (int i = 0; i < A.length; i++) {
			salida+="{";
			for (int j = 0; j < A[i].length; j++) {
				salida+=A[i][j]+",";
			}
			salida=salida.substring(0, salida.length()-1)+"},";
		}
		return salida+"};";
	} 
	
	public static int [] generarArray() {
		int tamanio = 1+(int)(Math.random()*100);
		int A[] = new int [tamanio];
		for (int i = 0; i < A.length; i++) {
			A[i]=(int) (Math.random()*100);
		}
		return A;
	}
	
	public static int [] [] generarMatriz(int n) {
		int f = 1+1+(int)(Math.random()*20);
		int c = f+(int)(Math.random()*30);
		int A[][] = new int [f][c];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j]=(int) (Math.random()*100);
			}
		}
		return A;
	}

	
	
}
