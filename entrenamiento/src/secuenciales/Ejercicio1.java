package secuenciales;
import java.util.Scanner;

public class Ejercicio1 {
	
/**Diseñar un programa que pida un número al usuario (por teclado) y a continuación lo muestre.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número entero que desee que se muestre por pantalla");
		int numero = sc.nextInt();
		System.out.println("El número introducido es el " + numero);
		sc.close();
	}

}
