package poo_clases;

import java.util.Arrays;

/**
 * Se pide implementar la clase Conjunto utilizando una lista para almacenar números de tipo Integer. Implementa los siguientes métodos:

Un constructor sin parámetros.
int numeroElementos (): devuelve el número de elementos del conjunto.
boolean insertar (Integer nuevo): inserta un nuevo elemento en el conjunto.
boolean insertar (Conjunto otroConjunto): añade al conjunto los elementos del conjunto otroConjunto.
boolean eliminarElemento (Integer elemento): en caso de pertenecer al conjunto, elimina elemento.
boolean eliminarConjunto (Conjunto otroConjunto): elimina del conjunto invocante los elementos del conjunto que se pasa como parámetro.
boolean pertenece (Integer elemento): indica si el elemento que se le pasa como parámetro pertenece o no al conjunto.
muestra(): muestra el conjunto por consola
 */

public class Conjunto {
	
	private Integer [] conjunto = {7};
	
	
	public Conjunto() {
		
	}


	public Integer[] getConjunto() {
		return conjunto;
	}
	
	
	public int numeroElementos() {
		return conjunto.length;
	}
	
	public boolean insertar (Integer nuevo) {
		
		boolean modifica = true;
		for (int i=0; i<conjunto.length; i++) {  //Crear un booleano que detecte cambio
			if (nuevo==conjunto[i]) {
				modifica= false;
				break;
			
			}
		} 
		
		return modifica;
		
		
	}


	@Override
	public String toString() {
		return "Conjunto [conjunto=" + Arrays.toString(conjunto) + "]";
	}
	
	
	
	
	

}
