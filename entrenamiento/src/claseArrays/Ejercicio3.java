package claseArrays;

import java.util.Arrays;

/**
 * Contiene void desordenar2  (int t[]), que modifica el método del ejercicio anterior para que la función 
 * no modifique el array que se pasa como parámetro y, 
 * en su lugar, cree y devuelva una copia del array donde se han desordenado los valores de los elementos.
 */

public class Ejercicio3 {
	
	/**
	 * Crea y devuelve una copia del array t, donde se han desordenado los valores de los elementos.
	 * @param t Array de enteros.
	 * @return Array copia de t, con los elementos desordenados.
	 */
	public static int[] desordenar2  (int t[]) {
		
		int [] nuevoArray = Arrays.copyOf(t, t.length);
		 for (int i = nuevoArray.length - 1; i > 0; i--) {
	            // Generamos un índice aleatorio entre 0 y i (inclusive)
	            int j = (int) (Math.random() * (i + 1));  // Math.random() genera un número entre 0 y 1, lo multiplicamos por (i+1) y lo convertimos a entero
	            
	            // Intercambiamos nuevoArray[i] con nuevoArray[j]
	            int temp = nuevoArray[i];
	            nuevoArray[i] = nuevoArray[j];
	            nuevoArray[j] = temp;
	            
		 }return nuevoArray;
	}
		 

}
