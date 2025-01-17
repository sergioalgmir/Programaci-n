package secuenciales;
import java.util.Scanner;

/** Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario). 
 * El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera) 
 * y como se usa en el expediente académico (con decimales).
*/
public class Ejercicio12 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular la media final de la asignatura de programación.");
		System.out.println("Introduca la nota (número entero) del primer trimestre:");
		int nota1trimestre = sc.nextInt();
		System.out.println("Introduca la nota (número entero) del segundo trimestre:");
		int nota2trimestre = sc.nextInt();
		System.out.println("Introduca la nota (número entero) del tercer trimestre:");
		int nota3trimestre = sc.nextInt();
		
		int notaBoletin = (nota1trimestre + nota2trimestre + nota3trimestre) / 3;
		double notaExpediente = (double) (nota1trimestre + nota2trimestre + nota3trimestre) / 3;
		System.out.println("La nota de programación en su expediente es " + notaExpediente + ".");
		System.out.println("En el boletín aparecerá como un " + notaBoletin + ".");
		sc.close();
		
	}
	

}
