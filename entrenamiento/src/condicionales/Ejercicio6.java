package condicionales;
import java.util.Scanner;

/**
 * Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
 *
 * @param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 * @param numero - Variable de tipo double que recoge el número introducido por teclado.
 * @param valorAbs - Variable de tipo double que guarda el valor absoluto del número introducido por teclado.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número real:");
		double numero = sc.nextDouble();
		
		double valorAbs = numero<0 ? -numero:numero;
		System.out.println("El valor absoluto de " + numero + " es " + valorAbs);
		sc.close();

	}

}
