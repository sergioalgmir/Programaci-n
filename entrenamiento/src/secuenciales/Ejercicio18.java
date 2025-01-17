package secuenciales;
import java.util.Scanner;


/**
 * Dado el siguiente polinomio de segundo grado: y = ax2 + bx + c
 * Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Vamos a resolver una ecuación de segundo grado: ");
		System.out.println("Introduzca los coeficientes a, b y c, por favor");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double radicando = b*b - 4*a*c;
		double raiz = Math.sqrt(radicando);
		double solucion1 = (-b + raiz) / (2*a);
		double solucion2 = (-b - raiz) / (2*a);
		
		if (radicando <0) {
			System.out.println("La ecuación no tiene solución real");
		} else if (radicando == 0) {
			System.out.println("La ecuación tiene una solución doble que es " + solucion1);
			
		} else {
			System.out.println("La ecuación tiene dos soluciones: " + solucion1 + " y " + solucion2);
		}
		sc.close();
	}

}
