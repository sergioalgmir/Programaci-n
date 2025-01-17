package secuenciales;
import java.util.Scanner;

public class Ejercicio6 {
	
//	Diseñar una aplicación que calcule la longitud y el área de una circunferencia. 
//	Para ello, el usuario debe introducir el radio (que puede contener decimales). Recordamos que  Longitud = 2*PI*radio y Área = PI*radio2
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Vamos a calcular la longitud y el área de una circunferencia:");
		System.out.println("Introduzca su radio en metros");
		double radio = sc.nextDouble();
		final double PI = 3.141592;
		double longitud = 2 * PI * radio;
		double area = PI * radio * radio;
		System.out.println("La longitud de la circunferencia es " + longitud + " metros, y su área es " + area + " metros cuadrados.");
		sc.close();
	}

}
