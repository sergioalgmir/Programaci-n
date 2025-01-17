package cadenas;

import java.util.Arrays;

import java.util.Scanner;

/**
 * @author Sergio Algarrada Miranda
 */

/**
 * Menú que permite al usuario guardar contactos y números de teléfono.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}

	// Guardamos los nombres en un array y los números en otro.
	// Declaramos las variables en el ámbito de la clase para poder modificarlas con
	// los métodos directamente sin tener que pasarlas como parámetros.

	static String[] nombres = new String[0];
	static int[] numeros = new int[0];

	// --------------------------------------------------------------------------------------------------------------
	// MÉTODOS PRINCIPALES

	/**
	 * Permite al usuario elegir entre las diferentes opciones a ejecutar
	 */
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		String opcion;

		do {

			System.out.println("Bienvenido a su agenda telefónica. ¿Qué acción desea realizar)");
			System.out.println("1 - Añadir un nuevo contacto.");
			System.out.println("2 - Buscar un número de contacto a partir de su nombre.");
			System.out.println("3 - Mostrar los contactos ordenados alfabeticamente por su nombre.");
			System.out.println("4 - Salir.");

			opcion = sc.next();

			while (opcionValida(opcion) == false) {
				System.out.println("Introduzca una opción entre 1 y 4:");

				opcion = sc.next();

			}

			// Mientras el usuario no pulse 4
			// Realizamos una acción en función del número introducido.
			switch (Integer.parseInt(opcion)) {

			case 1:
				añadirContacto();
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Introduzca el nombre del contacto que desea buscar:");
				String nombre = sc.next();
				System.out.println("El número de teléfono de " + nombre + " es: " + buscaNumero(nombre));
				System.out.println(" ");
				break;

			case 3:
				mostrarContactosOrdenados();
				System.out.println(" ");

			}
		} while (!opcion.equals("4"));

		if (opcion.equals("4")) { // Si el usuario escoge 4, finaliza la aplicación.
			System.out.println("Gracias por usar nuestra aplicación. ¡Nos vemos pronto!");
			System.exit(1);
		}

	}

	/**
	 * Actualiza los arrays <code>nombres</code> y <code>numeros</code> iniciales y
	 * aumenta su tamaño en una posición. Lee mediante Scaner un nombre y un número
	 * y los añade a la última posición del array correspondiente.
	 */

	public static void añadirContacto() {
		int numContactos = nombres.length;// Creamos esta variable para actualizar el tamaño del array.
		numContactos++; //
		Scanner sc = new Scanner(System.in);
		String nuevoNombre;
		String nuevoNumero; // Se declara para leer desde el escaner
		int nuevoNumeroEntero; // Guarda el número entero una vez validado.
		System.out.println("Introduzca el nombre del contacto:");
		nuevoNombre = sc.nextLine(); // Permitimos que el nombre de contacto pueda estar formado por varias palabras.

		System.out.println("Introduzca el número de teléfono del contacto:");
		nuevoNumero = sc.next();

		// Validamos que el número tenga 9 dígitos y que no contenga carácteres que no
		// sean dígitos.
		while (esSoloNumeros(nuevoNumero) == false || nuevoNumero.length() != 9) {

			System.out.println("Introduzca el número de teléfono del contacto. Debe estar formado por 9 dígitos:");
			nuevoNumero = sc.next();

		}

		// Convertimos el número a int.
		nuevoNumeroEntero = Integer.parseInt(nuevoNumero);

		// Creamos una copia de cada array con una posición más.
		nombres = Arrays.copyOf(nombres, numContactos);
		numeros = Arrays.copyOf(numeros, numContactos);
		// Guardamos en la última posición de cada array el nuevo nombre y el nuevo
		// número.
		nombres[numContactos - 1] = nuevoNombre;
		numeros[numContactos - 1] = nuevoNumeroEntero;

	}

	/**
	 * Método al cual se le pasa un nombre mediante scanner y devuelve el número de
	 * teléfono del contacto guardado con ese nombre.
	 * 
	 * @param nombre nombre del contacto del que queremos saber su número.
	 * @return número de teléfono del contacto pasado mediante scanner.
	 */

	public static int buscaNumero(String nombre) {
		int numero = 0;
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equals(nombre)) {
				numero = numeros[i];
			}
		}

		return numero;
	}

	/**
	 * Crea un array bidimensional [nombre, número] ordenado alfabeticamente por el
	 * nombre.
	 * 
	 * @return array de arrays [nombre, número]
	 */

	public static String[][] listaOrdenada() {
		// Creamos una lista de contactos como un array de arrays de dos elementos
		// [nombre, número]
		String[][] contactos = new String[nombres.length][2];

		// Rellenamos el array de contactos con los nombres y números
		for (int i = 0; i < nombres.length; i++) {
			contactos[i][0] = nombres[i];
			contactos[i][1] = String.valueOf(numeros[i]);
		}

		// Ordenamos el array de contactos alfabéticamente por el nombre (primer campo)
		for (int i = 0; i < contactos.length - 1; i++) {
			for (int j = i + 1; j < contactos.length; j++) {
				if (contactos[i][0].compareTo(contactos[j][0]) > 0) {
					// Intercambiar las posiciones si el nombre en i es mayor que el nombre en j
					String[] temp = contactos[i];
					contactos[i] = contactos[j];
					contactos[j] = temp;
				}
			}
		}

		return contactos;

	}

	// -----------------------------------------------------------------------------------------------------------
	// MÉTODOS AUXILIARES

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
			if (entero >= 1 && entero <= 4) { // Validamos que se introduzca un número del 1 al 4
				valido = true;
			}
		}

		return valido;

	}

	/**
	 * Imprime por pantalla los elementos de un array.
	 */
	public static void mostrarContactosOrdenados() {
		String[][] contactosOrdenados = listaOrdenada();

		// Imprimir los contactos ordenados
		for (int i = 0; i < contactosOrdenados.length; i++) {
			System.out.println("Nombre: " + contactosOrdenados[i][0] + ", Teléfono: " + contactosOrdenados[i][1]);
		}
	}

}
