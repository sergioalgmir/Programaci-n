package secuenciales;
import java.util.Scanner;

/**
 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante 
 * escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. 
 * La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), 
 * pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). 
 * Por ejemplo, para un lanzamiento de 12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm.
 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros
 */
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la distancia alcanzada en su lanzamiento (en metros):");
		double distancia = sc.nextDouble();
		double distanciaCm = distancia*100; // Esta operación convierte los metros introducidos en centímetros.
		int parteEntera = (int) (distanciaCm); //Esta variable se queda solo con la parte entera de distanciaCm.
		System.out.println("Para el ranking se tendrá en cuenta una distancia de " + parteEntera + " centímetros.");
		sc.close();

	}

}
