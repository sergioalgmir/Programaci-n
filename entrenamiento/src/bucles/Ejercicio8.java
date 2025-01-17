package bucles;
import java.util.Scanner;

/**
 * Implementa un algoritmo que calcule el mínimo común múltiplo de dos números dados
 * 
 * @param a - Guarda el primer número que introduce el usuario.
 * @param b - Guarda el segundo número que introduce el usuario.
 * @param multiplicador - variable int que usaremos para buscar los números de a uno a uno.
 * @param variable tipo int que almacenará el mínimo común múltiplo de a y b.
 * 
 * @author Sergio
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Esta aplicación calcula el mínimo común múltiplo de dos números.");
		System.out.println("Introduzca el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int b = sc.nextInt();
		

		 int multiplicador = 1;
	     int mcm = 0;

	        // Buscamos el MCM
	        while (true) { //No saldremos del bucle hasta que una condición break lo indique.
	            mcm = a * multiplicador; // Calcular un múltiplo de a
	            if (mcm % b == 0) { // Comprobar si es múltiplo de b. Si lo es, este múltiplo es el mcm y salimos del bucle.
	                break; // 
	            }
	            multiplicador++; // Si no, incrementar el multiplicador y buscar el siguiente múltiplo de a.
				
		
		

		
	        } System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es "+ mcm);
	        sc.close();
	}

}
