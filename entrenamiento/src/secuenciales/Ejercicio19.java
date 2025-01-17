package secuenciales;
import java.util.Scanner;




/**
 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
 */

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la cantidad de segundos que desee:");
		long segundos = sc.nextInt();
		
		long minutos = segundos / 60;
		long restoSegundos = segundos % 60;
		long horas = minutos / 60;
		long restoMinutos = minutos % 60;
		
		System.out.println(segundos + " segundos son " + horas + " horas, " + restoMinutos + " minutos y " + restoSegundos + " segundos.");
		sc.close();
		

	}

}
