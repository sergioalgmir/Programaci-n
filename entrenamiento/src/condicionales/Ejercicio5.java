package condicionales;
import java.util.Scanner;

/**
 * Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo. 
 * Deberá mostrarse su área, comprobando que lo números introducidos por el usuario no son negativos, algo que no tendría sentido.
 * 
 * @param sc - Crea un objeto de tipo Scanner para recoger los datos que el usuario introduzca por teclado.
 * @param base - Variable tipo double que almacena el valor que el usuario introduzca por pantalla.
 * @param altura - Variable tipo double que almacena el valor que el usuario introduzca por pantalla.
 * @param area - Variable tipo double que almacena el valor resultante de calcular el área del triángulo.
 * @author Sergio
 */

public class Ejercicio5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la base del triángulo en metros:");
		double base = sc.nextDouble();
		System.out.println("Introduzca la altura del triángulo en metros:");
		double altura = sc.nextDouble();
		
		if (base<0 || altura <0) {
			System.out.println("Ni la base ni la altura pueden ser números negativos.");
			
		} else {
			double area = (base*altura/2);
			System.out.println("el área del triángulo es " + area + " metros.");
		} sc.close();
		
	}
}
