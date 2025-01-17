package cadenas;

import java.util.Arrays;
import java.util.Scanner;

//FALTA HACER EL JAVADOC Y COMENTAR CODIGO
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		introducePalabra();//Pedimos al jugador 1 que introduzca la palabra a adivinar.
//		imprimeLineas(14);
//		System.out.println("hasta aquí de momento");
		String palabra = introducePalabra();

		ahorcado(palabra);
	}

	/**
	 * Pide al jugador 1 que introduzca la palabra que tendrá que adivinar el
	 * jugador 2.
	 * 
	 * @return palabra a adivinar.
	 */
	public static String introducePalabra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la palabra a adivinar:");
		String palabra = sc.next().toLowerCase(); // Convertimos todas las letras a minúsculas para que no discrimine
													// mayúsculas o minúsculas.
		return palabra;

	}

	/**
	 * Imprime las líneas en blanco necesarias para que el jugador 2 no vea lo que
	 * ha escrito el jugador 1.
	 * 
	 * @param numLineas cantidad de líneas en blanco que queremos imprimir.
	 */
	public static void imprimeLineas(int numLineas) {
		for (int i = 0; i <= numLineas; i++) {
			System.out.println("");
		}
	}

	/**
	 * Recorre
	 * 
	 * @param palabra
	 * @return
	 */
	public static void ahorcado(String palabra) {
		int intentos = 8;
		char[] adivinando = new char[palabra.length()]; // Creamos un array del tamaño de la palabra a adivinar.
		Arrays.fill(adivinando, '_');
		; // Rellenamos el array con guiones.
		System.out.println(Arrays.toString(adivinando));
		dibujarAhorcado(intentos);
		while (!String.valueOf(adivinando).equals(palabra) && intentos != 0) { // Introducimos letras mientras la
																				// palabra y el array no sean iguales.
			String comparador = String.valueOf(adivinando);
			char letra = introduceLetra();
			for (int i = 0; i < palabra.length(); i++) {// Recorremos todas las letras de la palabra introducida por
														// usuario 1.
				if (letra == palabra.charAt(i)) {
					adivinando[i] = letra; // Si la letra introducida coincide se añade en el i-ésimo carácter a la
											// pista.
				}
			}
			if (comparador.equals(String.valueOf(adivinando))) {
				intentos--;
				dibujarAhorcado(intentos);
				System.out.println("Has fallado. Te quedan " + intentos + " intentos.");
			}

			System.out.println(Arrays.toString(adivinando)); // Imprimimos el estado actual del array mientras antes de
																// introducir la siguiente letra.
			System.out.println(" ");
		}
		if (intentos == 0) {
			System.out.println("Mala suerte, has perdido. La palabra era " + palabra);
		} else {
			System.out.println("¡Enhorabuena, has acertado!");
		}

	}

	/**
	 * Lee la letra que el usuario introduce por teclado y valida si es una única
	 * letra.
	 * 
	 * @return letra introducida por el usuario 2.
	 */
	public static char introduceLetra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una letra:");
		String letra = sc.next().toLowerCase(); // Convertimos todas las letras a minúsculas para que no discrimine
												// mayúsculas o minúsculas.
		while (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
			System.out.println("Por favor, introduzca sólo una letra:");
			letra = sc.next().toLowerCase();
		}
		char letraValida = letra.charAt(0); // Declaramos dos variables distintas para que funcione bien el bucle while.
		return letraValida;
	}

	/**
	 * Imprime el dibujo del ahorcado según el número de intentos restantes.
	 * 
	 * @param intentos intentos restantes.
	 */
	public static void dibujarAhorcado(int intentos) {
		switch (intentos) {
		case 8:
			System.out.println("_____________");
			System.out.println("|/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 7:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 6:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 5:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 4:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 3:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|          /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 2:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|          /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 1:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|          /|\\");
			System.out.println("|          / ");
			System.out.println("|");
			System.out.println("|_____________");
			break;
		case 0:
			System.out.println("_____________");
			System.out.println("|/          |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|          /|\\");
			System.out.println("|          / \\");
			System.out.println("|");
			System.out.println("|_____________");

			break;
		}
	}

}
