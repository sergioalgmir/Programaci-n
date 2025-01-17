package secuenciales;
import java.util.Scanner;
//Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su edad, por favor:");
		int edad = sc.nextInt();
		
		if (edad >= 18) {
			System.out.println("Usted es mayor de edad.");
		} else { System.out.println("Usted es menor de edad.");}
		
		sc.close();
		
		
		
		
	}

}
