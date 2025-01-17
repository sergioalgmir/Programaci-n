package secuenciales;
import java.util.Scanner;

public class Ejercicio2 {
	
//	Pedir al usuario su edad y mostrar la que tendrá el próximo año.
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad actual");
		int edad = sc.nextInt();
		System.out.println("El próximo año usted tendrá " + (edad + 1) + " años.");
		sc.close();
	}
	

}
