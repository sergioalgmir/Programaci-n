package claseArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 * 
 * 
 * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar 
 * encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio.

Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. 
Para finalizar la entrada de datos, introduce un sueldo con valor -1.

Una vez terminada la entrada de datos, muestra la siguiente información:


Todos los sueldos introducidos ordenados de forma decreciente.
El sueldo máximo y mínimo.
La media de los sueldos.

Contiene los métodos <code> double[] leeSueldos </code>, <code> sueldoMinimo (double[] listaSueldos)</code>,
<code>sueldoMaximo (double[] listaSueldos)</code> y <code>mediaSueldos (double[] listaSueldos)</code>.
 */



public class Ejercicio4 {
	
	/**
	 * Lee los salarios introducidos por teclado y los almacena en un array de doubles. Para finalizar la entrada de datos, se introduce un sueldo con valor -1.
	 * @return Array ordenado de forma descendente con los salarios introducidos.
	 */
	
	public static double [] leeSueldos(){
		//Creación de variables:
		Scanner sc = new Scanner(System.in);
		int numeroDatos=1; // Contador que nos va a indicar el tamaño del array. Se inicializa en 1 para que el array pueda almacenar el primer dato y no se salga de rango.
		double sueldo = 0;
		double [] listaSueldos = new double [numeroDatos];
		
		//Lectura de datos por teclado:
		do {
			System.out.println("Introduzca su salario:"); 
			sueldo = sc.nextDouble(); // Recogemos un salario introducido por teclado.
			listaSueldos[numeroDatos-1]=sueldo; // Guardamos el salario en la posición correspondiente del array.
			numeroDatos++; // Incrementamos numeroDatos para poder aumentar el tamaño del array.
			listaSueldos= Arrays.copyOf(listaSueldos, numeroDatos); // Creamos una copia del array anterior con un tamaño incrementado en una unidad.
		
		} while(sueldo != -1); //Si introducimos '-1', salimos del bucle
		listaSueldos=Arrays.copyOf(listaSueldos, numeroDatos-2); // Eliminamos el '-1' del array.
		
		//Ordenación de datos:
		Arrays.sort(listaSueldos); //Ordenamos los datos del array de forma ascendente.
		for (int i=0; i<listaSueldos.length/2;i++ ) { //Recorremos el array hasta la mitad e intercambiamos las posiciones de los datos.
			double temp = listaSueldos[i]; //Almacenamos en 'temp' el valor actual de 'i'
			listaSueldos[i]= listaSueldos[listaSueldos.length-1-i]; //Intercambiamos el valor de 'i' con el de su posición simétrica.
			listaSueldos[listaSueldos.length-1-i] = temp; // Actualizamos el valor de la posición simétrica con el valor anterior de 'i' que habíamos guardado en 'temp'.
			
		}sc.close();
		
		return listaSueldos;
	}
	
	
	/**
	 * Devuelve el sueldo máximo de los encuestados
	 * @param listaSueldos Array de double que guarda los sueldos de los encuestados. Ya lo hemos ordenado previamente en el método <code>leeSueldos</code>.
	 * @return El sueldo máximo.
	 */
		public static double sueldoMaximo (double[] listaSueldos) {
			return listaSueldos[0]; // Al estar el array ordenado previamente de forma decreciente, el sueldo máximo se encuentra en la primera posición.
		}
		
	
		/**
		 * Devuelve el sueldo mínimo de los encuestados
		 * @param listaSueldos Array de double que guarda los sueldos de los encuestados. Ya lo hemos ordenado previamente en el método <code>leeSueldos</code>.
		 * @return El sueldo mínimo.
		 */
		public static double sueldoMinimo (double[] listaSueldos) {
				return listaSueldos[listaSueldos.length-1]; // Al estar el array ordenado previamente de forma decreciente, el sueldo mínimo se encuentra en la última posición.
		}
	
		public static double mediaSueldos(double[]listaSueldos) {
			double total=0; // Almacena la suma total de todos los salarios.
			for (int i =0; i<listaSueldos.length; i++) { //Recorremos el array y sumamos todos los sueldos en la variable 'total'.
				total+=listaSueldos[i];
			} return (double) total/listaSueldos.length; //Calculamos la media.
		}
	
	

}
