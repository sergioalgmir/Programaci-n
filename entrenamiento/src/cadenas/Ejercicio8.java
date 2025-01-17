package cadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 * 
 *         Programa que lee una frase y muestra todas sus palabras ordenadas de
 *         forma alfabética. Suponemos que cada palabra de la frase se separa de
 *         otra por un único espacio.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		String frase = sc.nextLine();
		while (validaEspacios(frase)) {
			System.out.println("Por favor, asegúrese de que solo hay un espacio entre cada palabra.");
			frase = sc.nextLine();
		}
		System.out.println(Arrays.toString(ordenaPalabras(frase)));

	}
	
	/**
	 * Lee una frase y ordena sus palabras alfabeticamente.
	 * @param frase
	 * @return Array con las palabras ordenadas alfabeticamente.
	 */

	public static String[] ordenaPalabras(String frase) {

		String[] arrayFrase = frase.split(" ");
		for (int i = 0; i < arrayFrase.length - 1; i++) {
			for (int j = i + 1; j < arrayFrase.length; j++) {
				if (arrayFrase[i].compareToIgnoreCase(arrayFrase[j]) > 0) {
					String temp = arrayFrase[i];
					arrayFrase[i] = arrayFrase[j];
					arrayFrase[j] = temp;
				}
			}
		}
		
//		Arrays.sort(arrayFrase); Usando Array.sort nos ahorramos todo lo demás.
		return arrayFrase;

	}

	/**
	 * Comprueba que no haya dos espacios en blanco seguidos.
	 * 
	 * @param frase
	 * @return <code>true</code> en caso de que no haya dos espacios seguidos y
	 *         <code>false</code> en caso contrario.
	 */
	public static boolean validaEspacios(String frase) {
		boolean valido = true;
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i)) && Character.isWhitespace(i + 1)) {
				valido = false;
			}
		}
		return valido;
	}
}
