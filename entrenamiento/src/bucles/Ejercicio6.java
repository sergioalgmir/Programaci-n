package bucles;

import java.util.Scanner;

/**
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n.
 * 
 * @param - Variable tipo int que guarda el número de líneas que el usuario quiere que tenga la pirámide.
 * @param asterisco - Variable tipo string que guarda los "*" con los que construimos la pirámide.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la base del triángulo:");
		
		int n = sc.nextInt();
		String asterisco="* ";
		
		
		for(int i =1; i<=n; i++) { //Iteramos cada línea
		    System.out.printf("%" + (n - i + 1) + "s", ""); //Indicamos el número de espacios que debe tener cada línea.
			for(int j = 1; j<=i; j++) {
				System.out.print(asterisco); //Imprimimos el número de asteriscos correspondientes a cada línea.
			}
			System.out.println(); // Imprimimos un salto de línea para iteración.
			
			
		} sc.close();

	}

}
