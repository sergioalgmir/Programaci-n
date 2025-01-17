package secuenciales;
import java.util.Scanner;

public class Ejercicio3 {
//	Escribir una aplicación que pida el año actual y el de nacimiento del usuario. 
//	Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa le mostrará su edad actual.");
		System.out.println("Introduzca el año actual:");
		int anyoActual = sc.nextInt();
		System.out.println("Introduzca el año en el que nació:");
		int anyoNacer = sc.nextInt();
		System.out.println("Su edad actual es " + (anyoActual - anyoNacer) + " años.");
		sc.close();
	}
	
	

}
