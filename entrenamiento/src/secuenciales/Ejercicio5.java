package secuenciales;
import java.util.Scanner;

//Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la media puede contener decimales.

public class Ejercicio5 {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Vamos a calcular la media aritmética de dos notas enteras:");
		System.out.println("Introduzca la primera nota");
		int nota1 = sc.nextInt();
		System.out.println("Introduzca la segunda nota");
		int nota2 = sc.nextInt();
		double notaMedia = (double) (nota1 + nota2)/2;
		System.out.println("La media de las dos notas es " + notaMedia);
		sc.close();
	}

}
