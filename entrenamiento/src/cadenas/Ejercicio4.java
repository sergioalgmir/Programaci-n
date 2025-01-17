package cadenas;

import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 * 
 *         Lee una palabra o frase y muestra el proceso en el que cada letra se
 *         sustituye por otro símbolo no alfabético.
 */
public class Ejercicio4 {

	/**
	 * Método principal. Implementa un menú que permite escoger entre editar una
	 * frase nueva, volver a editar la misma frase o salir del programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// La primera vez obligamos a introducir una nueva frase.
		Scanner sc = new Scanner(System.in);
		String opcion;

		System.out.println("Introduzca la frase que quiere modificar:");
		String frase = sc.nextLine().toLowerCase();

		System.out.println("Introduzca la letra que desea modificar: ");
		char letra = introduceLetra();

		System.out.println("Introduzca el carácter por el que quieres sustituir la letra " + letra);

		char simbolo = introduceSimbolo();

		String nuevaFrase = reemplazaLetras(frase, letra, simbolo);

		System.out.println(nuevaFrase);
		System.out.println(" ");
		do {

			System.out.println("¿Qué desea hacer ahora?");
			System.out.println("Pulse 1 si desea reemplazar otra letra en la misma frase.");
			System.out.println("Pulse 2 si desea modificar otra frase diferente.");
			System.out.println("Pulse 3 si desea salir del programa.");
			opcion = sc.next();

			while (opcionValida(opcion) == false) {
				System.out.println("Introduzca una opción entre 1 y 3:");

				opcion = sc.next();

			}

			switch (Integer.parseInt(opcion)) {
			case 1:

				System.out.println("Introduzca la letra que desea modificar: ");
				letra = introduceLetra();

				System.out.println("Introduzca el carácter por el que quieres sustituir la letra " + letra);

				simbolo = introduceSimbolo();

				nuevaFrase = reemplazaLetras(nuevaFrase, letra, simbolo);

				System.out.println(nuevaFrase);
				System.out.println(" ");

				break;

			case 2:
				System.out.println("Introduzca la frase que quiere modificar:");
				frase = sc.nextLine().toLowerCase();

				System.out.println("Introduzca la letra que desea modificar: ");
				letra = introduceLetra();

				System.out.println("Introduzca el carácter por el que quieres sustituir la letra " + letra);

				simbolo = introduceSimbolo();

				nuevaFrase = reemplazaLetras(frase, letra, simbolo);

				System.out.println(nuevaFrase);
				System.out.println(" ");
				break;

			}
		} while (!opcion.equals("3"));

		if (opcion.equals("3")) { // Si el usuario escoge 4, finaliza la aplicación.
			System.out.println("Gracias por usar nuestra aplicación. ¡Nos vemos pronto!");
			System.exit(1);
		}

	}

	/**
	 * Sustituye en la frase introducida, la letra indicada por el símbolo que se
	 * pasa como parámetro.
	 * 
	 * @param frase   Frase la cual se quiere modificar.
	 * @param letra   Letra que se quiere sustituir en la frase.
	 * @param simbolo Carácter por el cual se quiere reemplazar la letra escogida.
	 * @return Frase modificada.
	 */

	public static String reemplazaLetras(String frase, char letra, char simbolo) {

		return frase.replace(letra, simbolo);

	}

	/**
	 * Lee la letra que el usuario introduce por teclado y valida si es una única
	 * letra.
	 * 
	 * @return letra introducida por el usuario.
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
	 * Lee el símbolo que el usuario introduce por teclado y valida que es un único
	 * carácter y que no es alfanumérico.
	 * 
	 * @return símbolo introducido por el usuario.
	 */

	public static char introduceSimbolo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un símbolo:");
		String letra = sc.next().toLowerCase(); // Convertimos todas las letras a minúsculas para que no discrimine
												// mayúsculas o minúsculas.
		while (letra.length() != 1 || Character.isLetter(letra.charAt(0)) || Character.isDigit(letra.charAt(0))) {
			System.out.println("Por favor, introduzca sólo un símbolo no alfanumérico:");
			letra = sc.next().toLowerCase();
		}
		char letraValida = letra.charAt(0); // Declaramos dos variables distintas para que funcione bien el bucle while.

		return letraValida;
	}

	/**
	 * Comprueba que la cadena <code> numero </code> está compuesta solo por
	 * dígitos.
	 * 
	 * @param numero cadena introducida por el usuario.
	 * @return <code>true</code> si está compuesta solo por dígitos o
	 *         <code>false</code> en caso contrario.
	 */

	private static boolean esSoloNumeros(String numero) {
		boolean esNumero = true;
		for (int i = 0; i < numero.length(); i++) {
			if (Character.isDigit(numero.charAt(i)) == false) {
				esNumero = false;
				break;
			}
		}
		return esNumero;
	}

	/**
	 * Valida que la opcion introducida por el usuario es un número entre 1 y 4.
	 * 
	 * @param numero texto introducido por el usuario a través de scanner.
	 * @return <code>true</code> en caso afirmativo y <code>false</code> en caso
	 *         contrario.
	 */
	public static boolean opcionValida(String numero) {

		boolean valido = false;

		if (esSoloNumeros(numero) == true) {
			int entero = Integer.parseInt(numero);
			if (entero >= 1 && entero <= 3) { // Validamos que se introduzca un número del 1 al 4
				valido = true;
			}
		}

		return valido;

	}
}
