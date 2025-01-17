package claseArrays;

import java.util.Scanner;

public class Ejercicio8 {
	
	/**
	 * 
	 * @param t matriz 4x 4 de números enteros.
	 * @return <code> true </code> si la matriz es mágica y <code> false en caso contrario</code>
	 */
	public static boolean matrizMagica(int[][]t) {
		boolean esMagica=false;
		
		//Guardamos en variables las sumas de los elementos de cada fila o columna.
		int fila0 = sumaFilasOColumnas(t[0]);
		int fila1 =sumaFilasOColumnas(t[1]);
		int fila2 =sumaFilasOColumnas(t[2]);
		int fila3 = sumaFilasOColumnas(t[3]);
		int columna0= Ejercicio8.sumaFilasOColumnas(Ejercicio8.referenciaColumna(t, 0));
		int columna1= Ejercicio8.sumaFilasOColumnas(Ejercicio8.referenciaColumna(t, 1));
		int columna2= Ejercicio8.sumaFilasOColumnas(Ejercicio8.referenciaColumna(t, 2));
		int columna3 = Ejercicio8.sumaFilasOColumnas(Ejercicio8.referenciaColumna(t, 0));
		
		if (fila0==fila1 && fila1==fila2 && fila1==fila3 && fila0==columna0 && fila0==columna1&&fila0==columna2
				&& fila0==columna3) { // Comprobamos si la suma de todas las filas y columnas son iguales.
			esMagica=true;
		}
		
		return esMagica;
		
		
	}
	
	
	/**
	 * Método auxiliar que pedirá al usuario mediante el Scanner que introduzca los valores de la matriz.
	 * @return matriz con los elementos introducidos por el usuario.
	 */
	
	public static int[][] pideMatriz(){
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4]; 
		for (int i =0; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length;j++) { 
				System.out.println("Introduzca el valor de esta posición:");
				matriz[i][j]= sc.nextInt();
			}
		}sc.close(); 
		return matriz;
		
	}
	
	/**
	 * Método auxiliar que suma los elementos de una fila o columna.
	 * @param t Array que contiene una fila o columna de una matriz.
	 * @return Suma de los elementos de esa fila o columna.
	 */
	private static int sumaFilasOColumnas (int[]s) {
		int suma = 0; //Recorremos el array 's' y sumamos sus elementos.
		for (int i = 0; i<s.length;i++ ) {
			suma+=s[i];
		}return suma;
	}
	
	/**
	 * Método que guarda en un array unidimensional los datos de una columna de una columna de una matriz.
	 * @param t Matriz.
	 * @param numColumna Índice de la columna que queremos guardar en el array.
	 * @return Array con los elementos de la columna <code>numColumna </code> de la matriz <code>t</code>.
	 */
	
	private static int[] referenciaColumna(int[][]t, int numColumna) {
		int[]columna = new int[t.length];
		for (int i=0; i<t.length; i++) { //Recorremos las filas y columnas de 't'.
			for (int j=0; j<t.length; j++) {
				columna[i]=t[i][numColumna]; //Guardamos en la posición 'i' el elemento correspondiente a la fila 'i' y a la columna 'numColumna' de 't'.
			}
		}return columna;
		
	}

}
