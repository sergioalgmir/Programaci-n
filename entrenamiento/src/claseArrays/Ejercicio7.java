package claseArrays;

import java.util.Arrays;

public class Ejercicio7 {
	
	/**
	 * Crea y devuelve un array con la suma de los numElementos consecutivos de t.
	 * @param t Array de números enteros.
	 * @param numElementos Numero de elementos consecutivos que queremos agrupar.
	 * @return Array con la suma de los numElementos consecutivos de t.
	 */
	public static int[]suma (int t[], int numElementos) {
		int[] arrayAgrupado = new int [t.length-numElementos+1]; //Array que va a contener la suma de los elementos consecutivos. Tiene esa longitud ya que responde siempre al mismo patrón.
		for(int i=0; i<arrayAgrupado.length;i++) {
			arrayAgrupado[i]= sumador(t, i, i+numElementos); //Para cada posición del nuevo array, el valor será el devuelto por el método 'sumador'.
		}
		
		return arrayAgrupado;
	}
	
	
	/**
	 * Método auxiliar que suma los elementos de <code> t</code> que se encuentran entre <code> primero </code> y <code> ultimo</code>.
	 * @param t Array de enteros. Es el mismo que le pasamos al método principal.
	 * @param primero Primera posición de los elementos que agrupamos.
	 * @param ultimo Última posición de los elementos que agrupamos.
	 * @return Suma de la agrupación de elementos.
	 */
	
	private static int sumador (int t [], int primero, int ultimo) {
		
		int suma = 0; 
		int [] copia = Arrays.copyOfRange(t, primero, ultimo); //Creamos una copia de 't' que contenga los elementos que queremos agrupar.
		for (int i = 0; i<copia.length; i++) { //Recorremos el array, sumamos todos sus valores y los guardamos en la variable suma.
			suma +=copia[i];
		}
		return suma;
			
		
		
	}
		
	
	
}
