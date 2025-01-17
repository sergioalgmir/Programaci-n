package secuenciales;
import java.util.Scanner;

/**
 * Solicita al usuario tres distancias:

La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Este programa es capaz de calcular una distancia en centímetros a partir de tres distancias dadas en diferentes unidades de medida.");
		System.out.println("La primera medida se tomará en milímetros. Por favor, introduzca el número de mm que desee:");
		double mm = sc.nextDouble();
		System.out.println("La segunda medida se tomará en centímetros. Por favor, introduzca el número de cm que desee:");
		double cm = sc.nextDouble();
		System.out.println("La tercera medida se tomará en metros. Por favor, introduzca el número de m que desee:");
		double m = sc.nextDouble();
		
		double conversorMm = mm/10;
		double conversorMetros = m*100;
		
		System.out.println(mm + " milímetros, " + cm + " centímetros y " + m + " metros suman un total de " + (conversorMetros+conversorMm + cm) + " centímetros.");
		
		sc.close();



	}

}
