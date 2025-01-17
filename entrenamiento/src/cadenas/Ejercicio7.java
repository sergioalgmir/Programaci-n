package cadenas;

import java.util.Scanner;

/**
 * Implementa un sencillo editor de texto que, una vez que se ha introducido el
 * texto, permita reemplazar todas las ocurrencias de una palabra por otra.
 * 
 * @author Sergio Algarrada Miranda
 * 
 */

public class Ejercicio7 {

	public static void main(String[] args) {

		menu();

	}

	/**
	 * Ejecuta la interfaz y la lógica de la aplicación.
	 */

	public static void menu() {
		String opcion = "";

//		Ejecutamos el programa la primera vez.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el texto que quiere editar:");
		String texto = sc.nextLine();
		System.out.println("Introduzca la palabra que quiere sustituir:");
		String palabraVieja = sc.next();
		System.out.println("Introduzca la palabra por la cuál quiere reemplazar la palabra anterior:");
		String palabraNueva = sc.next();
		String nuevoTexto = reemplazador(texto, palabraVieja, palabraNueva);
		System.out.println(nuevoTexto);
		System.out.println();

//		Preguntamos que desea hacer ahora el usuario.

		do {
			System.out.println("¿Qué desea  hacer ahora?");
			System.out.println("Si quiere modificar otra palabra del texto actual, pulse 1.");
			System.out.println("Si desea introducir un nuevo texto, pulse 2.");
			System.out.println("Si desea salir del programa, pulse 3.");
//		Guardamos la opción escogida en una variable de tipo String para poder validarla.
			opcion = sc.next();

			while (validaOpcion(opcion) == false) {
				System.out.println("Introduzca una opción entre 1 y 3");
				opcion = sc.next();
			}

			switch (Integer.parseInt(opcion)) {
			case 1:
				System.out.println("Introduzca la palabra que quiere sustituir:");
				palabraVieja = sc.next();
				System.out.println("Introduzca la palabra por la cuál quiere reemplazar la palabra anterior:");
				palabraNueva = sc.next();
				nuevoTexto = reemplazador(nuevoTexto, palabraVieja, palabraNueva);
				System.out.println(nuevoTexto);
				System.out.println(" ");

				break;

			case 2:
				sc.nextLine();
				System.out.println("Introduzca el texto que quiere editar:");
				texto = sc.nextLine();
				System.out.println("Introduzca la palabra que quiere sustituir:");
				palabraVieja = sc.next();
				System.out.println("Introduzca la palabra por la cuál quiere reemplazar la palabra anterior:");
				palabraNueva = sc.next();
				nuevoTexto = reemplazador(texto, palabraVieja, palabraNueva);
				System.out.println(nuevoTexto);

				break;

			case 3:
				System.out.println("¡Gracias por usar nuestra aplicación!");
				System.exit(1);

			}

		} while (Integer.parseInt(opcion) != 3);

	}

	/**
	 * Reemplaza la palabra que queramos en el texto por otra nueva.
	 * 
	 * @param texto
	 * @param palabraVieja
	 * @param palabraNueva
	 * @return texto modificado
	 */
	public static String reemplazador(String texto, String palabraVieja, String palabraNueva) {

		return texto.toLowerCase().replaceAll(palabraVieja.toLowerCase(), palabraNueva.toLowerCase());
	}

	/**
	 * Valida que se introduzca un número entre 1 y 3.
	 * 
	 * @param opcion
	 * @return <code>true</code> en caso afirmativo y <code>false</code> en caso
	 *         contrario.
	 */
	public static boolean validaOpcion(String opcion) {
		boolean esValido = false;

		if (opcion.length() == 1 && Character.isDigit(opcion.charAt(0)) && Integer.parseInt(opcion) >= 1
				&& Integer.parseInt(opcion) <= 3) {
			esValido = true;
		}
		return esValido;
	}
}
