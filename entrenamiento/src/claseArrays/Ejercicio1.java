package claseArrays;

public class Ejercicio1 {
	/**
	 * Crea y devuelve un array con todos los índices de los elementos donde se encuentra la clave de búsqueda. 
	 * En el caso de que clave no se encuentre en el array t, la función devolverá un array vacío.
	 * 
	 * @param t array de números entero.
	 * @param clave entero que se quiere comprobar si está en <code>t</code>.
	 * @return array de enteros que contiene los índices en los que <code>clave</code> se encuentra en <code>t</code>.
	 */
	public static int[] buscarTodos (int t[], int clave) {
		int longitud=0;
		for (int i=0; i<t.length; i++) { // Compruebo el número de veces que 'clave' está en 't'. Será la dimensión del array 'índices'.
			
			if(t[i]==clave) {
				longitud ++;
			}
		}	
		int [] indices = new int[longitud];
		
		for (int j=0; j<indices.length; j++) { // Recorro 'índices'
			for (int i=0; i<t.length; i++) { // Para cada posición de 'índices', recorro 't' entero y compruebo en qúe posición de t se encuentra 'clave'.
				if(t[i]==clave) {  
					indices[j]=i; //Guardo el índice de 'clave' en 't' en la posición de 'índices' y aumento 'j' para saltar a la siguiente posición en 'índices' y volver a realizar el mismo proceso.
					j++;
					
				}
		}
		}return indices;
	}
	

}
