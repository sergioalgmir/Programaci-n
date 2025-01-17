package secuenciales;
import java.util.Scanner;

/**
 * Crea un programa que pida la base y la altura de un triángulo y muestre su área. Área triángulo = base * altura/2
 *
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la base del triángulo en metros:");
		double base = sc.nextDouble();
		System.out.println("Introduzca la altura del triángulo en metros:");
		double altura = sc.nextDouble();
		System.out.println("El área del triángulo es " + (base*altura/2) + " metros cuadrados.");
		sc.close();

	}

}
