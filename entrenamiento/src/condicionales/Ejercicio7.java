package condicionales;
import java.util.Random;
import java.util.Scanner;

/**
 * Realiza el "juego de la suma", que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. 
 * La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.
 * 
 * @param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 * @param random - Crea un objeto de tipo random para generar números aleatorios.
 * @param random1 - Almacena un número aleatorio de tipo entero.
 * @param random2 - Almacena un número aleatorio de tipo entero.
 * @param suma - variable de tipo entero que almacena la suma de random1+random2.
 * @param resultado - variable de tipo int que almacena el resultado que el usuario introduce por pantalla.
 * 
 * 
 * @author Sergio Algarrada
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int random1 = random.nextInt(1, 100); //Crea número aleatorios entre 1 y 99.
		int random2 = random.nextInt(1, 100);
		int suma = random1+random2; // Aquí almacenamos el resultado correcto de la suma.
		System.out.println("Introduzca el resultado de sumar " + random1 + "+"+ random2);
		int resultado = sc.nextInt();
		if (resultado ==suma) { //Valoramos si el usuario ha introducido el resultado correcto.
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}sc.close();
		
		
	}

}
