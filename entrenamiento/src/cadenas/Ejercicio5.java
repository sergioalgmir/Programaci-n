package cadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 * 
 *         Convierte una palabra en secuencias de n letras.
 */

public class Ejercicio5 {
	/**
	 * Método principal que ejecuta el programa.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la palabra que quiere secuenciar:");
		String palabra = sc.next();
		System.out.println("Introduzca el número de letras que quiere que contenga cada secuencia:");
		String n = sc.next();

		// Validamos que n sea un número y que entre en el rango permitido.
		while (numeroValido(palabra, n) == false) {
			System.out.println(
					"Por favor, introduzca un número mayor que 0 y menor o igual que el tamaño de la palabra:");
			n = sc.next();
		}
		
	

		System.out.println(Arrays.toString(secuenciador(palabra, Integer.parseInt(n))));
	}

	/**
	 * Devuelve un array con una palabra dividida en secuencias de n letras.
	 * 
	 * @param palabra palabra que se quiere secuenciar.
	 * @param n       número de letras que debe tener cada secuencia.
	 * @return Array con las secuencias de letras.
	 */

	public static String[] secuenciador(String palabra, int n) {
		String[] secuencias = new String[0];

		// Actualizamos el tamaño del array según el valor de 'palabra.length%n'.

		if (palabra.length() % n == 0) {
			secuencias = Arrays.copyOf(secuencias, palabra.length() / n);
			int x = 0; // Inicio de la subcadena.
			int y = n; // Fin de la subcadena
			for (int i = 0; i < secuencias.length; i++) {
				secuencias[i] = palabra.substring(x, y);
				x += n;
				y += n;
			}

		} else {
			secuencias = Arrays.copyOf(secuencias, (palabra.length() / n) + 1);
			// 'x' e 'y' son variables que se actualizaran en el bucle para poder actualizar
			// los límites de la subcadena en cada iteración.
			int x = 0; // Inicio de la subcadena.
			int y = n; // Fin de la subcadena

			// En el bucle recorremos 'i' 'palabras.lenght/n' veces.
			for (int i = 0; i < secuencias.length - 1; i++) {
				secuencias[i] = palabra.substring(x, y);
				x += n;
				y += n;

			}
			// Para la última posición del array, los límites de la cadena son 'x' y 'x + el
			// resto de la división'
			secuencias[secuencias.length - 1] = palabra.substring(x, x + (palabra.length() % n));
		}

		return secuencias;
	}

	/**
	 * Comprueba que el usuario introduzca un número mayor que 0 y menor o igual que
	 * el tamaño de la palabra.
	 * 
	 * @param palabra palabra que se quiere secuenciar.
	 * @param n cadena a comprobar si es un número válido.
	 * @return <code>true</code> si el número es válido y <code>false</code> en caso
	 *         contrario.
	 */
	public static boolean numeroValido(String palabra, String n) {

		boolean esNumero = true;

		for (int i = 0; i < n.length(); i++) { // Comprobamos si todos los caracteres son numéricos.
			if (!Character.isDigit(n.charAt(i))) {
				esNumero = false;
				break;

			}
		}
		// Comprobamos si el número se encuentra en el rango deseado.
		return esNumero && Integer.parseInt(n) > 0 && Integer.parseInt(n) <= palabra.length();
	}

}
