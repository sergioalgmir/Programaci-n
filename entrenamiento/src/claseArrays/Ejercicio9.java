package claseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
	
/**
 * @author Sergio Algarrada Miranda
 * 
 *Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera.
 *En la aplicación se introduce el número de dorsal de cada corredor cuando este llega a la meta. 
 *Para indicar que la carrera ha finalizado (han llegado todos los corredores a la meta), se introduce como dorsal el número -1.
 *A continuación, la aplicación solicita información extra de los corredores.
 *Se introducen los dorsales de todos los corredores menores de edad;  se les avanza un puesto en el ranking general de la carrera.
 *Se introducen los dorsales de los corredores que han dado positivo en el test antidopaje, lo que provoca su expulsión inmediata.
 *Se introducen los dorsales de los corredores que no han pagado su inscripción en la carrera,
 *lo que provoca que se releguen a los últimos puestos del ranking general.
 *La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce.
 *
 */
		
		
		public static int[] intercambiadorContiguo (int[]lista, int posicion) {
			
			int temp = lista[posicion-1];
			lista[posicion-1]= lista[posicion];
			lista[posicion]=temp;
			return lista;
			
		}
		
		
		public static int[] intercambiadorNoContiguo(int[]lista, int posicion) {
			   // Guardar el valor en la posición dada
	        int temp = lista[posicion];

	        // Mover los elementos hacia la izquierda
	        for (int i = posicion; i < lista.length - 1; i++) {
	            lista[i] = lista[i + 1];
	        }

	        // Colocar el valor al final
	        lista[lista.length - 1] = temp;
	    
			return lista;
			
		}
		
		

}
