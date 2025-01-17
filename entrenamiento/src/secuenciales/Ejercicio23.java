package secuenciales;
/**
 * Solicita al usuario un número real y calcula su raíz cuadrada. 
 * Implementa el programa utilizando el nombre cualificado de las clases, en lugar de utilizar ninguna importación.
 */

public class Ejercicio23 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Introduzca el número al que quiere que se le realice la raíz cuadrada");
		double numero = sc.nextDouble();
		double raiz= java.lang.Math.sqrt(numero);
		
		System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
		sc.close();

	}

}
