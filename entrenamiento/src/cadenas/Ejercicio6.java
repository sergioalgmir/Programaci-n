package cadenas;

import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 * 
 *         Escribe una aplicación que convierte una frase (que puede estar
 *         escrita con cualquier combinación de mayúsculas y minúsculas) en el
 *         nombre de una variable que utilice la nomenclatura Camel.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la frase que quiera convertir a nomenclatura camel:");
		String frase = sc.nextLine();
		
		while(compruebaEspacios(frase)==false) {
			System.out.println("Por favor, asegúrese de que entre palabra y palabra solo hay un espacio:");
			frase= sc.nextLine();
		}
		
		System.out.println(convierteACamel(frase));

	}

	/**
	 * Convierte una frase en el nombre de una variable que utilice la nomenclatura
	 * Camel.
	 * 
	 * @param frase frase que queremos convertir.
	 * @return variable en nomenclatura Camel.
	 */

	public static String convierteACamel(String frase) {
		// Separamos las palabras y las almacenamos en un array.
		String[] arrayPalabras = frase.split(" ");
		// Creamos una variable tipo cadena en la que se almacenrá la frase final
		// convertida a Camel.
		String fraseCamel = "";

		// Convertimos todas las palabras a minúscula.
		for (int i = 0; i < arrayPalabras.length; i++) {
			arrayPalabras[i] = arrayPalabras[i].toLowerCase();
		}

		// Convertimos a mayúscula la primera letra de cada palabra.
		for (int i = 0; i < arrayPalabras.length; i++) {
			String palabra = arrayPalabras[i];

			arrayPalabras[i] = palabra.replace(palabra.charAt(0), Character.toUpperCase(palabra.charAt(0)));

		}

		// Concatenamos las palabras en una sola.
		for (int i = 0; i < arrayPalabras.length; i++) {
			fraseCamel += arrayPalabras[i];
		}

		return fraseCamel;

	}

	/**
	 * Comprueba que entre palabra y palabra solo haya un espacio en blanco.
	 * 
	 * @param frase frase que introduce el usuario.
	 * @return <code>true</code> si no hay dobles espacios y <code>false</code> en
	 *         caso contrario.
	 */
	public static boolean compruebaEspacios(String frase) {

		boolean validez = true;
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i)) && Character.isWhitespace(frase.charAt(i + 1))) {
				validez = false;
				break;
			}
		}
		return validez;

	}

}
