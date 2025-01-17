package bucles;
import java.util.Scanner;

/**
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora, minutos y segundos, 
 * así como cuántos segundos se desea incrementar la hora introducida. 
 * La aplicación mostrará la nueva hora.
 * 
 * @param hora - Varibale tipo int que almacena el valor que el usuario introduce para la hora.
 * @param minuto - Varibale tipo int que almacena el valor que el usuario introduce para los minutos.
 * @param segundo - Varibale tipo int que almacena el valor que el usuario introduce para los segundos.
 * @param incremento - Varibale tipo int que almacena los segundos que el usuario quiere incrementar a la hora actual.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa incrementará la hora en la cantidad que usted quiera.");
		System.out.println("Introduzca la hora que marca su reloj:");
		int hora = sc.nextInt();
		System.out.println("Introduzca el minuto que marca su reloj:");
		int minuto = sc.nextInt();
		System.out.println("Introduzca el segundo que marca su reloj:");
		int segundo = sc.nextInt();
		System.out.println("Introduzca la cantidad de segundos que quiere añadir a la hora actual:");
		int incremento = sc.nextInt();
		
		segundo+=incremento; // Sumo el incremento a los segundos actuales
		
		while (segundo >=60) { // Si los segundos superan 60, se añade un minuto y se reinician los segundos a 0.
			minuto+=1;
			segundo-=60;
			}
		
		while (minuto>=60) { // Si los minutos superan 60, se añade una hora y se reinician los minutos a 0.
			hora+=1;
			minuto-=60;
			}
		while (hora>=24) { // Si las horas superan 24, se vuelve a empezar a contar desde 0.
			hora-=24;
		}
	
		sc.close();
		System.out.println("La nueva hora es: " + hora + ":" + minuto + ":" + segundo);

	}

}
