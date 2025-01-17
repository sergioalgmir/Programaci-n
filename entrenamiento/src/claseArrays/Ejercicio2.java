package claseArrays;

/**
 * Contiene el método void desordenar (int t[]), que cambia de forma aleatoria los elementos contenidos en el array t. 
 * Si el array estuviera ordenado, dejaría de estarlo.
 */

public class Ejercicio2 {
	/**
	 * Cambia de forma aleatoria los elementos contenidos en el array t.
	 * @param t Array de enteros.
	 */
	
	public static void desordenar (int t[]) {
		
		   // Recorremos el array desde el último elemento hasta el segundo
        for (int i = t.length - 1; i > 0; i--) {
            // Generamos un índice aleatorio entre 0 y i (inclusive)
            int j = (int) (Math.random() * (i + 1));  // Math.random() genera un número entre 0 y 1, lo multiplicamos por (i+1) y lo convertimos a entero
            
            // Intercambiamos t[i] con t[j]
            int temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
	}

}
